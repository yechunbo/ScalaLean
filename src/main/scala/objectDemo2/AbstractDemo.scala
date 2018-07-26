package objectDemo2

abstract class AbstractDemo {
    val name : String
    var id : String

    // 定义一个没有实现的抽象方法
    def abs1 : String
    // 定义一个非抽象方法
    def abs2(name : String) : String = s"Hello $name"
}

class AbsDemo extends AbstractDemo {
  override val name = "Tom"
  override var id = "12345"
  // 重写超类的方法可以不用override关键字
  def abs1 = "Hello abstract ...."
  // 重写超类的非抽象方法必须得加override
  override def abs2(name: String): String = super.abs2(name)
}

object AbsDemo{
  def main(args: Array[String]): Unit = {
    val demo = new AbsDemo()
    println("id: " + demo.id + ",name: " + demo.name )

    println(demo.abs1)

    println("调用父类的abs2方法：" + demo.abs2(demo.name))
  }
}