package scalaBasic
/**
  * Scala 有函数和方法，二者在语义上的区别很小。Scala 方法是类的一部分，
  * 而函数是一个对象可以赋值给一个变量。换句话来说在类中定义的函数即是方法。
  */
object MethodAndFunctionDemo {
  //定义一个方法
  //方法m1参数要求是一个函数，函数的参数必须是两个Int类型,f9为传入的参数
  //返回值类型也是Int类型
  def m1(f9:(Int,Int) => Int) : Int = {
    f9(2,6)
  }

  //定义一个函数f1,参数是两个Int类型，返回值是一个Int类型
  val f1 = (x:Int,y:Int) => x + y

  //再定义一个函数f2
  val f2 = (m:Int,n:Int) => m * n

  //main方法
  def main(args: Array[String]): Unit = {
    //调用m1方法，并传入f1函数
    val r1 = m1(f1)

    println(r1)

    //调用m1方法，并传入f2函数
    val r2 = m1(f2)
    println(r2)
  }
}