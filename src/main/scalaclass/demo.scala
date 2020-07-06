package scalaclass


class demo(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点: " + x);
    println("y 的坐标点: " + y);
  }
}

object demo {
  val statisticDemo= new demo(0, 0)
  def apply(xc: Int, yc: Int): demo = new demo(xc, yc)
  def apply(): demo =statisticDemo
}

object testIn {
  def main(args: Array[String]): Unit = {
    // 使用apply可以少个new
    val d = demo(1, 2)
    d.move(1, 3)
    // 这样可以实现静态成员类
    val d2 = demo()
    d2.move(1,4)
    val d3 = demo()
    d3.move(2,4)
  }
}
