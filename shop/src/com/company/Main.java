package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Product;
        int Quantity;
        float Price, Amount;
        Product = "7UP";
        Quantity = 5;
        Price = 1.25f;
        Amount = Quantity*Price;
        System.out.println("Product:"+Product);
        System.out.println("Quantity:"+Quantity);
        System.out.println("Price:"+Price);
        System.out.println("Amount:"+Amount);
        System.out.println("VAT:"+(Amount*21/100));

    }
}
