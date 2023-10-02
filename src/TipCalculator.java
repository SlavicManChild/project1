import java.util.Scanner;
import java.lang.Math;
// these are the input and math libraries needed to do scan.next() and math.round
public class TipCalculator{

    // this method unclutters the space that would be used for rounding each value
    public double rounding(double number){
        double new1 = number;
        new1 = new1 * 100;
        new1 = Math.round(new1);
        new1 = new1 / 100;
        return new1;
        // this works by multiplying by a hundred (then dividing by it)
        // so that when math round is used it actually rounds to the nearest cent rather than dollar

    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        TipCalculator tipCalculator = new TipCalculator();

        double totalCostBT = 0;
        double percentTip;
        double tipAmount;
        int peopleAmount;
        double totalCostAT;
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group");
        peopleAmount = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the percent tip (1 - 100)");
        percentTip = scan.nextInt();
        int originalPercentTip = (int) percentTip;
        percentTip /= 100;
        scan.nextLine();

        System.out.print("Enter the cost in dollars and cents, enter -1 to end and calculate:  ");
        double temp =  scan.nextDouble();
        scan.nextLine();
        // this while loop will run until termination by input of -1
        while(temp != -1){

            totalCostBT += temp;
            System.out.print("Enter the cost in dollars and cents, enter -1 to end and calculate:  ");
            temp =  scan.nextDouble();
            scan.nextLine();
        }
        tipAmount = totalCostBT * percentTip;
        totalCostAT = totalCostBT + tipAmount;
        double costPerPersonBT = totalCostBT / peopleAmount;
        double costPerPersonAT = totalCostAT / peopleAmount;
        double tipPerPerson = tipAmount / peopleAmount;


        totalCostBT = tipCalculator.rounding(totalCostBT);
        costPerPersonBT = tipCalculator.rounding(costPerPersonBT);
        costPerPersonAT = tipCalculator.rounding(costPerPersonAT);
        tipPerPerson = tipCalculator.rounding(tipPerPerson);
        tipAmount = tipCalculator.rounding(tipAmount);
        // this is where the rounding method gets called

        System.out.println("..................................................");
        System.out.println("Total bill before tip: " + totalCostBT);
        System.out.println("Total percentage tip: " + originalPercentTip + "%");
        System.out.println("Total tip: " + tipAmount);
        System.out.println("Total bill with tip: " + totalCostAT);
        System.out.println("Per person cost before tip: " + costPerPersonBT);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total cost per person: " + costPerPersonAT);
        // this is what gets printed




    }






}