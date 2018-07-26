package scalaBasic

object StringDemo {
  def main(args: Array[String]): Unit = {
//    stringSplit("aa|bb|cc|dd")
    val a = "a1231dd"
    println(a.reverse)
    println(a.contains("123"))
    println(a.indexOf("d"))
    println(a.replace("23","99"))
    println(a.equalsIgnoreCase("A1231Dd"))
    println(a.length)
    println(a.equals("a1231dd"))


  }

  // 字符串切割
  def stringSplit(x:String) : Unit = {
   val a = x.split("\\|")
    for ( i <- a)
    println(i)
  }

}
