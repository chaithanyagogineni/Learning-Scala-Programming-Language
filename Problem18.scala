//Problem 18 in Project Euler
//Implemented in scala

import scala.io.Source
var filename="problem18-input.txt"

var temp =0 
var c=0
var num_lines=0
for(line<-Source.fromFile(filename).getLines){
num_lines+=1
}
var l:Array[Array[Int]] = new Array[Array[Int]](num_lines)
for(line<-Source.fromFile(filename).getLines){
var x=line.split(" +")
var a:Array[Int] = new Array[Int](x.length)
//println("length of array is"+a.length)
for(i<-0 to x.length-1)
{
a(i)=x(i).toInt
//println(x(i).toInt)
}
l(c)=a
c+=1
}
for(i<- (0 to l(c-1).length-2).reverse)
{
for(j<- 0 to i)
{
l(i)(j)+=Math.max(l(i+1)(j),l(i+1)(j+1))
}
}
println(l(0)(0)) 