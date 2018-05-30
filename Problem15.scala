//Problem 15 in Project Euler
//Implemented in scala

var grid = Array.ofDim[BigInt](21,21)
for(i<- 0 to 20)
{
grid(i)(20)=1
grid(20)(i)=1
}
for(i<-(0 to 19).reverse)
{
for(j<-(0 to 19).reverse)
{
grid(i)(j) = grid(i+1)(j)+grid(i)(j+1)
}
}
println(grid(0)(0))
