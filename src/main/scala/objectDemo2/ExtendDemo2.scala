package objectDemo2

class ExtendDemo2 {

}

abstract class PersonDemo(name : String, age: Int, salary : Int){

   def m1(salary : Int) : String = {
    if (salary < 5000)
      "A"
    else if ( 5000< salary && salary < 8000)
      "B"
    else if (8000 < salary && salary < 10000)
      "C"
    else
      "D"
  }

  def m2(name : String) : String = s"My name is $name"

}

class Student2(name : String, age: Int, salary : Int, sex: String) extends PersonDemo(name, age,salary) {
  override def m1(salary: Int): String = {
    salary match {
      case x if(x < 5000) => "AA"
      case x if(5000 < x && x < 8000) => "BB"
      case x if(8000 < x && x < 10000) => "CC"
      case _  => "DD"
    }
  }
}

object Student2{
  def main(args: Array[String]): Unit = {
    val stu = new Student2("BoBo", 27, 8500, "man")
    println(stu.m1(8500))

    println(stu.m2("BOBO"))
  }
}

