package objectDemo

class ApplyAUpdateClassDemo {
  def apply(test: String): String = {
    println("进入apply方法...")
    test + " come in apply ..."
  }

  def unapply(arg: ApplyAUpdateClassDemo): Option[String] = {
    if (ApplyAUpdateObject == null)
      None
    else
      Some("Scala ....")
  }
}

object ApplyAUpdateClassDemo {

  def main(args: Array[String]): Unit = {
    val demo = new ApplyAUpdateClassDemo
    println(demo("test"))
  }
}
