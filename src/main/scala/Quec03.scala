object Quec03 {
  val myList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  def filterPrime(someList: List[Int]): List[Int] = {
    someList.filter(n => {
      var isPrime = true
      if (n <= 1) isPrime=false
      var i = 2
      while (i <= n / 2) {
        if (n % i == 0) isPrime = false
        i += 1
      }
      isPrime
    })
  }

  def main(args: Array[String]): Unit = {
    val primeNumbers = filterPrime(myList);
    println();
    println(primeNumbers);
  }
}
