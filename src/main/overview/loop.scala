package overview

object loop {
  def whileLoop(): Unit = {
    // 局部变量
    var a = 10;

    // while 循环执行
    while (a < 20) {
      println("Value of a: " + a);
      a = a + 1;
    }
  }

  def doWhileLoop(): Unit = {
    // 局部变量
    var a = 10;

    // do 循环
    do {
      println("Value of a: " + a)
      a = a + 1;
    } while (a < 20)
  }


  /**
   *  i to j 语法(包含j)
   */
  def forLoop1(): Unit = {
    var a = 0;
    // for 循环
    for (a <- 1 to 10) {
      println("Value of a: " + a)
    }
  }

  /**
   *  i until j 语法(不包含j)
   */
  def forLoop2(): Unit = {
    var a = 0;
    // for 循环
    for (a <- 1 until 10) {
      println("Value of a: " + a)
    }
  }

  /**
   * 双重循环，输出9次
   */
  def forloop3(): Unit = {
    var a = 0;
    var b = 0;
    // for 循环
    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a)
      println("Value of b: " + b)
    }
  }

}

