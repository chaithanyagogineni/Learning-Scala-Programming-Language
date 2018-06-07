//Problem 2 in project euler
//implemented in scala


import scala.util.control.Breaks._

//function to get fibonacci series of nth number
def getFibonacci(first:Int,second:Int,index:Int):Int={
  if(index==0)
    first
  else if(index==1)
    second
  else
  {
    getFibonacci(first,second,index-1)+getFibonacci(first,second,index-2)
  }

}
//Get the fibonacci series until 4000000
var list_of_fibonacci:List[Int] = List()
breakable {
  for (i <- 0 to 1000) {
    if (getFibonacci(0, 1, i) >= 4000000)
      break
    list_of_fibonacci = list_of_fibonacci :+ (getFibonacci(0, 1, i))
  }
}
//filter the list to contain only even numbers
val list_of_fibonacci_even=list_of_fibonacci.filter(_%2==0)
//compute the sum of numbers in list
println(list_of_fibonacci_even.sum)



