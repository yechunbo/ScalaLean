package objectDemo2

class ExtendDemo {

}

class Person2(){
  val name : String = "HeHe"
  val age = 30

  def m1(age : Int) : Boolean = {
     if (age > 20) true
     else false
  }

  def m2(name : String) : String = name match {
    case "HeHe" => {
      println(s" Name is $name")
      name
  }
    case "BoBo" => {
    println(s" Name is $name")
    name
    }
    case _ => {
      println(s"Name of $name is nothing match ")
      "Nothing"
    }
  }
}

class Student(sex:String) extends Person2 {
  override val name : String = "BoBo"
  override val age: Int = 20
  // 继承父类的方法
  override def m1(age: Int): Boolean = super.m1(age)
  // 重写父类的方法
  override def m2(name : String) : String ={
    s"The student of name is $name and sex is $sex"
  }

  // 编写自身的方法
  def m3(age : Int): String ={
    if(age < 50)
      s"$name is young ..."
    else if(age > 60)
      s"${name}is old man ..."
    else
      "I don't match ....."
  }
}

object Student{
  def main(args: Array[String]): Unit = {
    val student = new Student("woman")
    println(student.m1(22))
    println( student.name + " is " + student.age )
    println(student.m2(student.name))
    println(student.m3(40))
  }
}
