import java.util.Arrays;
import java.lang.System;
public class ReverseArrayElements{
	publlic int reverseElements(int []  num){
		int [] template = new int[num.length]
		for(int i= 0 , n = (num.length-); i < num.length, n >= 0; i++, n--}){
			template[i]=  num[n]; 
			}
		System.arraycopy(template, 0 , num , 0 , num.length)
		return num;
	}

}