//Problem 7 in Project Euler
//What is the 10001st prime number?
//Scala solution
import scala.util.control._
def checkPrime(x:Long):Boolean = {
for(i<-2 to x.toInt/2)
{
if(x%i==0)
return false
} 
return true
}
var count =1
var cur = 2
var loop = new Breaks
loop.breakable{
while(count<10002)
{
cur+=1
if(checkPrime(cur))
count+=1
if(count==10001)
loop.break
}
}
print(cur)