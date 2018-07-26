package collection

/**
  * 类说明：Map的简单操作
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
//    createMap
    commonMethodOfMap
  }

  def createMap(): Unit = {
    // 创建空映射
    val map = scala.collection.mutable.Map[String, String]()
    map.put("test", "123412")
    println(map)

    val map1 = Map("aa" -> "Scala", "bb" -> "Java")
    println(map1)
    val map2 = map1 + ("cc" -> "C++")
    println(map2)

    val map3 : Map[String, String] = Map("aa" -> "Scala", "bb" -> "Java")
    println("map3: " + map3)
  }

  // Map 常用方法
  def commonMethodOfMap(): Unit = {
    import scala.collection.mutable
    val map1 = mutable.Map("aa" -> "Java")
    map1.put("bb" , "Java")
    map1.put("aa" , "C++")

    println("map1" + map1)
    println("get value by key: " + map1.get("aa"))

    map1.remove("aa")
    println("remove by key: " + map1)

    val map2:mutable.Map[String,Int] = mutable.Map()
    map2.put("one",1)
    map2.put("two",2)
    println(map2)

    if(map2.contains("one")) println(map2.get("one")) else println("the key of one is not exist ...")

    for (i <- map2.keys) println("key: " + i)
    for (i <- map2.values) println("values: " + i)
    // printf 的用法
    for ((k,v) <- map2) printf("Code is : %s and name is :%s\n",k,v)

    val map3 = map2.map(_._2 + 100)
    printf("map3: " + map3)
    val map4 = map2.map(_._1 + 100)
    printf("map4: " + map4)
  }
}
