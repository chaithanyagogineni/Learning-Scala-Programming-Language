//Problem 29 in Project Euler
//Implemented in scala

//Since set doesn't allow duplicates,use this data structure
var set = scala.collection.mutable.Set[Double]()
for(a<- 2 to 100)
{
  for(b<- 2 to 100)
  {
    set+=Math.pow(a,b)
  }
}
//Printing the size of set
println(set.size)