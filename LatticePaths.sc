//Problem 15 in Project Euler
//Implemented in scala

//Take array with one extra row and column as boundaries
var grid = Array.ofDim[BigInt](21,21)

//Set the boundaries to 1.
for(i<- 0 to 20)
{
  grid(i)(20)=1
  grid(20)(i)=1
}
//Iterate from boundaries and add the result to top
for(i<-(0 to 19).reverse)
{
  for(j<-(0 to 19).reverse)
  {
    grid(i)(j) = grid(i+1)(j)+grid(i)(j+1)
  }
}
//Final result will be stored in the start variable
grid(0)(0)
