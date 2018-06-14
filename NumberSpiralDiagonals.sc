//Problem 28 in Project Euler
//implemented in scala

val limit=1001*1001
var res:BigInt=0
var start=1
var cur_diff=2
while(start<=limit)
{
  while(start<=(cur_diff+1)*(cur_diff+1))
  {
    res=res+start
    start=start+cur_diff
  }
  start=start-cur_diff
  cur_diff+=2
  start=start+cur_diff
}
print(res)