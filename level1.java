import java.util.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.math.BigInteger;

// --- Level 1 Practice Programs ---

// 1. Write a program to check if a number is divisible by 5
class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        boolean isDivisibleByFive = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);
        input.close();
    }
}

// 2. Write a program to check if the first is the smallest of the 3 numbers.
class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        boolean isFirstSmallest = (number1 <= number2) && (number1 <= number3);
        System.out.println("Is the first number " + number1 + " the smallest? " + isFirstSmallest);
        input.close();
    }
}

// 3. Write a program to check if the first, second, or third number is the
// largest of the three.
class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);
        System.out.println("Is the first number " + number1 + " the largest? " + isFirstLargest);
        System.out.println("Is the second number " + number2 + " the largest? " + isSecondLargest);
        System.out.println("Is the third number " + number3 + " the largest? " + isThirdLargest);
        input.close();
    }
}

// 4. Write a program to check for the natural number and write the sum of n
// natural numbers
class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        long sumFromFormula;
        boolean isNaturalNumber = (number >= 1);
        if (isNaturalNumber) {
            sumFromFormula = (long) number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sumFromFormula);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
        input.close();
    }
}

// 5. Write a program to check whether a person can vote, depending on whether
// his/her age is greater than or equal to 18.
class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();
        boolean canVote = (age >= 18);
        if (canVote) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        input.close();
    }
}

// 6. Write a program to check whether a number is positive, negative, or zero.
class NumberSignChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }
        input.close();
    }
}

// 7. Write a program SpringSeason that takes two int values month and day from
// the command line and prints “Its a Spring Season” otherwise prints “Not a
// Spring Season”.
class SpringSeason {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments. " +
                    "Example: java SpringSeason 3 25");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean isMarchSpring = (month == 3 && day >= 20);
        boolean isAprilMaySpring = (month == 4 || month == 5);
        boolean isJuneSpring = (month == 6 && day <= 20);
        boolean isSpringSeason = isMarchSpring || isAprilMaySpring || isJuneSpring;
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}

// 8. Write a program to count down the number from the user input value to 1
// using a while loop for a rocket launch
class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number for the countdown: ");
        int counter = input.nextInt();
        if (counter <= 0) {
            System.out.println("Please enter a positive number for countdown.");
        } else {
            System.out.println("Initiating countdown...");
            while (counter >= 1) {
                System.out.println(counter + "...");
                counter--;
            }
            System.out.println("Lift-off!");
        }
        input.close();
    }
}

// 9. Rewrite program 8 to do the countdown using the for-loop
class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number for the countdown: ");
        int startCounter = input.nextInt();
        if (startCounter <= 0) {
            System.out.println("Please enter a positive number for countdown.");
        } else {
            System.out.println("Initiating countdown...");
            for (int counter = startCounter; counter >= 1; counter--) {
                System.out.println(counter + "...");
            }
            System.out.println("Lift-off!");
        }
        input.close();
    }
}

// 10. Write a program to find the sum of numbers until the user enters 0
class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSum = 0.0;
        double enteredValue;
        System.out.println("Enter numbers to sum. Enter 0 to stop.");
        while (true) {
            System.out.print("Enter a number: ");
            enteredValue = input.nextDouble();
            if (enteredValue == 0) {
                break;
            }
            totalSum += enteredValue;
        }
        System.out.println("The total sum of numbers entered is: " + totalSum);
        input.close();
    }
}

// 11. Rewrite the program 10 to find the sum until the user enters 0 or a
// negative number using while loop and break statement
class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSum = 0.0;
        double enteredValue;
        System.out.println("Enter numbers to sum. Enter 0 or a negative number to stop.");
        while (true) {
            System.out.print("Enter a number: ");
            enteredValue = input.nextDouble();
            if (enteredValue <= 0) {
                System.out.println("Zero or a negative number entered. Stopping summation.");
                break;
            }
            totalSum += enteredValue;
        }
        System.out.println("The total sum of numbers entered is: " + totalSum);
        input.close();
    }
}

// 12. Write a program to find the sum of n natural numbers using while loop
// compare the result with the formulae n*(n+1)/2 and show the result from both
// computations was correct.
class NaturalNumberSumWhileCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (natural number): ");
        int userNumber = input.nextInt();
        if (userNumber <= 0) {
            System.out
                    .println("The number " + userNumber + " is not a natural number. Please enter a positive integer.");
        } else {
            long sumByFormula = (long) userNumber * (userNumber + 1) / 2;
            long sumByWhileLoop = 0;
            int counter = 1;
            while (counter <= userNumber) {
                sumByWhileLoop += counter;
                counter++;
            }
            System.out.println("\n--- Summation Results ---");
            System.out.println("Sum of " + userNumber + " natural numbers (using formula): " + sumByFormula);
            System.out.println("Sum of " + userNumber + " natural numbers (using while loop): " + sumByWhileLoop);
            if (sumByFormula == sumByWhileLoop) {
                System.out.println("Both computations yield the same result. The calculation is correct!");
            } else {
                System.out.println("There is a mismatch in the computations. Please recheck.");
            }
        }
        input.close();
    }
}

// 13. Rewrite the program number 12 with the for loop instead of a while loop
// to find the sum of n Natural Numbers.
class NaturalNumberSumForCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (natural number): ");
        int userNumber = input.nextInt();
        if (userNumber <= 0) {
            System.out
                    .println("The number " + userNumber + " is not a natural number. Please enter a positive integer.");
        } else {
            long sumByFormula = (long) userNumber * (userNumber + 1) / 2;
            long sumByForLoop = 0;
            for (int i = 1; i <= userNumber; i++) {
                sumByForLoop += i;
            }
            System.out.println("\n--- Summation Results ---");
            System.out.println("Sum of " + userNumber + " natural numbers (using formula): " + sumByFormula);
            System.out.println("Sum of " + userNumber + " natural numbers (using for loop): " + sumByForLoop);
            if (sumByFormula == sumByForLoop) {
                System.out.println("Both computations yield the same result. The calculation is correct!");
            } else {
                System.out.println("There is a mismatch in the computations. Please recheck.");
            }
        }
        input.close();
    }
}

// 14. Write a Program to find the factorial of an integer entered by the user.
// (while loop)
class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int tempNumber = number;
            while (tempNumber > 0) {
                factorial *= tempNumber;
                tempNumber--;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        input.close();
    }
}

// 15. Rewrite program 14 using for loop
class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        input.close();
    }
}

// 16. Create a program to print odd and even numbers between 1 to the number
// entered by the user.
class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int userNumber = input.nextInt();
        if (userNumber <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("\n--- Odd and Even Numbers (1 to " + userNumber + ") ---");
            for (int i = 1; i <= userNumber; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even.");
                } else {
                    System.out.println(i + " is Odd.");
                }
            }
        }
        input.close();
    }
}

// 17. Create a program to find the bonus of employees based on their years of
// service.
class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double BONUS_PERCENTAGE = 0.05;
        System.out.print("Enter employee's salary: ");
        double employeeSalary = input.nextDouble();
        System.out.print("Enter employee's years of service: ");
        int yearsOfService = input.nextInt();
        double bonusAmount = 0.0;
        boolean isBonusApplicable = (yearsOfService > 5);
        if (isBonusApplicable) {
            bonusAmount = employeeSalary * BONUS_PERCENTAGE;
            System.out.println("Congratulations! You are eligible for a bonus.");
            System.out.println("Your bonus amount is: $" + String.format("%.2f", bonusAmount));
        } else {
            System.out.println("You are not eligible for a bonus at this time. Years of service must be more than 5.");
        }
        input.close();
    }
}

// 18. Create a program to find the multiplication table of a number entered by
// the user from 6 to 9.
class MultiplicationTableSpecificRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to see its multiplication table (from 6 to 9): ");
        int number = input.nextInt();
        System.out.println("\n--- Multiplication Table for " + number + " (from 6 to 9) ---");
        for (int i = 6; i <= 9; i++) {
            int product = number * i;
            System.out.println(number + " * " + i + " = " + product);
        }
        input.close();
    }
}

// 1️⃣ Program 1: Check if 10 students can vot
class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
        sc.close();
    }
}

// 2️⃣ Program 2: Check positive, negative, zero and compare first & last elemen
class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (num > 0) {
                System.out.println(num + " is Positive and " + (num % 2 == 0 ? "Even" : "Odd"));
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and Last elements are Equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than Last");
        } else {
            System.out.println("First element is Less than Last");
        }
        sc.close();
    }
}

// 3️⃣ Program 3: Multiplication table of a numbe
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        sc.close();
    }
}

// 4️⃣ Program 4: Store multiple values until user enters 0 or negativ
class StoreValuesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0;
        int index = 0;
        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10)
                break;
            numbers[index++] = num;
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nSum of all numbers: " + total);
        sc.close();
    }
}

// 5️⃣ Program 5: Multiplication table of a number from 6 to
class MultiTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] results = new int[4];
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        sc.close();
    }
}

// 6️⃣ Program 6: Mean height of 11 football player
class FootballMeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean height of football team: " + mean);
        sc.close();
    }
}

// 7️⃣ Program 7: Save odd and even numbers into array
class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input! Enter a positive number.");
            return;
        }
        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];
        int oi = 0, ei = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                even[ei++] = i;
            else
                odd[oi++] = i;
        }
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oi; i++)
            System.out.print(odd[i] + " ");
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < ei; i++)
            System.out.print(even[i] + " ");
        sc.close();
    }
}

// 8️⃣ Program 8: Factors of a number using arra
class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.println("Factors:");
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");
        sc.close();
    }
}

// 9️⃣ Program 9: Copy 2D array to 1D arra
class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();
        int[] arr = new int[r * c];
        int idx = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[idx++] = matrix[i][j];
        System.out.println("1D Array:");
        for (int val : arr)
            System.out.print(val + " ");
        sc.close();
    }
}

// 🔟 Program 10: FizzBuzz using Arra
class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input!");
            return;
        }
        String[] results = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                results[i] = "FizzBuzz";
            else if (i % 3 == 0)
                results[i] = "Fizz";
            else if (i % 5 == 0)
                results[i] = "Buzz";
            else
                results[i] = String.valueOf(i);
        }
        for (int i = 1; i <= n; i++)
            System.out.println("Position " + i + " = " + results[i]);
        sc.close();
    }
}

// 1. Simple Interest Calculator

public class level1 {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n",
                interest, principal, rate, time);
    }
}

// 2. Maximum Number of Handshakes

public class MaxHandshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}

// 3. Athlete Rounds in a Triangular Park

public class AthleteRounds {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter; // 5km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle (meters): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.printf("Athlete must complete %.2f rounds.\n", rounds);
    }
}

// 4. Check if Number is Positive, Negative, or Zero

public class NumberCheck {
    public static int checkNumber(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = checkNumber(number);
        System.out.println("Result: " + result);
    }
}

// 5. Spring Season Check

public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 4 || month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        if (isSpringSeason(month, day))
            System.out.println("It’s a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}

// 6. Sum of n Natural Numbers

public class SumNaturalNumbers {
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum = " + calculateSum(n));
    }
}

// 7. Find Smallest and Largest of 3 Numbers

public class MinMaxThree {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
}

// 8. Quotient and Remainder

public class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[] { number % divisor, number / divisor };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[1] + ", Remainder: " + result[0]);
    }
}

// 9. Distribute Chocolates

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[] { number % divisor, number / divisor };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[1] + ", Remaining: " + result[0]);
    }
}

// 10. Calculate Wind Chill Temperature

public class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double windSpeed = sc.nextDouble();

        double windChill = calculateWindChill(temp, windSpeed);
        System.out.printf("Wind Chill Temperature: %.2f°F\n", windChill);
    }
}

// 11. Trigonometric Functions

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[] {
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sin: %.4f, Cos: %.4f, Tan: %.4f\n", results[0], results[1], results[2]);
    }
}
