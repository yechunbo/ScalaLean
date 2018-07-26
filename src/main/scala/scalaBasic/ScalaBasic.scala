package scalaBasic

object ScalaBasic {
  def main(args: Array[String]): Unit = {
    //  0：Hello world ...
    //    println("Hello World.")

    //  1、函数的调用
    //    functionTest()

    //    val a = funTest(2, 30)
    //    println(a)
    stringDemo("hello")
  }

  /*1、函数的定义以及调用
  def:函数的标识符，
  functionTest:函数名，
  functionTest():括号中为函数变量，
  Unit:函数的返回类型，如果函数没有返回值，可以返回为 Unit，这个类似于 Java 的 void
  主要的不同是在Scala中可以有一个Unit类型值，也就是（），然而java中是没有void类型的值的。除了这一点，Unit和void是等效的;
  函数的调用：直接在main方法中引入则可*/
  def functionTest(): Unit = {
    // 变量的定义：
    // var 定义可变变量
    // val : 定义不可变变量，类似Java中的final
    // 注：scala 会自行推理出变量的类型
    // val 表明的是指引用不可变，并不是说他所修饰的值不可变
    var a = 1
    a = 3
    val b = 1
    println(a + "+" + b + "=" + (a + b)) // 返回：3+1=4
    println(a + "+" + b + "=" + a + b) // 返回的是字符串：3+1=31
  }

  /*  函数可以有返回值，这点与Java中的函数有点区别
    x,y ：分别为传的参数名，冒号后面的 String:为返回值类型*/
  def funTest(x: Int, y: Int): String = {
    if (x > y)
      return (x + y) + " " // return 可以不写
    else
      (y - x) + " "
  }


  // 2、StringBuilder
  def stringDemo(x: String): Unit = {
    var a = new StringBuilder
    a = a.append("bbb")
    a = a.append(",cccc")
    a = a.append("," + x)
    println("x:" + x)
    println("a:" + a)
  }

}


