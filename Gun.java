public class Gun{
	private String name;
	private int ammo;
	
	public Gun(String name, int ammo){
	this.name =name;
	this.ammo = ammo;
	}

	public static void shoot(){
	if(ammo > 0) {
	ammo -= 1;
	return "Firing" getName(); }
	else{
		return getName() "is out of ammo"
		}
	}
	public void getName(String name){
	return name;
	}
	public static void isEmpty(){
	return ammo == 0;
	}
	public static void reload(){
	ammo += 10;
	return "Realoading";
	}
	public  String setName(){
	this.name = name;
	}
	}


}