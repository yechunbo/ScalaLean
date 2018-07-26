package functionDemo

/**
  * 偏应用函数
  * 指一个函数有n个参数, 而我们为其提供少于n个参数, 那就得到了一个部分应用函数。
  */
object PartialApplyFunc {
  def m1(x: Int, y: Int, z: Int) = x + y + z

  def m1x(y:Int, z:Int) = m1(10, y, z) // x已知

  def m1xy(z:Int) = m1(10, 20 ,z) // x,y 已知

  def main(args: Array[String]): Unit = {
    println(m1x( 2, 3))
    println(m1xy(30))
  }
}
