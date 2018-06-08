//Problem 13
//Implemented in scala
//Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

import scala.io.Source
var filename = "C:\\Users\\User1\\Desktop\\Scala\\course era\\ProjectEuler\\src\\main\\scala\\LargeSum-input"

var input:Array[BigInt] = new Array[BigInt](100)
var each_line =0

//read each line from file to input array
for(line<-Source.fromFile(filename).getLines)
{
  input(each_line)=BigInt(line)
  each_line+=1
}
var sum:BigInt = 0
//Add each line into sum variable
for(k<- 0 to 99)
{
  sum+=input(k)
}
//Need to print only first 10 digits of sum.
print(sum.toString.slice(0,10))
