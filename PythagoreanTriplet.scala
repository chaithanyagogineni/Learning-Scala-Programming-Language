import scala.util.control.Breaks._

def checkPythagoranTriplet(first:Int,second:Int,third:Int):Boolean={
  if((first*first)+(second*second)==(third*third)&&(first+second+third==1000))
    true
  else
    false
}

def getPythagoranProduct(limit: Int): Unit ={
  breakable{
    for (i <- 1 to limit) {
      for (j <- 1 to limit) {
        for (k <- 1 to limit) {

          if (checkPythagoranTriplet(i, j, k)) {
            println(i * j * k)
            break
          }
        }
      }
    }
  }
}
getPythagoranProduct(1000)