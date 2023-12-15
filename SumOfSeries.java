public class SumOfSeries{
public static void main(String...  args){

for(int num = 1; num<= 100; num++){
long sum = (long) num*(num+1)/2;
System.out.println(num+ "\t" +sum);
}
}
}