package scalaclass


class VisitEachOther(var balance: Double = 0.0) {
  val id = VisitEachOther.getUniqNum()

  def addBalance(amount: Double): Unit = {
    balance += amount
  }
}

// VisitEachOther类的伴生对象 静态成员变量都可以在这里定义，静态方法也可以在这里定义
object VisitEachOther {

  // 这就是静态成员变量
  private var curAmountNum = 0

  def getUniqNum() = {
    curAmountNum += 1
    curAmountNum
  }
}

object Main {
  def main(args: Array[String]) {
    val vv = new VisitEachOther(10.0)
    vv.addBalance(20.3)
    print("account1 - id:" + vv.id + "  amount:" + vv.balance + "\n")

    val myAccount2 = new VisitEachOther(10.0)
    print("account2 - id:" + myAccount2.id + "  amount:" + myAccount2.balance)
  }
}
