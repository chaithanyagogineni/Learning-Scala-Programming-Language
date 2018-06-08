//Problem 12
//Implemented in scala
//Function to get the number of factors of a number
def getFactors(number:Int):Int={
  var no_of_factors=0
  var start = 1
  while(start<=Math.sqrt(number))
  {
    if(number%start==0)
    {
      no_of_factors+=2
    }
    start+=1
  }
  if(Math.sqrt(number)*Math.sqrt(number)==number)
    no_of_factors-=1
  return no_of_factors
}


//check each triangle number and get the number of factors for that number
var start=1
var difference = 1
while(getFactors(start)<500)
{
  difference+=1
  start+=difference
}
//Print the number with factors greater than 500
print(start)

