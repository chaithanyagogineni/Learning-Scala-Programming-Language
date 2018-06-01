//Problem 34 in project euler 
//Implemented in scala

def getFact(x:Int):Int={
var res=1
for(i<- 1 to x)
{
res*=i
}
res
}
var limit=7*getFact(9)
var sum=0
var partial_sum=0
for(i<- 10 to limit)
{
var k=i
partial_sum=0
while(k>0)
{
partial_sum+=getFact(k%10)
k=k/10
}
if(partial_sum==i)
sum+=i
}
println(sum)