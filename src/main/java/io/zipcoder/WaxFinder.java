package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
import java.util.Scanner;
public class WaxFinder {
    private Wax waxToFind;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp = input.nextInt();
        input.nextLine();
        System.out.println("Enter snow condition: ");
        String snow = input.nextLine();
        WaxFinder test = new WaxFinder(temp,snow);
        test.displayWax();
    }
    public WaxFinder(int temperature, String snowType){
        waxToFind = new Wax();
        createWax(temperature, snowType);

    }
    /*
    Yellow: (38 < Temp) Red: (31 < Temp <= 38) Violet: (26 < Temp <= 31) Blue: (18 < Temp <= 26)
    Green: (5 < Temp <= 18) White: (Temp <= 5)
     */
    public void createWax(int temp, String snowCondition){
        String color;
        String waxType;
        if(temp > 38){
            color = "Yellow";
        }else if(temp >31 && temp <=38){
            color ="Red";
        }else if (temp >26 && temp <=31){
            color = "Violet";
        }else if(temp >18 && temp <=26){
            color ="Blue";
        }else if(temp >5 && temp<=18){
            color = "Green";
        }else {
            color = "White";
        }
        if(color.equals("White") || color.equals("Yellow")){
            waxType = "Standard";
        }else if(snowCondition.equals("powder")){
            waxType = "Special";
        }else if(snowCondition.equals("firm")){
            waxType = "Standard";
        }else if(snowCondition.equals("crusty")){//Crusty
            waxType = "Extra";
        }else{
            waxType = "error";
        }
        waxToFind.setWaxGroup(color);
        waxToFind.setSnowCondition(waxType);
    }

    public Wax getWaxType(){return waxToFind;}

    public void displayWax(/*Wax waxObj*/){
        System.out.println("Wax Group: "+ waxToFind.getWaxGroup()+"\n"+"Wax Type: "+ waxToFind.getSnowCondition());
    }
}
