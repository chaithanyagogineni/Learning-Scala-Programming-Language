//Problem 29 in Project Euler
//Implemented in scala
var set = scala.collection.mutable.Set[Double]()
for(i<- 2 to 100)
{
for(j<- 2 to 100)
{
set+=Math.pow(i,j)
}
}
println(set.size)