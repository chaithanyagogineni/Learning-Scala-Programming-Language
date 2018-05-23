
//the sum of all the multiples of 3 or 5 below 1000.
//Scala Soultion

var total = 0
for(i <- 1 to 999)
{
if(i%3==0||i%5==0)
{
total+=i
}
}
print(total)