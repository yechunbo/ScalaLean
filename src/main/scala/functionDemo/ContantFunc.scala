package functionDemo

object ConstantFunc {
  //将String类型转换成int
  implicit def tranStr2Int(str: String) = Integer.parseInt(str)
}
