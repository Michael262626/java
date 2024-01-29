public class PrimeNumberInAMethod{
	public static void isPrimeNumbers(){
	for(int count = 1; count <= 10000; count++){
		int factor = 0;
		for(int index = 1; index <= count; index++) {
			if(count % index == 0){
				factor++;
			}
		}
			if(factor == 2){
				System.out.println(count);
			}
		}
	}

	public static void main(String... args) {
		isPrimeNumbers();
	}

}