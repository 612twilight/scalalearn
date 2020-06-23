package overview

object ifelse {
  /**
   * 只有if
   */
  def singleIf(): Unit = {
    val x = 10

    if (x < 20) println("x < 20")
  }

  /**
   * if 和 else 组合
   */
  def ifAndElse(): Unit = {
    val x = 30

    if (x < 20) {
      println("x 小于 20")
    } else {
      println("x 大于 20")
    }
  }

  /**
   * scala语法格式
   */
  def ifAndElse2(): Unit = {
    val x = 30

    if (x < 20) println("x 小于 20")
    else println("x 大于 20")
  }

  /**
   * 多个if else
   */
  def ifElseIfElse(): Unit ={
    val x = 30

    if (x == 10) println("X 的值为 10")
    else if (x == 20) println("X 的值为 20")
    else if (x == 30) println("X 的值为 30")
    else println("无法判断 X 的值")
  }
}
