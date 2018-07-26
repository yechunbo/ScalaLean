package matchDemo

import scala.util.Random

/**
  *
  */
class MatchDemo {

}

/**
  * 匹配字符串
  */
object MatchStringDemo {

  def main(args: Array[String]): Unit = {
    val arr = Array("scala", "java", "c++", "python", "php", "c##")
    val name = arr(Random.nextInt(arr.length))
    println(name)
    name match {
      case "scala" => println("the parm is scala")
      case "java" => println("the parm is java")
      case "c++" => println("the parm is c++")
      case "php" => println("the parm is php")
      case "python" => println("the parm is python")
      case _ => println("nothing match ....") // 如果上面的都匹配不了，则匹配到这里
    }
  }
}

/**
  * 匹配类型
  */
object MatchTypeDemo {
  def main(args: Array[String]): Unit = {
    var tuple1 = (12, "string", 123.00, List("123"))
    val arr = Array(123, 12.11, "String", new MatchDemo, List("123"))
    val element = arr(Random.nextInt(arr.length))
    println(element)

    element match {
      case str: String => println(s"The type is String, str=$str")
      case int: Int => println(s"The type is Int, int=$int")
      case dou: Double => println(s"The type is Double, dou=$dou")
      case list: List[String] => println(s"The type is List, list=$list")
      case _ => println("Nothing is match ...")
    }
  }

}

/**
  * 匹配元组
  */
object MatchTuple {
  def main(args: Array[String]): Unit = {
    val tuple1 = ("aaa", 123, List(123))
    tuple1 match {
      case ("aaa", x, y) => println(s"The match is true ... x=$x and y=$y")
      case ("bbb", x, y) => println("The match is false ...") // 用于进行匹配的参数必须得一致
      case _ => println("Nothing is match ....")
    }
  }
}

/**
  * 匹配数组
  */
object MatchArray {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3)
    arr match {
      case Array(x, 2, y) => println(s"match is true x=$x and y=$y")
      case Array(1, x, y) => println(s"match is true x=$x and y=$y")
      case _ => println("Nothing is match ...")
    }
  }
}

/**
  * 在匹配模式中加入一些条件
  */
object MatchTest {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)
    for (i <- list)
      i match {
        case x if (i % 2 == 0) => println(s"the i=$x is even")
        case _ => println(s"the i=$i is odd")
      }
  }
}