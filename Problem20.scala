//Problem 20
//Implemented in scala
//Find the sum of the digits in the number 100!
def getSum(x:BigInt):BigInt=
{
var k = x
var sum:BigInt=0
var rem:BigInt=0
var ten:BigInt = 10
var zero:BigInt = 0
while(k>zero)
{
rem=k%ten
sum=sum+rem
k=k/ten
}
return sum
}

var fact:BigInt = 1
for(i<- 1 to 100)
{
fact*=i
}
print(getSum(fact))