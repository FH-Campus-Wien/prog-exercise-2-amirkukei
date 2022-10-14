package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here

        Scanner num = new Scanner(System.in);
        int x = 1;
        System.out.println("number: " + x);
        float y = num.nextFloat();
        if ( y <= 0){
            System.out.println("No number entered.");
        }
        float highY = 0;
        while (y > 0){
            if (y > highY){
                highY = y;
            } x++;
            System.out.println("number: " + x);
            y = num.nextFloat();
        }
        System.out.println("The largest number is: " + highY);

    }




    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println("number: " + x);
        if ( x <= 0){
            System.out.println("Invalid number!");
        }
        int fl = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++){
                fl++;
                System.out.print(fl + " ");


            }
            //System.out.print(i);
        }

    }

    //todo Task 3
    public String printPyramid() {
        // input your solution here
        int rows = 6, k = 0;

        for (int i = 1; i <= rows; i++, k = 0) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
        }
        return null;
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner num = new Scanner(System.in);
        int h = num.nextInt();
        System.out.println("h: " + h);
        char c = num.next().charAt(0);
        System.out.println("c: " + c);
        if (h % 2 != 0) {

            for (int i = 0; i <= h / 2; i++) {
                for (int j = i; j < h / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0 - i; k <= i; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                System.out.println();

            }
            for(int i = h / 2; i > 0; i--){
               for(int j = i; j <= h / 2; j++){
                    System.out.print(" ");
                }
                for(int k = 0-i+1; k < i; k++){
                    System.out.print((char) (c - Math.abs(k)));
                }
                System.out.println();
           }
        }else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        int sum = 0, inputNum;
        int count5 =0;
        int counter;
        float mean;
        Scanner NumScanner = new Scanner(System.in);
        Scanner charScanner = new Scanner(System.in);

        System.out.println("Enter the total number of terms whose mean you want to calculate");

        counter = NumScanner.nextInt();

        System.out.println("Please enter " + counter + " numbers:");


        for(int x = 1; x<=counter;x++){
            inputNum = NumScanner.nextInt();
            if (inputNum <= 5 && inputNum > 0){
                sum = sum + inputNum;
                if (inputNum == 5){
                    count5++;
                }
            }
            else if(inputNum == 0){
                break;
            }
            else{
                System.out.println("Invalid mark!");
            }
            System.out.println();
        }

        mean = sum / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
        System.out.println("The number of 5: " + count5);
    }



    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner num = new Scanner(System.in);
        int sum = 0;
        System.out.print("n: ");
        int n = num.nextInt();
        while (n != 1 && n != 4){
            while(n !=0){
                sum += Math.pow(n % 10, 2);
                n/=10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1){
            System.out.println("Happy number!");
        }else{
            System.out.println("Sad number!");
        }


    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}