package objectDemo2

/**
  * scala 也是跟java一样单继承，但是可以with多个特质(物质类似java中的接口),
  * 特质编译成class后会变成跟java一样的接口
  * 引用多个特质则用多个with连接
  *特质可以单独被类继承，关键字也是用extends
  */
class ClassDemo {

}

/**
  * 特质
  */
trait Flyable {
  val distance: Int = 1000

  // 声明一个没有实现的方法
  def fight: String

  // 声明一个有实现的方法
  def fly: String = {
    "I can fly ...."
  }
}

trait Flyable2 {
  val runOfFly : Int = 30

  def runSpeek : String
}

/**
  * 抽象类
  */
abstract class Animal {
  // 声明一个没有赋值的属性
  val name: String

  // 声明一个没有实现的方法
  def run: String

  // 声明一个有实现的方法
  def climb: Unit = {
    println("I want to fly ...")
  }
}

class PersonD extends Animal with Flyable with Flyable2 {
  // 重写抽象类中的属性
  override val name = "BoBo"
  // 重写特质中的属性
  override val distance: Int = 8000
  // 重写抽象类中有实现的方法
  override def climb: Unit = super.climb
  // 特质中的属性必须得引入
  override val runOfFly: Int = 10
  // 物质中的方法必须得引入但不一定得实现
  override def runSpeek = ???

  // 重写抽象类中没有实现的方法
  override def run: String = {
     "I can run ..."
  }

  // 重写特质中有实现的方法
  override def fight: String = "Person fight ..."

  // 重写我特质中没有实现的方法
  override def fly: String = super.fly
}

object PersonD{
  def main(args: Array[String]): Unit = {
    val p = new PersonD
    println(p.climb)
    println(p.name + p.run)
    println(p.fight)
    println(p.fly + p.distance)
  }
}