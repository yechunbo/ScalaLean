package scalaBasic

object StructureDemo {
  def main(args: Array[String]): Unit = {
    // 1、for 循环
//    forTest()
//    jiuJiu
//    println("----------------")
//    guardTest()
//    forByTest()
    // 2、while
//    whileDemo()

    // 3、if
//    val a = ifDemo()
//    println(a)

//    forArray()
     val a =  for ( i<- 1 to 10) yield i * 10
       println(a)
  }


  // 1、for 循环
  def jiuJiu(): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(i + "*" + j + "=" + i * j + "\t")
      }
      println()
    }
  }

  // for 循环中使用by修饰
  def forByTest(): Unit = {
    for (i <- 1 to 9 by 2)
      println(i)
  }

  def forTest(): Unit = {
    for (i <- 1 to 9; j <- 1 to 9) {
      if (i == j)
        println(i * j)
    }
  }

  // for循环中使用守卫表达式
  def guardTest(): Unit = {
    for (i <- 1 to 9; j <- 1 to 9 if i == j) {
      println(i * j)
    }
  }

  def forArray(): Unit = {
    val array = new Array[String](3)
    array(0) = "aa"
    array(1) = "bb"
    array(2) = "cc"

    for (a <- array)
      println(a)
  }

  // 2、while
  def whileDemo(): Unit = {
    var a: Int = 1
    var sum = 0
    while (a <= 10) {
      sum = sum + a
      a = a + 1;
    }
    println(sum)
  }

  // 3、if 条件表达式,与Java的区别是可以当做表达式来用，可有返回值
  def ifDemo(): Int = {
    val a = 10
    if (a < 10)
      10
    else
      100
  }
}
