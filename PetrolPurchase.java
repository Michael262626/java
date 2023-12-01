public class PetrolPurchase{

   private String location;
   private String typeOfPetrol;
   private int quantity;
   private double price;
   private double discountPrice;

   public PetrolPurchase(String location, String typeOfPetrol, int quantity, double price, double discountPrice){

   this.location = location;
   this.typeOfPetrol = typeOfPetrol;
   this.quantity = quantity;
   this.price = price;
   this.discountPrice = discountPrice;
   }
   
   public void setLocation(String location){
   this.location = location;
   }
   public String getLocation(){
   return location;
   }
   public void setTypeOfpetrol(String typeOfPetrol){
   this.typeOfPetrol = typeOfPetrol;
   }
   public String getTypeOfPetrol(){
   return typeOfPetrol;
   }
   public void setQuantity(int quantity){
   this.quantity = quantity;
   }
   public int getQuantity(){
   return quantity;
   }
   public void setPrice(double price){
   this.price = price;
   }
   public double getPrice(){
   return price;
   }

   public double getDiscountPrice(){
   double discountAmount = (discountPrice/100.0) * price;
   return discountAmount;
   }
    
   public double getPurchaseAmount(){ 
   double netAmount = (quantity * price) - discountPrice;
   return netAmount;
   }

   





}