package overview

object FunctionDef {

  /**
   * 无输入，无返回
   */
  def noReply(): Unit = {
    println("hello world!")
  }

  /**
   * 有输入，有返回
   * @param argument
   * @return
   */
  def hasReply(argument: Int): Int = {
    println("input argement:" + argument.toString)
    argument + 1
  }

  def main(args: Array[String]): Unit = {
    noReply()
    println(hasReply(10))
  }
}
