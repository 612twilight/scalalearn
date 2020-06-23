package overview

object closure {

  var factor = 3
  /**
   * 函数内访问函数外的变量
   */
  val multiplier = (i: Int) => i * factor

  def main(args: Array[String]) {
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))
  }

}
