package objectDemo2

/**
  * 样例类
  * 当一个类被声名为case class的时候，scala会帮助我们做下面几件事情：
  * 1 构造器中的参数如果不被声明为var的话，它默认的话是val类型的，但一般不推荐将构造器中的参数声明为var
  * 2 自动创建伴生对象，同时在里面给我们实现子apply方法，使得我们在使用的时候可以不直接显示地new对象
  * 3 伴生对象中同样会帮我们实现unapply方法，从而可以将case class应用于模式匹配，关于unapply方法我们在后面的“提取器”那一节会重点讲解
  * 4 实现自己的toString、hashCode、copy、equals方法
  * 除此之此，case class与其它普通的scala类没有区别
  */
class CaseDemo3 {

}

/**
  * 定义一个抽象的Person类
  */
abstract class Person

case class StudentCase(sSame: String, id: String) extends Person

case class TeacherCase(tName: String, id: String) extends Person

case class NothingCase() extends Person

object CaseDemo3 {
  def main(args: Array[String]): Unit = {
    val objects = Array(StudentCase("jhon", "110804"), TeacherCase("teacher", "123123"), NothingCase())
    val obj = objects(scala.util.Random.nextInt(objects.length))
    obj match {
      case StudentCase(name, id) => println(s"Student name is $name and id is $id")
      case TeacherCase(name, id) => println(s"Teacher name is $name and id is $id")
      case NothingCase() => println("Nothing can match ...")
    }
  }
}
