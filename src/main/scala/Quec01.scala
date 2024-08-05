object Quec01 {
  val myList:List[Int]=List(1,2,3,4,5,6,7,8,9,10);

  def filterEvenNumbers(someList:List[Int]): List[Int] = {
    someList.filter(n=>n%2==0)
    //n:Input Parameter;then function body;=>is the transformation symbol
  }

  def main(args:Array[String]): Unit = {
    val evenNumbers=filterEvenNumbers(myList);
    println();
    println(evenNumbers);
  }
}
