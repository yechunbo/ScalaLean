package scalaBasic

import scala.io.Source
import java.io.FileWriter

object FileDemo {
  def main(args: Array[String]): Unit = {
    writeFile
    readFile
  }

  /**
    * 读文件
    */
  def readFile(): Unit = {
    val file = Source.fromFile("D:\\IdeaProResource\\MobileNote\\test.txt")
    // 获取网页数据
    val webFile = Source.fromURL("http://blog.csdn.net/yizheyouye/article/details/49183265")
    val lines = file.getLines()
    for (line <- lines) println(line)

    val lines2 = webFile.getLines()
    for (line <- lines2)
      println(line)
  }

  /**
    * 写文件
    */
  def writeFile(): Unit = {
    //    val out = new FileWriter("D:\\IdeaProResource\\MobileNote\\test.txt") // 默认覆盖添加
    val out = new FileWriter("D:\\IdeaProResource\\MobileNote\\test.txt", false) // true为追加
    for (i <- 1 to 10) {
      out.write(i.toString + "\r\n")
      //      out.append(i.toString + "\r\n") // 查看源码发现底层调用的也是write方法
      out.flush()
      println(i)
    }
    out.close()
  }

}
