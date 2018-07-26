package matchDemo

class CaseDemo3 {

}

/**
  * 定义一个抽象的Person类
  */
abstract class Person

case class Student(name: String, id: String) extends Person

case class Teacher(nam: String, id: String) extends Person

case class Nothing() extends Person

object CaseDemo3 {
  def main(args: Array[String]): Unit = {
    val objects = Array(Student("jhon", "110804"), Teacher("teacher", "123123"), Nothing())
    val obj = objects(scala.util.Random.nextInt(objects.length))
    obj match {
      case Student(name, id) => println(s"Student name is $name and id is $id")
      case Teacher(name, id) => println(s"Teacher name is $name and id is $id")
      case Nothing() => println("Nothing can match ...")
    }
  }
}
