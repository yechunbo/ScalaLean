package collection

import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    createArr()
    mutableArray()
    methodArrayDemo()
  }

  // 1、定长数组，数组的创建
  def createArr(): Array[String] = {

    /*  创建数组的方式一：推荐使用这种
        设定长度，长度不可变但对应的数值是可变的，
        默认赋值为空，eg:string默认为null,int默认为0 。。。*/

    val a: Array[String] = new Array[String](2)
    // 创建数组的方式二：
    // val a = new Array[String](2)
    println(a.toBuffer)

    // 给数组赋值
    a(0) = "aa"
    a(1) = "bb"

    // 遍历数组:方式一
    for (str <- a)
      println("方式一：" + str)

    // 遍历数组:方式二
    for (i <- 0 to a.length - 1)
      println("方式二：" + a(i))

    // 方式二的另一种写法
    (0 to a.length - 1).foreach(i => println("--- 方式二：" + a(i)))


    // 遍历数组:方式三，foreach
    println("-----------foreach start ----------------")
    a.foreach((a1: String) => println(a1 + ' '))
    println("-----------foreach end ----------------:")

    // 修改数组的值
    a(0) = "hello"
    for (str <- a)
      println("after: " + str)

    // 创建数组的方式三： 这种方式报错了
    //val a = Array(1, 2)

    return a
  }

  // 2、可变数组
  def mutableArray(): Unit = {
    // 创建可变数组，前提得先import
    val arr = new ArrayBuffer[Int]();
    arr.append(21)
    arr.append(12)
    arr.append(3)
    arr.append(3)
    for (num <- arr)
      println(num)

    println("-------- sort after ---------")
    val arr2 = arr.sorted

    for (num <- arr2)
      println(num)

  }

  // 3、数组常用方法测试
  def methodArrayDemo(): Unit = {
    val arr = new ArrayBuffer[Int]();
    arr.append(21)
    arr.append(12)
    arr.append(83)
    arr.append(3)
    arr.append(93)
    arr.append(53)

    // 数组求和：
    println("数组求和：" + arr.sum)

    // 获取数组中最大的一个
    println("数组中最大值：" + arr.max)

    //mkString 把数组拼接成字符串
    println("mkString:" + arr.mkString)
    //mkString,可传入分割符进行分割， 把数组拼接成字符串
    println("mkString(parm):" + arr.mkString("#"))

    // 根据下标删除数据
    println("删除的数据：" + arr.remove(1))
    for (num <- arr) println(" remove(1) after: " + num)

    // 删除多个,查看源码知道，第一个参数为删除的起始位置，第二个参数为删除的个数
    arr.remove(1, 2)
    for (num <- arr) println("remove(1,2) after: " + num)


    // 插入数据
    arr.insert(3, 11, 22, 33)
    for (num <- arr) println("insert after: " + num)

    def inCreate = (i: Int) => i + 20

    println("inCreate(10): " + inCreate(10))
    val strB = arr.map(inCreate) // map 给每个数组中的数加上20
    println("before map:" + arr + " , after map:" + strB)

    val strS = arr.mkString("|") // 将数组转换成String并以分割符进行分割
    println("strS:" + strS)
  }

  // 4、多维数组
  def multiArrayDemo(): Unit = {
    //    定义2行3列数组
    //     var multiDimArr = new Array[Int](new Array[Int](1,2,3),new Array[Int](2,3,4))

    //    val mulArr = new Array[Int][Int](3)

  }
}
