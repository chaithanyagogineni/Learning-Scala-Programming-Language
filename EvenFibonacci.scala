//Sum of even valued terms in a fibonacci series with start value as 1

//Scala Solution

var sum =0
var a=1
var b=2
var c=a+b
while(c<=4000000)
{
a=b
b=c
c=a+b
if(c%2==0)
sum+=c
}
print(sum+2)