//problem 17 in project euler
//Implemented in scala

//Sum of numbers from 1 to 9
var sum_nine=3+3+5+4+4+3+5+5+4
//Sum of numbers from 10 to 19
var sum_nineteen=3+6+6+8+8+7+7+9+8+8
//Sum of numbers from 20 to 99
var sum_ninetynine=((6+6+5+5+5+7+6+6)*10)+(sum_nine*8)

//Sum of total from 1 to 99
var total_ninetynine=sum_ninetynine+sum_nineteen+sum_nine

//Since 1 to 9 numbers occurs 100 times from 100 to 1000 and 1 to 99 occurs 9 times add both
var sum = (sum_nine*100)+(9*total_ninetynine)
//Hundred occurs 9 times
var hundred_number=7*9
//Hundred and occurs 99 * 9 times
var hundred_and_number=10*99*9
//Sum of Number digit counts after 99
sum=sum+hundred_number+hundred_and_number
//Since 1000 has 11 letters in it add 11 to result
print(sum+total_ninetynine+11)