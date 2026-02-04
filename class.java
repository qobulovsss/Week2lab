
//
//public class Problem10 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        final double INITIAL_BALANCE = 1000.00;
//        final double INTEREST_RATE = 0.05;
//
//        System.out.print("Input number of years: ");
//        int years = scanner.nextInt();
//
//        double balance = INITIAL_BALANCE;
//        System.out.printf("\nInitial deposit: $%.2f\n", balance);
//        System.out.println("Yearly growth:");
//
//        for (int year = 1; year <= years; year++) {
//            double interest = balance * INTEREST_RATE;
//            balance = balance + interest;
//            System.out.printf("Year %d: $%.2f\n", year, balance);
//        }
//
//        System.out.printf("\nFinal balance after %d years: $%.2f\n", years, balance);
//       
//    }
//}

//public class Problem9 {
//    public static void main(String[] args) {
//        final int LIMIT = 50;
//
//        System.out.println("FizzBuzz from 1 to " + LIMIT + ":");
//        System.out.println("---------------------------------");
//
//        for (int i = 1; i <= LIMIT; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.print("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.print("Buzz");
//            } else {
//                System.out.print(i);
//            }
//
//            // Add comma and space except for the last number
//            if (i < LIMIT) {
//                System.out.print(", ");
//            }
//
//            // New line after every 10 numbers for better readability
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
//
//        System.out.println(); 
//    }

//public class Problem8 {
//    public static void main(String[] args) {
//double population = 100000;
//double GROWTH_RATE = 0.05;
//double TARGET_POPULATION = 200000;
//int year = 0;
//System.out.println("Population Growth:");
//                System.out.printf("Starting population: %.0f\n\n", population);
//
//                while (population < TARGET_POPULATION) {
//                    year++;
//                    population = population + (population * GROWTH_RATE);
//                    System.out.printf("Year %d: %.0f\n", year, population);
//                }
//
//                System.out.printf("\nIt will take %d years to double.\n", year);
//                System.out.printf("Final population: %.0f\n", population);
//            }
//        }
//}

//import java.util.Scanner;
//public class Problem7 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please set your 4-digit PIN: ");
//        int userPin = scanner.nextInt();
//        System.out.print("Confirm your 4-digit PIN: ");
//        int confirmPin = scanner.nextInt();
//        if (userPin != confirmPin) {
//            System.out.println("PINs do not match.");
//            return;
//        }
//        System.out.println("PIN succesfully set!\n");
//        int MAX_ATTEMPTS = 3;
//        int attempts = 0;
//        boolean accessGranted = false;
//        while (attempts < MAX_ATTEMPTS) {
//            System.out.print("Enter your PIN: ");
//            int enteredPin = scanner.nextInt();
//            if (enteredPin == userPin) {
//                System.out.println("Acccess granted");
//                accessGranted = true;
//                break;
//            } else {
//                attempts++;
//                int remainingAttempts = MAX_ATTEMPTS - attempts;
//                if (remainingAttempts > 0) {
//                    System.out.println("Try again: ");
//                }
//            }
//            if (!accessGranted) {
//                System.out.println("Account locked");
//            }
//        }
//    }
//}


//public class Problem6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input: ");
//double weight = scanner.nextDouble();
//double shippingCost;
//if (weight <= 2) {
//shippingCost = 5.00;
//} else if (weight <= 10) {
//    shippingCost = 10.00;
//} else {
//double extraWeight = weight - 10;
//shippingCost = 10.00 + (extraWeight * 2.00);
//}
//        System.out.printf("Output: Shipping Cost: %.2f\n", shippingCost);
//    }
//}


//public class Problem5 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//System.out.print("Input: ");
//int year = scanner.nextInt();
//boolean isLeapYear = false;
//if (year % 4 == 0){
//if (year % 100 != 0) {
//isLeapYear = true;
//} else if(year % 400 == 0) {
//isLeapYear = true;
//}
//}
//if (isLeapYear){
//    System.out.println("Leap Year");
//} else{
//    System.out.println("Not a Leap Year");
//}
//    }
//}

//import java.util.Scanner;
//public class Problem4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//int age = scanner.nextInt();
//int ticketPrice;
//if (age >= 0 && age <= 12) {
//ticketPrice = 7;
//        } else if (age >= 13 && age <= 17 ) {
//    ticketPrice = 10;
//        } else if (age >= 18 && age <= 64 ) {
//    ticketPrice = 15;
//} else {
//    ticketPrice = 10;
//}
//System.out.println("Ticket Price: $" + ticketPrice);
//    }
//}


//public class Problem3 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter total number of seconds: ");
//int totalSeconds = input.nextInt();
//int hours = totalSeconds / 3600;
//int remainingSeconds = totalSeconds % 3600;
//int minutes = remainingSeconds / 60;
//int seconds = remainingSeconds % 60;
//        System.out.printf("%d hours, %d minutes, %dseconds\n", hours, minutes, seconds);
//    }
//}

//public class Problem2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//double distance = 570.0;
//double fuelConsumtion = 8.5;
//double fuelPrice = 12500.0;
//double fuelNeeded = (distance / 100.0) * fuelConsumtion;
//double totalCost = fuelNeeded * fuelPrice;
//System.out.printf("Fuel Needed: %.2f\n", fuelNeeded);
//        System.out.printf("Total Cost: %.2f\n", totalCost);
//    }
//}

//public class Problem1 {
//public static void main(String[] args){
//Scanner input = new Scanner(System.in);
//System.out.print("Enter quantity for cappuccinos: ");
//int cappucinos = input.nextInt();
//    System.out.print("Enter quantity for muffins: ");
//    int muffins = input.nextInt();
//double cappucinoPrice = 4.50;
//double muffinPrice = 3.00;
//double subtotal = (cappucinos* cappucinoPrice) + (muffins * muffinPrice );
//double tax = subtotal * 0.08;
//double tip = 5.00;
//double grandTotal = tax +tip + subtotal;
//System.out.printf("Grand total: $%.2f\n", grandTotal);
//}
//
//}
