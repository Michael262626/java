public class combineElements{
	public static  void main(String... args){

		String[] list1 = {"a", "b", "c"};
		String[] list2 = {"1", "2", "3"};

	Object[] combinedList = combineArrays(list1, list2);
	
	for(Object item : combinedList){
		System.out.print(item);
	}
}
public static Object[] combineArrays(String[] list1, String[] list2){
	Object[] combinedList = new Object[list1.length + list2.length];

	int maxLength = Math.max(list1.length, list2.length);
	int index = 0;
	for(int count = 0; count < maxLength; count++){
		if(count < list1.length){
			combinedList[index] = list1[count];
			index++;
		}
		if(count < list2.length){
			combinedList[index] = list2[count];
			index++;
		}
	}
	
		return combinedList;

	}
}