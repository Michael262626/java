public class Clock{

	private int hours;
	private int minutes;
	private int seconds;

	public Clock(int hours, int minutes, int seconds){
	this.hours = hours;
	this.minutes = minutes;
	this.seconds = seconds;
	
	}
	public void setHours(int hours){
	this.hours = hours;
	if(hours < 0 || hours > 23){	
	System.out.print("invalid hours number");
	}
	else{
	this.hours = hours;
	}
	}

        public int getHours(){
	return hours;
	}

	public void setMinutes(int minutes){
	this.minutes = minutes;
	if(minutes < 0 || minutes > 59){
	System.out.print("invalid minute number");
	}
	else{
	this.minutes = minutes;
	}
	}

	public int getMinutes(){
	return minutes;
	}
	public void setSeconds(int seconds){
	this.seconds = seconds;
	if(seconds < 0 || seconds > 59) {
	System.out.print("invalid second number");
	}
	else{
	this.seconds = seconds;
	}
	}

	public int getSeconds(){
	return seconds;
	}

}

