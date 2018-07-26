package functionDemo

/**
  * 高阶函数
  */
class HighOrderFun {
  def fun1(num: Int) : Int = num * num

  def fun2(f: (Int)) : Int = f + f
}

object HighOrderFun{
  def main(args: Array[String]): Unit = {
    val fun = new HighOrderFun
    println(fun.fun1(10))
    println(fun.fun2(fun.fun1(10)))
  }
}


