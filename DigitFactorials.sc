//Problem 34 in project euler
//Implemented in scala


//Function to get the factorial of number
def getFact(number:Int):Int={
  var res=1
  for(i<- 1 to number)
  {
    res*=i
  }
  res
}
var limit=7*getFact(9)
var sum=0
var partial_sum=0

//Check every number until limit and check whether sum of factorials of individual numbers is same as number

for(i<- 10 to limit)
{
  var copy_number=i
  partial_sum=0
  while(copy_number>0)
  {
    partial_sum+=getFact(copy_number%10)
    copy_number=copy_number/10
  }
  if(partial_sum==i)
    sum+=i
}
//Printing the result
println(sum)