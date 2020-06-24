package overview

object collection {

  def listCollection(): Unit = {
    // 字符串列表
    val site: List[String] = List("Runoob", "Google", "Baidu")

    // 整型列表
    val nums: List[Int] = List(1, 2, 3, 4)

    // 空列表
    val empty: List[Nothing] = List()

    // 二维列表
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
  }

  def setCollection(): Unit = {
    val site = Set("Runoob", "Google", "Baidu")
    val nums: Set[Int] = Set()

    println("第一网站是 : " + site.head)
    println("最后一个网站是 : " + site.tail)
    println("查看列表 site 是否为空 : " + site.isEmpty)
    println("查看 nums 是否为空 : " + nums.isEmpty)
  }

  def mapCollection(): Unit = {
    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println("colors 中的键为 : " + colors.keys)
    println("colors 中的值为 : " + colors.values)
    println("检测 colors 是否为空 : " + colors.isEmpty)
    println("检测 nums 是否为空 : " + nums.isEmpty)
  }

  def tupleCollection(): Unit = {
    val t = (4, 3, 2, 1)

    val sum = t._1 + t._2 + t._3 + t._4

    println("元素之和为: " + sum)
  }

  /**
   * Option 有两个子类别，一个是 Some，一个是 None
   * 如果值存在， Option[T] 就是一个 Some[T] ，如果不存在， Option[T] 就是对象 None
   */
  def optionCollection(): Unit = {
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")

    println("sites.get( \"runoob\" ) : " + sites.get("runoob")) // Some(www.runoob.com)
    println("sites.get( \"baidu\" ) : " + sites.get("baidu")) //  None
  }

  /**
   * Scala Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法。
   * 迭代器 it 的两个基本操作是 next 和 hasNext。
   * 调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态
   * 调用 it.hasNext() 用于检测集合中是否还有元素。
   * 让迭代器 it 逐个返回所有元素最简单的方法是使用 while 循环：
   */
  def iteratorCollection(): Unit = {
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext) {
      println(it.next())
    }
  }

}
