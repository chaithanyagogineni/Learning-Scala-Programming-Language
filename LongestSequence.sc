//Problem 14
//Implemented in scala
//Which starting number, under one million, produces the longest chain?


//Function that determines the number of terms of particular number
def numTerms(k:BigInt,res:BigInt):BigInt ={
  if(k==1)
  {
    res
  }
  if(k%2==0)
  {
    numTerms(k/2,res+1)
  }
  else
  {
    numTerms((3*k)+1,res+1)
  }
}

//Iterate through all the numbers until 1000000 and find the number with maximum sequence
var current_result:BigInt=0
var temporary_result:BigInt=0
var number_max_sequence=0
for(i<- 1 to 1000000)
{
  temporary_result=numTerms(i,1)
  if(temporary_result>current_result)
    {
      current_result=temporary_result
      number_max_sequence=i
    }

}
//Print the result
number_max_sequence
