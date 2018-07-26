package objectDemo

/**
  * scala 不像Java中有static 修饰静态类，scala通过object关键字实现单例对象
  */
object SingleDemo {
  private var demoId = 0

  def newDemoId() = {
    demoId += 1
    demoId
  }
}

object testSingleDemo {
  def main(args: Array[String]): Unit = {
    println("The demoId is:" + SingleDemo.newDemoId ) // 1
    println("The demoId is:" + SingleDemo.newDemoId ) // 2
    println("The demoId is:" + SingleDemo.newDemoId()) // 3
    println("The demoId is:" + SingleDemo.newDemoId()) // 4
  }
}

