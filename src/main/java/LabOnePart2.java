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
public class LabOnePart2 {
    public static void main(String[] args) {
 
        //input scanner
    Scanner sc = new Scanner(System.in);
 //get info from user
    System.out.print("Enter how many cookies you ate: ");
 
    int cookieCount = sc.nextInt();
 
    int servingSize = 40/10;
    int caloriesPerCookie = 300/servingSize;
    int totalCalories = cookieCount * caloriesPerCookie;
 
    System.out.println("Total calories consumed: " + totalCalories);
}
}