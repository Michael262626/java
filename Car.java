public class Car {

   private String model;

   private String year;

   private double price;
   
   private double discount;

   public Car(String model, String year, double price) {

   this.model = model;
   this.year = year;
  
   if(price <= 0) {
   	this.price = 0;
	} else {
		this.price = price;
	}
   }

   public void setModel(String model){
   this.model = model;
   }

   public void setYear(String year){
   this.year = year;
   }
   
   public void setPrice(double price){
   this.price = price;
   }

   public String getModel(){
   return model;
   }

   public String getYear(){
   return year;
   }
   public double getPrice(){
   return price;
   }

   public void setDiscount(double discount){
       this.discount = discount;
    }
   public double getDiscount(){
       return discount;
    }
   public double getDiscountPrice(){
   double percentageDiscount = price - (discount / 100.0) * price;
   return percentageDiscount;
   }

}