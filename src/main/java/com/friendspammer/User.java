package com.friendspammer;

public class User {
   private   String ProductID;
   private   String ProductNaam;
   private   double quantity;
   private double totaalPrijs;

   public String getProductID() {
      return ProductID;
   }

   public void setProductID(String productID) {
      ProductID = productID;
   }

   public String getProductNaam() {
      return ProductNaam;
   }

   public void setProductNaam(String productNaam) {
      ProductNaam = productNaam;
   }

   public double getQuantity() {
      return quantity;
   }

   public void setQuantity(double quantity) {
      this.quantity = quantity;
   }

   public double getTotaalPrijs() {
      return totaalPrijs;
   }

   public void setTotaalPrijs(double totaalPrijs) {
      this.totaalPrijs = totaalPrijs;
   }
}
