package collection

/**
  * 集合(set)是不重复元素的容器（collection）
  * 集合包括可变集和不可变集,默认为不可变集
  */

import scala.collection.mutable

object SetDemo {
  def main(args: Array[String]): Unit = {
    //    createSet
    commonMethodOfSet

  }

  // 1、集全set的创建及遍历
  def createSet(): Unit = {
    // 定长set
    val set1 = Set("Scala", "Java", "PHP", "Java")

    // set 的遍历
    for (str <- set1)
      println(str)

    // 可变set
    val set2 = mutable.Set("Scala", "Java", "PHP", "Java")
    set2 += "C++"
    set2 += "Python"
    println(set2)

  }

  // 2、Set 常用方法
  def commonMethodOfSet(): Unit = {
    val set1 = Set("Scala", "Java", "PHP")
    println("set1:" + set1)
    // set 之add 方法，+(elem1: A, elem2: A, elems: A*): HashSet[A]
    // Creates a new immutable hash set with additional elements, omitting duplicates.
//    val set2 = set1 + "Python2"
    val set2 = set1 + "Python" + "Flink"

    println("set2:" + set2)

    // ++ Creates a new set by adding all elements contained in another collection to this set, omitting duplicates.
//    val set3 = set1 ++ "C++"
    val set3 = set1 ++ set2
    println("set3:" + set3)

    // -- Creates a new $coll from this $coll by removing all elements of another
    val set4 = set3 -- set1
    println("set4:" + set4)

    import  scala.collection.mutable.HashSet
    val hashSet = new HashSet()
    // scala 如何给HashSet 赋值
    val hashSet2 = hashSet + "test1"
    println("hashSet2:" + hashSet2)

    import scala.collection.mutable.Set
    val set5 = Set("test1")
    set5.add("test2")
    set5.add("test3")

    println("set5: " + set5)

    // addString
    val set6 = set5.addString(new mutable.StringBuilder())
    println("set6:" + set6)

    val i = 1 to 10
    println(i)
  }
}
