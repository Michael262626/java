import java.util.Scanner;
public class MenstrualRevolution{
	private static String name;
	private static String gender;
	private static int age;
	private static int firstDay;
	private static int lastDay;
	public MenstrualRevolution(String name, String gender, int age, int firstDay, int lastDay){
	MenstrualRevolution.name = name;
	MenstrualRevolution.gender = gender;
	MenstrualRevolution.age = age;
	MenstrualRevolution.age
	}
	public static void setName(String name){
	MenstrualRevolution.name = name;
	}
	public static String getName(){
	return name;
	}
	public static void setGender(String gender){
	MenstrualRevolution.gender = gender;
	}
	public static void setAge(int age){
	MenstrualRevolution.age = age;
	}
	public static int getAge(){
	return age;
	}
	public static void setFirstDay(int firstDay){
	MenstrualRevolution.firstDay = firstDay;
	}
	public static int getFirstDay(){
	return firstDay;
	}
	public static void setLastDay(int lastDay){
	MenstrualRevolution.lastDay = lastDay;
	}
	public static int getLastDay(){
	return lastDay;
	}
	public static int getMenstrualFlowingPeriod(){
	int mensturalCheck =  getLastDay() - getFirstDay();
	return  mensturalCheck ;
	}
	

	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("To know about this app enter yes or no to proceed?");
	String response = scanner.next();
	int count = 0;
	do {
		if(!response.equalsIgnoreCase("yes")){
		System.out.println("To know about this app enter yes or no to proceed?");
		response = scanner.next();
		}
		else{
			count++;
		System.out.println("This app is to give you a brief knowledge about menstral cycle and hygiene. And also  lessens the myths and confusion around it.\nMenstrual Cycle\n" +
                        "A menstrual cycle begins when you get your period or menstruate. This is when you shed the lining of your uterus. This cycle is part of your reproductive system and prepares your body for a possible pregnancy. A typical cycle lasts between 24 and 38 days.\nMenstruation is the monthly shedding of the lining of your uterus. Menstruation is also known by the terms menses, menstrual period, menstrual cycle or period. Menstrual blood — which is partly blood and partly tissue from the inside of your uterus — flows from your uterus through your cervix and out of your body through your vagina.\nMenstruation is driven by hormones. Hormones are chemical messengers in your body. Your pituitary gland (in your brain) and your ovaries (part of your reproductive system) make and release certain hormones at certain times during your menstrual cycle.\n" +
                        "\n" +
                        "These hormones cause the lining of your uterus to thicken. This happens so that if a pregnancy would occur, an egg can implant into your uterine lining. Hormones also cause your ovaries to release an egg (ovulation). The egg moves down your fallopian tubes, where it waits for sperm. If a sperm doesn’t fertilize that egg, pregnancy doesn’t occur. The lining of your uterus breaks down and sheds. This is your period.");}
		}while(response.equalsIgnoreCase("yes")); 
	System.out.println("Enter continue");
	String click = scanner.next()
	if(click.equalsIgnoreCase(continue)){
	do{
		if(!response.equalsIgnoreCase("no")){
			System.out.println("To know about this app enter yes or no to proceed?");
			response = scanner.next();
		}

		else{
		System.out.println("Kindly enter your name!");
		String userName = scanner.next();
		setName(userName);
		
		System.out.println("Enter gender type!");
		String gender = scanner.next();
		if(!gender.equalsIgnoreCase("female")){
			System.out.println("This app is restricted only female are allowed to use this app.");
		}
		else{
		System.out.println("Enter your age: ");
		int userAge = scanner.nextInt();
		setAge(user age);
		if(age <= 8){
		System.out.println("You have to be  above  8 to experience your period")
		}
		else if(age >= 51){
			System.out.print("You have reached the stage of menopause.")
		}
		else if(age >= 8 || age <=  51){
		System.out.print("Enter the date it occured first and last?")
		int firstDay = scanner.nextInt();
		setFirstDay(firstDay);
		int last day = scanner.nextInt();
		setLastDay(lastDay);
		System.out.printf("Your next period will occur in the next: %d days", getMenstrualFlowingPeriod());		
		}
		}while(response.equalsIgnoreCase("no"));

		System.out.print("Do you feel any pains or you are not comfortable? ");
		String choice = scanner.next();
		do{
		if(!choice.equalsIgnoreCase("yes")){
		System.out.print("Do you feel any pains or you are not comfortable? enter yes or no ");
		choice = scanner.next();
		}
		else{
		System.out.print("To ease your menstrual cramps, your health care provider might recommend: Pain relievers. Over-the-counter pain relievers, such as ibuprofen (Advil, Motrin IB, others) or naproxen sodium (Aleve), at regular doses starting the day before you expect your period to begin can help control the pain of cramps.
\nOr local recommendations\n" + "Several herbal remedies, such as ginger, fennel, Chinese herbs, cinnamon, Pycnogenol, and peppermint, have been studied for treating dysmenorrhea (menstrual cramps). Despite promising results, the quality of the studies is generally poor and there is no clear proof that any of the herbal remedies help");
}}while(choice.equalsIgnoreCase("yes"));
	d0{
	if(!choice.equalsIgnoreCase("no"));{
		System.out.print("Do you feel any pains or you are not comfortable? enter yes or no ");
		choice = scanner.next();
		
	else{
		System.out.print("Thanks for your services\nFor more information please contact any physician, gynecologist, or a women's health clinic for assistance.")
	}}while(choice.equalsIgnoreCase("no"));}
		

		
	
	}
}

	