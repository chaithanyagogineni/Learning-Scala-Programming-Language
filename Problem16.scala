//Problem 16
//Scala implementation
//What is the sum of the digits of the number 2 power 1000?

var x:BigInt = 1
for(i<- 1 to 1000)
{
x*=2
}
var temp = x.toString

var res=0
for(i<-0 to temp.length()-1)
{
res+=(temp.slice(i,i+1).toInt)
}
print(res)