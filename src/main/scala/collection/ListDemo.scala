package collection

/**
  * 类说明：不同于Java的java.util.List，scala的List一旦被定义，其值就不能改变，因此声明List时必须初始化
  */
object ListDemo {
  def main(args: Array[String]): Unit = {
    //        createList()
    listCommonMethod()
        listConcat()
  }

  // 1、创建List方式一：
  def createList(): Unit = {

    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    // 创建List方式二，与上面这种方式一样的效果
    val days2 = List.apply("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    /*创建List方式三，
      Scala还定义了一个空列表对象Nil，
      借助Nil，可以将多个元素用操作符::串起来初始化一个列表*/
    val days3 = "Sunday" :: "Monday" :: "Tuesday" :: "Wednesday" :: "Thursday" :: "Friday" :: "Saturday" :: Nil

    println("------------------days------------------------")

    // 2、遍历数组
    for (elem <- days) {
      println(elem)
    }

    println("------------------days2------------------------")
    for (elem <- days2) {
      println(elem)
    }

    println("------------------days3------------------------")
    for (elem <- days3) {
      println(elem)
    }

    // Make a list element-by-element
    val when = "AM" :: "PM" :: List()

    // Pattern match
    days match {
      case firstDay :: otherDays =>
        println("The first day of the week is: " + firstDay)
      case List() =>
        println("There don't seem to be any week days.")
    }
  }

  // 2、list常用方法
  def listCommonMethod(): Unit = {

    /*Scala还定义了一个空列表对象Nil，
    借助Nil，可以将多个元素用操作符::串起来初始化一个列表
    注：通过 :: 该方式创建list 必须得借助Nil*/
    val listNum = 1 :: 22:: 22:: 22 :: 13 :: 9 :: Nil

    // 往list中添加数据常用的方法（+:）
    val listNum2 = 2 +: listNum

    println(" add num to listNum: " + listNum2)

    // 根据下标获取数据
    println("获取list的第三个值：" + listNum(2))

    // 通过 :: 符号给list追加数据,追加后生的是另一个list
    val newList = 9999 :: listNum
    println("listNum add after: " + newList)
    println("---------------")
    println("listNum: " + listNum)
    println("---------------")

    //   head 返回列表第一个元素
    //   tail 返回一个列表，包含除了第一元素之外的其他元素组合成的List
    println("get the first value: " + listNum.head + ",get the tail list: " + listNum.tail)

    println("get the list sum: " + listNum.sum)

    // 删除list中的前 n 位，当 n 大于list长度则返回空list集
    println(" drop list of index : " + listNum.drop(2))

    println("listNum mkString : " + listNum.mkString(","))

    // 符号(_) 代表获取每个值，取出每个值加100
    println(listNum.map(_ + 100).toString + "---------------- map ---------------- " + listNum.map(_ + 100) )

    // 过滤
    println(" ----- filter ------- : " + List(1, 2, 3, 4, 6, 7, 8, 9, 10) filter (_ % 2 == 0)) //取偶

    println("-------- index of : " + listNum.indexOf(22))

    println("-------- is exist : " + listNum.exists(_ == 22))

    println("-------- is find :" + listNum.find(_ == 22))

    println("-------- list length: " + listNum.length)

    // 去重
    println("distinct before: " + listNum + " ,listNum.distinct after: " + listNum.distinct)

  }

  // 3、List 的连接
  def listConcat(): Unit = {
    val list1 = List("one", "two", "three")
    val list2 = "zero" :: ("four" :: "five" :: "six" :: Nil)

    val list3 = list1 ::: list2
    println("list1 :: list2 is " + list3)

    val list4 = list1.:::(list2)
    println("list1 .::: (list2) is " + list4)

    val list5 = List.concat(list1, list2)
    println("List.concat(list1, list2) is " + list5)
  }

}
