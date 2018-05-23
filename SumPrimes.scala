//Problem 10 in Project Euler
//Find the sum of all the primes below two million.
//Scala Solution
def checkPrime(x:Long):Boolean={
for(i<-2 to Math.sqrt(x).toInt + 1)
{
if(x%i==0)
return false
} 
return true
}

var i=3
//Need to take sum as long variable because integer will not fit into it
var sum:java.lang.Long = 2
while(i<2000000)
{
if(checkPrime(i))
{
sum=sum+i
}
i+=1
}
print(sum)