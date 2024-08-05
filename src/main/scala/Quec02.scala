object Quec02 {
  val myList:List[Int]=List(1,2,3,4,5);

  def calculateSquare(someList:List[Int]): List[Int] = {
    someList.map(n=>n*n)
    //map:map each element of the list
  }

  def main(args:Array[String]): Unit = {
    val evenNumbers=calculateSquare(myList);
    println();
    println(evenNumbers);
  }
}

