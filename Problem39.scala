//Problem 39 in project euler
//Implemented in scala

var x=scala.collection.mutable.Map[Int,Int]()
for(i<- 1 to 998)
{
for(j<- 1 to 998)
{
for(k<- 1 to 998)
{
if(((i*i)==((j*j)+(k*k)))&&((i+j+k)<=1000))
{
if(x.keySet.exists(_ == (i+j+k)))
x(i+j+k)+=1
else
x(i+j+k)=1
}
}
}
}
println(x.maxBy(_._2))
