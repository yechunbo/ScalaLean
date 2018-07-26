package functionDemo

/**
  * 偏函数
  * PartialFunction[String, Int] 其中String为传入的参数类型，Int为返回的值类型
  */
object PartialFunctionDemo {
  def m1: PartialFunction[String, Int] = {
    case "one" => {
      println("case 1")
      1
    }
    case "two" => {
      println("case two")
      2
    }
    case _ => {
      println("case nothing ...")
      0
    }
  }

  /**
    * m2 其实是m1 的另一种表达方式，实现的效果是一样的
    *
    * @param str
    * @return
    */
  def m2(str: String): Int = str match {
    case "one" => {
      println("case 1")
      1
    }
    case "two" => {
      println("case two")
      2
    }
    case _ => {
      println("case nothing ...")
      0
    }

  }
}

object test {
  def main(args: Array[String]): Unit = {
    PartialFunctionDemo.m1("two")
    PartialFunctionDemo.m2("two")
    println(PartialFunctionDemo.m1.isDefinedAt("two")) // Checks if a value is contained in the function's domain. 偏函数内部是实现了这个方法的
  }
}
