package objectDemo

/**
  * 主构造器demo类
  * 主构造器的声明放在类名后面
  * 主构造器中val修饰的在伴生对象中不可修改，var修饰的可修改，
  * 没加修饰符的如下的age参数只能在本类中调用，默认为val修饰，如需在伴生对象中调用可通过在本类中定义对应的方法返回该属性值
  */
class StructDemo(val id: String, var name: String, age: Int) {
  private var address = ""
  println("调用了。。。" + age)

  // 定义一个供非本类调用的方法
  def getAge(): Int = {
    if (age > 30) 20 else 10
  }

  /**
    * 辅助构造器的名称为this，
    * 每个辅助构造器都必须调用一个此前已经定义的辅助构造器或主构造器
    * 一个类可以有多个辅助构造器
    */
  def this(id: String, name: String, age: Int, address: String) {
    this(id, name, age) // 辅助构造器第一行必须先调用主构造器
    this.address = address
  }
}

object StructDemo {
  def main(args: Array[String]): Unit = {
    val structDemo = new StructDemo("123", "hehe", 28)
    // structDemo.id = "1234" // val 修饰的不可修改
    println(structDemo.id + ",name:" + structDemo.name)
    structDemo.name = "bobo"
    println(structDemo.id + ",name:" + structDemo.name + ",age:" + structDemo.getAge())

    val hahaDemo = new StructDemo("123", "haha", 30, "I Love Scala ....")
    hahaDemo.name = "Hello"
    println(hahaDemo.id + ",name:" + hahaDemo.name + ",id:" + hahaDemo.id + ",address:" + hahaDemo.address)
  }

}

object testDemo {
  def main(args: Array[String]): Unit = {
    val structDemo = new StructDemo("123", "hehe", 28)
    // structDemo.id = "1234" // val 修饰的不可修改
    println("testDemo:" + structDemo.id + ",name:" + structDemo.name)
    structDemo.name = "bobo"
    println("testDemo:" + structDemo.id + ",name:" + structDemo.name + ",age:" + structDemo.getAge())
  }
}
