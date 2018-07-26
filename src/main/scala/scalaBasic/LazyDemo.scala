package scalaBasic

object LazyDemo {
  def main(args: Array[String]): Unit = {

  }

  /*2、 lazy ： 懒加载， scala 的关键字
   lazy 定义的变量叫惰性变量，会实现延迟加载。
惰性变量只以是不可变变量，且只有在调用惰性变量时，才会去实例化这个变量
*/
  def lazyTest(): Unit ={
    val a = "Hello Word"
    println(a)
  }
}
