/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author metan
 */
public class LabOnePart1 {
    public static void main(String[] args) {
// Declare Variables
        final double StateTaxPercentage = 0.04;
        final double CountyTaxPercentage = 0.02;
        double purchaseAmount;
        double countyTax;
        double stateTax;
        double totalTax;
        double totalSale;

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("{Please enter the purchase amount:  ");
        purchaseAmount = Keyboard.nextDouble();
        
        //calculate the taxes
        countyTax = CountyTaxPercentage * purchaseAmount;
        stateTax = StateTaxPercentage * purchaseAmount;
        
        //Calculate Total Tax'
        totalTax = stateTax + countyTax;
        
        //Calculate the total Sale
        totalSale = totalTax + purchaseAmount;
        
        //Display it all
        System.out.println("Purchase amount:  " +purchaseAmount + "\n State sales Tax: " + stateTax + "\n County Sales Tax: " + countyTax + "\n Total Sales Tax: " + totalTax + "\n Total Sale: " + totalSale);
        
        

    }
}

