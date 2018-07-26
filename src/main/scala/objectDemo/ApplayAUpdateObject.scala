package objectDemo

/**
  * 单例对象中apply方法的调用
  */
object ApplyAUpdateObject {

  def apply(x: String, y:String): String ={
     println(s"come in the apply method the parm is $x and $y")
     x + " and " + y
  }

}

object testApply{
  def main(args: Array[String]): Unit = {
    println(ApplyAUpdateObject("Scala","Java"))
  }
}
