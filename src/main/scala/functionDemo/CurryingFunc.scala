package functionDemo

/**
  * 柯里化
  * 官方语言：柯里化（Currying）是把接受多个参数的函数变换成接受一个单一参数(最初函数的第一个参数)的函数，
  * 并且返回接受余下的参数且返回结果的新函数的技术。
  * 例如：
  * scala> def add(x:Int)=(y:Int)=>x+y
  * 输出： add: (x: Int)Int => Int
  * scala> val result = add(1)
  * 输出：result: Int => Int = <function1>
  * scala> val sum = result(2)
  * sum: Int = 3
  */
object CurryingFunc {
  // 柯里化之前，接受两个参数
  def add(x: Int, y: Int) = x + y

  // 柯里化之后，第一次调用使用一个参数 x，返回一个函数类型的值，第二次使用参数y调用这个函数类型的值。
  def addCur(x: Int)(y: Int) = x + y

  def main(args: Array[String]): Unit = {
    println(add(1, 2))
    println(addCur(1)(2))
  }
}
