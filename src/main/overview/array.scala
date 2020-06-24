package overview

import Array._

object array {
  def handle(): Unit = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // 输出所有数组元素
    for (x <- myList) {
      println(x)
    }

    // 计算数组所有元素的总和
    var total = 0.0
    for (i <- 0 until myList.length) {
      total += myList(i);
    }
    println("总和为 " + total);

    // 查找数组中的最大元素
    var max = myList(0);
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }
    println("最大值为 " + max);
  }

  def multi_array(): Unit = {
    var myMatrix = ofDim[Int](3, 3)

    // 创建矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
  }
}

