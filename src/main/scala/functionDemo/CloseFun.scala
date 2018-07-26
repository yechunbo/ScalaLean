package functionDemo

/**
  * 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
  * 比如multiple函数的返回值依赖于factor这个变量
  */
object CloseFun {
  var factor = 3.9
  val multiple = (i: Int) => i * factor

  def main(args: Array[String]): Unit = {
    println(multiple(10))
  }

}
