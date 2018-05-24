//Problem 13
//Implemented in scala
//Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

import scala.io.Source
var filename = "problem13-input.txt"
var x:BigInt = 0
var a:Array[BigInt] = new Array[BigInt](100)
var i =0
for(line<-Source.fromFile(filename).getLines)
{
a(i)=BigInt(line)
i+=1
}
var res:BigInt = 0
for(k<- 0 to 99)
{
res+=a(k)
}
print(res.toString.slice(0,10))
