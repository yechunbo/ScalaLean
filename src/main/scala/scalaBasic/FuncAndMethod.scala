package scalaBasic

/*
* 方法与函数的区别
* method format:
* def methodName(param : DataType) : returnType = { method body}
*
* function format:
* val functionName = (param1 : DataType, param2 : DataType) => {function body}
* 或 def functionName = (param1 : DataType, param2 : DataType) => {function body}
*
* 1、函数与方法的区别不大
* 2、函数可有返回值，可做为参数直接传递，也有匿名匿名函数
* 3、函数的修饰符为 =>
* 函数存在的方便之处：当不方便修改方法时，可通过修改函数从而达到修改了方法，
* 如m1调用时，参数为不同的函数则返回结果跟函数相关
*
* */
object FuncAndMethod {

  /**
    * 定义函数f
    */
  val f = (x: Int, y: Int) => x * y

  /**
    * 定义函数f1
    */
  def f1 = (x: Int, y: Int) => x + y

  /**
    * 定义一个方法，传参为函数
    *
    * @param func
    */
  def m1(func: (Int, Int) => Int): Int = func(4, 6)

  def main(args: Array[String]): Unit = {
    //传入f函数调用方法m1
    val a = m1(f)
    println(a)

    // 传入f1函数调用方法m1
    val b = m1(f1)
    println(b)

    // 方法可通过调用下划线这个方法转变为函数
    val c = m1 _
    println(c) // <function1>
    println(c(f))
  }

}
