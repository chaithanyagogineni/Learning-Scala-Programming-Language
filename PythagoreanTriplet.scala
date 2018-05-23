//Problem 9 in Project Euler
//There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
//Scala solution
import scala.util.control._
var loop = new Breaks
loop.breakable{
for(i<-1 to 1000)
{
for(j<-1 to 1000)
{
for(k<-1 to 1000)
{
if((i<j&&j<k)&&((i*i)+(j*j)==(k*k))&&(i+j+k==1000))
{
print(i*j*k)
loop.break
}
}
}
}
}