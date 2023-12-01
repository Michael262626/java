public class PetrolPurchase1 {

public static void main(String[] args){

PetrolPurchase petrolpurchase = new PetrolPurchase("saboYaba", "diesel", 5, 500.0, 10.0);

System.out.printf("location is: %s%n", petrolpurchase.getLocation());

System.out.printf("Type of petrol is: %s%n", petrolpurchase.getTypeOfPetrol());

System.out.printf("Quantity is: %d%n", petrolpurchase.getQuantity());

System.out.printf("price is: %.2f%n", petrolpurchase.getPrice());

System.out.printf("discountPrice is: %.2f%n", petrolpurchase.getDiscountAmount());

System.out.printf("netAmount is: %.2f%n", petrolpurchase.getPurchaseAmount());






}

}

