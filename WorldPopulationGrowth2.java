
public class WorldPopulationGrowth2{
public static void main(String... args){
long currentPopulation = 78000000000L;
double growthRate = 1.05;

System.out.println("Year\tPopulation\tIncrease");
for(int year = 1; year <= 75; year++){
double population = (long) (currentPopulation) * Math.pow(growthRate, year);
double increase = population - currentPopulation;

System.out.println(year+ "\t" +population+ "\t" +increase);

}
}
}