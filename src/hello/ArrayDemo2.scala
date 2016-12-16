package hello

object ArrayDemo2 {
  val array = new Array[Int](3)
  val array2 = new Array[Int](3)
  val array3 = new Array[Int](3)
  /**
   * 数组赋值操作1
   */
  def init1() {
    array(0) = 1
    array(1) = 2
    array(2) = 3
  }
  
  /**
   * 数组复制操作2
   */
  def init2() {
    array2.update(0, 4)
    array2.update(1, 5)
    array2.update(2, 6)
  }
  
  /**
   * 输出数据
   */
  def out(array: Array[Int]) {
    val length = array.length
    for (i <- 0 to length - 1) //注意此处的i循环. 完整的写法应该是: i <- 0. to (length - 1)
      println(array.apply(i)) //array.apply(i)==array(i)
  }
  
  def main(args: Array[String]) {
    out(array3)
    init1()
    out(array)
    init2()
    out(array2)
  }
}