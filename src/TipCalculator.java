import java.util.Scanner;


public class TipCalculator{



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double totalCostBT = 0;
        int percentTip;
        double tipAmount;
        int peopleAmount;
        double totalCostAT;
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are im your group");
        peopleAmount = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the percent tip (1 - 100)");
        percentTip = scan.nextInt();
        percentTip /= 100;
        scan.nextLine();

        System.out.print("Please enter the cost of each individual item, to end and calculate please enter -1: ");
        System.out.println();
        temp =  scan.nextInt();
        while(temp != -1){

            totalCostBT += temp;
            System.out.print("Please enter the cost of each individual item, to end and calculate please enter -1: ");
            System.out.println();
            temp =  scan.nextInt();
            scan.nextLine();
        }
        tipAmount = totalCostBT * percentTip;
        totalCostAT = totalCostBT + tipAmount;
        double costPerPersonBT = totalCostBT / peopleAmount;
        double costPerPersonAT = totalCostAT / peopleAmount;
        double tipPerPerson = tipAmount / peopleAmount;


        System.out.println("..................................................");
        System.out.println("Total bill before tip: " + totalCostBT);
        System.out.println("Total percentage: " + percentTip);




    }






}