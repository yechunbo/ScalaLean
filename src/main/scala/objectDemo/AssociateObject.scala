package objectDemo

/**
  * 伴生对象
  * 1、在Java中，我们经常需要用到同时包含实例方法和静态方法的类，在Scala中可以通过伴生对象来实现。
  * 2、当单例对象与某个类具有相同的名称时，它被称为这个类的“伴生对象”。
  * 3、类和它的伴生对象必须存在于同一个文件中，而且可以相互访问私有成员（字段和方法）。
  * Scala源代码编译后都会变成JVM字节码，实际上，在编译上面的源代码文件以后，
  * 在Scala里面的class和object在Java层面都会被合二为一，class里面的成员成了实例成员，object成员成了static成员
  *
  */
class AssociateObject {
  private val name: String = "bobo"
  var id = 1000

  def test() = id * id

  println(s"name = $name") // 注：s后"$变量" 给字符串中设置变量的写法

  private def getName() = {
    if (name.equalsIgnoreCase("boBO")) "BOBO" else "COCO"
  }

}

object AssociateObject {
  def main(args: Array[String]): Unit = {
    val associateObject = new AssociateObject
    println("test(): " + associateObject.test())
    associateObject.id = 11111
    println("id: " + associateObject.id + ",name: " + associateObject.name)
    println("id: " + associateObject.id + ",name: " + associateObject.getName())
  }

}
