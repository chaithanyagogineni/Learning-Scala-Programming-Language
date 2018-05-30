//Problem 22 in project euler
//Implemented in scala

import scala.io.Source
def getCount(x:String):BigInt={
var res:BigInt=0
for(i<- x)
{
res+=(i.toInt-64)
}
res
}
var filename="problem22-input.txt"
var k = Array[String]()
for(i<- Source.fromFile(filename).getLines)
{
k=i.split(",")
}

for(i<-0 to k.length-1)
k(i)=k(i).stripPrefix("\"").stripSuffix("\"").trim

k=k.sorted

var finalres:BigInt = 0
var c:BigInt=1
for(i<- 0 to k.length-1)
{
c=(i+1)*getCount(k(i))
finalres+=c
}
println(finalres)