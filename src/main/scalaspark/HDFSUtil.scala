package scalaspark

import org.apache.hadoop.conf
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileStatus, FileSystem, Path}
import org.apache.spark.{SparkConf, SparkContext}

/**
 * 从spark系统理货区hdfs的路径
 */
object HDFSUtil {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setAppName("MyHDFSUtils")
    val sc = new SparkContext(sparkConf)
    val path = args(0)
    println(listDirPath(sc, path).mkString("\n"))
  }

  /**
   * 获得HDFS文件系统
   *
   * @param sc       SparkContext
   * @param filePath 文件路径 (String)
   * @return
   */
  private def getFileSystem(sc: SparkContext, filePath: String): FileSystem = {
    new Path(filePath).getFileSystem(new Configuration())
  }


  /**
   * 判断文件是否存在
   *
   * @param sc       SparkContext
   * @param filePath 文件路径 (String)
   * @return
   */
  def existsFile(sc: SparkContext, filePath: String): Boolean = {
    getFileSystem(sc, filePath).exists(new Path(filePath))
  }


  /**
   * 获取目录大小
   *
   * @param sc       SparkContext
   * @param filePath 文件路径 (String)
   * @return
   */
  def getDirSize(sc: SparkContext, filePath: String): Long = {
    val fs: FileSystem = getFileSystem(sc, filePath)
    fs.getContentSummary(new Path(filePath)).getSpaceConsumed
  }

  /**
   * 列出目录下文件绝对路径
   *
   * @param sc       SparkContext
   * @param filePath 文件路径 (String)
   * @return
   */
  def listDirPath(sc: SparkContext, filePath: String): Array[String] = {
    val fs = getFileSystem(sc, filePath)
    val fileStatus: Array[FileStatus] = fs.listStatus(new Path(filePath))
    fileStatus.map(status => {
      status.getPath.toString
    }
    )
  }

  /**
   * 列出目录下所有文件或者目录名
   *
   * @param sc
   * @param filePath
   * @return
   */
  def listDirNames(sc: SparkContext, filePath: String): Array[String] = {
    val fs = getFileSystem(sc, filePath)
    val fileStatus: Array[FileStatus] = fs.listStatus(new Path(filePath))
    fileStatus.map(
      status => {
        status.getPath.getName
      }
    )
  }

  /**
   * 删除HDFS路径
   *
   * @param filePath  文件或者目录路径
   * @param recursive 是否递归删除
   * @return
   */
  def deleteHDFSPath(filePath: String, recursive: Boolean = true): Boolean = {
    var flag = true
    val path = new Path(filePath)
    val fs = FileSystem.get(path.toUri, new Configuration())
    if (fs.exists(path)) {
      flag = fs.delete(path, recursive)
    }
    flag
  }

  /**
   * 创建HDFS目录，如果已存在就不创建
   *
   * @param filePath
   * @return
   */
  def makeHDFSDirs(filePath: String): Boolean = {
    var flag: Boolean = true
    val path = new Path(filePath)
    val fs = FileSystem.get(path.toUri, new conf.Configuration())
    if (!fs.exists(path)) {
      flag = fs.mkdirs(path)
    }
    flag
  }
}
