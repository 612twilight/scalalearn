package overview

object valORvar {
  def varTest(): Unit ={
    var mutables = "begin"
    mutables = "end"
    println(mutables)
  }

  def valTest(): Unit ={
    val immutables = "begin"
    println("你不能重新赋值immutables 比如 immutables = \"end\"")
    println(immutables)
  }

  def main(args: Array[String]): Unit = {
    varTest()
  }

}
