import java.util.Scanner;
public class CreditCardValidator{
	private static String creditCardNumber;
	private static int cardDigitLength;
public CreditCardValidator(String creditCardNumber, int cardDigitLength){
	CreditCardValidator.creditCardNumber = String.valueOf(creditCardNumber.length());
	CreditCardValidator.cardDigitLength = cardDigitLength;
}
public static void setCreditCardNumber(String creditCardNumber){
	CreditCardValidator.creditCardNumber = creditCardNumber;
}
public static String getCreditCardNumber(){
	return creditCardNumber;
}
public static String getCardType(){
	if((creditCardNumber.charAt(0))==('4')){
		return "VisaCards";
	}
	else if(creditCardNumber.charAt((0))==('5')){
		return "MasterCard";
	}
	else if(creditCardNumber.charAt((0))==('6')){
		return "DiscoverCards";
	}
	else if(creditCardNumber.charAt((0))==('3')+('7')){
		return "American";
	}
	else{
		return "Invalid Card";
	}
}
public static void setCardDigitLength(int cardDigitLength){
		CreditCardValidator.cardDigitLength = cardDigitLength;
}
public static int getCardDigitLength(){
	return cardDigitLength;
}

}

	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Hello, kindly enter card details to verify");
	String creditCardNumber = scanner.nextLine();
	setCreditCardNumber(creditCardNumber);
	int number = 0;
for(int index = creditCardNumber.length()-1; index>=0; index--){
int length = creditCardNumber.length();
setCardDigitLength(length);
	int digit = Character.getNumericValue(creditCardNumber.charAt(index));
		if((creditCardNumber.length()-index) % 2 == 0){
			digit *= 2;
			if(digit>9){
				digit = digit % 10 + digit/10;
			}
		}
	number += digit;
}
System.out.println("***************************************************");
System.out.println("**Credit Card Type:" +getCardType());
System.out.println("**Credit Card Number:" +creditCardNumber);
System.out.println("** Credit Card Digit Length: "+getCardDigitLength());
if (number%10 == 0){
System.out.println("** Credit Card Validity Status: Valid");
}
else{
	System.out.println("** Credit Card Validity Status: Invalid");
}
System.out.println("***************************************************");



}





}