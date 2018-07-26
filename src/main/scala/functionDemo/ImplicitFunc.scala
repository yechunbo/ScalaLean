package functionDemo

/**
  * 隐式转换函数
  * 定义：以implicit关键字声明
  * 作用：丰富现有类库的功能，对类的方法进行增强
  *
  * 隐式转换函数是指在同一个作用域下面，
  * 比如下面m1与m2函数在不进行转换之前只接收int类型，display默认只能接收string类型。
  * 当添加了隐式转换函数后，在对m1与m2传入类似数字模式的string类型时，
  * 则自动调用将string类型转换成int，也就是说隐式函数会被方法自动进行隐式调用。
  * 如下的display函数与其相关的隐式转换函数
  * 一个给定输入类型并自动转换为指定返回类型的函数，
  * 这个函数和函数名字无关，和入参名字无关，
  * 只和入参类型以及返回类型有关。注意是同一个作用域。
  *
  */

object ImplicitFunc {

  // 当只传入x参数时，则采用默认的y=10进行运算，如果传入两个参数则以传入的为参数为主
  def m1(x: Int)(implicit y: Int = 10) = x * y

  def m2(x: Int)(z: Int)(implicit y: Int = 5) = x + y + z

  // 定义一个接收string类型的函数
  def display(str: String) = println(str)

  def test2(a:String, b:String) = s"Hello $a and $b"

  // 对display方法进行隐式转换，让其可接受非string类型参数
  implicit def tranInt2Str(x: Int) = (x * x).toString

  implicit def tranBoolean2Str(b: Boolean) = if (b) "true" else "false"

  implicit def test(a:Int,b:Int) = a.toString + b.toString

  //将String类型转换成int
  //  implicit def tranStr2Int(str: String) = Integer.parseInt(str)

  //也可通过调用其他类中对应的方法，将String类型转换成int
  import ConstantFunc.tranStr2Int

  // 注意：像这里定义了一个将boolean类型的数据转换成str的函数，结果运行出错，那是因为上面也有同样效果的函数了，这时编译器会出现不知调用那个而抛出异常
  //  implicit def tranBoolean2Str2(b : Boolean) = if (b) "true" else "false"

  def main(args: Array[String]): Unit = {
    println("m1传一个参数：" + m1("2"))
    println("m1传两个参数：" + m1(10)(2))

    println(m2("10")(90))

    display(12) // 144
    val flag: Boolean = true
    display(flag) // true

    println(test2(1,2))
  }
}
