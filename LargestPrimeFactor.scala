//Problem 3
//What is the largest prime factor of the number 600851475143 ?
//Implemented in scala
import scala.util.control._
var loop = new Breaks
def checkPrime(x:Double):Boolean={
var k = x
if(x==2)
return true
for(i<- 2 to Math.sqrt(x).toInt)
if(x%i==0)
return false
return true
}
var num = 600851475143.0
//print(Math.sqrt(num).toInt)
loop.breakable
{
for(i<-(2 to Math.sqrt(num).toInt).reverse)
{
if(checkPrime(i)&&num%i==0)
{
print(i)
loop.break
}
}
}