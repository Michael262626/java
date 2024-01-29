public class PerfectNumber {
	public static void isPerfectNumber() {
	for(int count = 1; count <= 1000; count++){
		int sum = 0;
		for(int index = 1; index < count; index++) {
			if(count % index == 0){
				sum+=index;
			}
		}
			if(sum == count){
				System.out.printf("%d\n", sum);
			}
		}
	}
	public static void main(String... args) {
	isPerfectNumber();


	}
}

	
