//problem 17 in project euler
//Implemented in scala
var sum_nine=3+3+5+4+4+3+5+5+4
var sum_nineteen=3+6+6+8+8+7+7+9+8+8
var sum_ninetynine=((6+6+5+5+5+7+6+6)*10)+(sum_nine*8)

var total_ninetynine=sum_ninetynine+sum_nineteen+sum_nine


var sum = (sum_nine*100)+(9*total_ninetynine)
sum=sum+63+8910
print(sum+total_ninetynine+11)