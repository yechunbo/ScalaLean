package objectDemo

class Person {
  // val 修饰的变量是只读的，相当于java中的get方法
  val id: String = "1000"
  // var 相当于java中类同时拥有get/set 方法
  // _相当与给其设置了初始值, private 修饰的属性属于类的私有对象，只能在本类或者其伴生对象中访问
  var name: String = _

  // private[this] 修饰的为私有属性，只能在本类访问
  private[this] var sex = "man"

  private var age: Int = 25

}

// Person对应的伴生对象
object Person {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "hehe"
    p.age = 10
    println(p.id + ",name:" + p.name + ",age:" + p.age)
  }
}

object Test2 {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "hehe"
    println(p.name)
  }
}
