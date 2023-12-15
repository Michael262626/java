import java.util.Arrays;
public class ArrayTaskMax{
public int largest(int[] element){
int largest = 0;
for(int i = 0; i < element.length; i++){
largest = element[0];
if(element[i] > largest){largest = element[i];}
}
return largest;
}
}