public class Shuffling{
	public static int[] elements(int[] array) {
	double[] myList = new int[10];
		for(int count =myList.length - 1; count > 0; count--){
			int counter = (int) (Math.random()) * (count + counter);
			double temp = myList[count];
			myList[count] = myList[counter];
			myList[counter] = temp;																																		
			}
			return myList;

	}
}