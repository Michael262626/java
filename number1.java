number1 = int(input("Enter first integer: ")

number2 = int(input("Enter second integer: ")

number3 = int(input("Enter third integer: ")

int sum = number1 + number2 + number3
	print(f' {sum} is: sum)
int average = number1 + number2 + number3 / 3
	print(f' {average} is: average)
int product = number1 * number2 * number3
	print(f' {product} is: product)

if(number1 < number2 & number1 < number3)
	print(f' {smallest number} is: number1, number2, number1, number3)
if(number2 < number1 & number2 < number3)
	print(f' {smallest number} is: number2, number1, number2, number3)
if(number3 < number2 & number3 < number1)
	print(f' {smallest number} is: number3, number2, number3, number1)
if(number1 > number2 & number1 < number3)
	print(f' {largest number} is: number1, number2, number1, number3)
if(number2 > number1 & number2 > number3)
	print(f' {largest number} is: number2, number1, number2, number3)
if(number3 > number2 & number3 > number1)
	print(f' {largest number} is: number3, number2, number3, number1)