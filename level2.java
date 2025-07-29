import java.util.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.math.BigInteger;

// --- Level 2 Practice Programs ---

// 1. Create a program to print odd and even numbers between 1 to the number entered by the user.
class OddEvenPrinterL2 {
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


// 2. Create a program to find the bonuses of employees based on their years of service.
class EmployeeBonusCalculatorL2 {
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


// 3. Create a program to find the multiplication table of a number entered by the user from 6 to 9.
class MultiplicationTableSpecificRangeL2 {
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


// 4. Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
class FizzBuzzForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int userNumber = input.nextInt();
        if (userNumber <= 0) {
            System.out.println("Please enter a positive integer for FizzBuzz.");
        } else {
            System.out.println("\n--- FizzBuzz Output up to " + userNumber + " ---");
            for (int i = 1; i <= userNumber; i++) {
                String output = "";
                if (i % 3 == 0 && i % 5 == 0) {
                    output = "FizzBuzz";
                }
                else if (i % 3 == 0) {
                    output = "Fizz";
                }
                else if (i % 5 == 0) {
                    output = "Buzz";
                }
                else {
                    output = String.valueOf(i);
                }
                System.out.println(output);
            }
        }
        input.close();
    }
}


// 5. Rewrite the program 4 FizzBuzz using the while loop
class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int userNumber = input.nextInt();
        if (userNumber <= 0) {
            System.out.println("Please enter a positive integer for FizzBuzz.");
        } else {
            System.out.println("\n--- FizzBuzz Output up to " + userNumber + " ---");
            int counter = 1;
            while (counter <= userNumber) {
                String output = "";
                if (counter % 3 == 0 && counter % 5 == 0) {
                    output = "FizzBuzz";
                }
                else if (counter % 3 == 0) {
                    output = "Fizz";
                }
                else if (counter % 5 == 0) {
                    output = "Buzz";
                }
                else {
                    output = String.valueOf(counter);
                }
                System.out.println(output);
                counter++;
            }
        }
        input.close();
    }
}


// 6. Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
class FriendsAgeHeightTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details for Amar:");
        System.out.print("  Age: ");
        int amarAge = input.nextInt();
        System.out.print("  Height (in cm): ");
        double amarHeight = input.nextDouble();
        System.out.println("Enter details for Akbar:");
        System.out.print("  Age: ");
        int akbarAge = input.nextInt();
        System.out.print("  Height (in cm): ");
        double akbarHeight = input.nextDouble();
        System.out.println("Enter details for Anthony:");
        System.out.print("  Age: ");
        int anthonyAge = input.nextInt();
        System.out.print("  Height (in cm): ");
        double anthonyHeight = input.nextDouble();
        int youngestAge = amarAge;
        String youngestFriendName = "Amar";
        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriendName = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriendName = "Anthony";
        }
        System.out.println("\n--- Youngest Friend ---");
        System.out.println("The youngest friend is " + youngestFriendName + " with age " + youngestAge + " years.");
        double tallestHeight = amarHeight;
        String tallestFriendName = "Amar";
        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriendName = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriendName = "Anthony";
        }
        System.out.println("\n--- Tallest Friend ---");
        System.out.println("The tallest friend is " + tallestFriendName + " with height " + tallestHeight + " cm.");
        input.close();
    }
}


// 7. Create a program to find the factors of a number taken as user input. (for loop)
class NumberFactorsForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}


// 8. Rewrite the above program 7 to find the factors of a number using the while loop
class NumberFactorsWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
        input.close();
    }
}


// 9. Create a program to print the greatest factor of a number beside itself using a loop. (for loop)
class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its greatest factor (excluding itself): ");
        int number = input.nextInt();
        int greatestFactor = 1;
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (number == 1) {
            System.out.println("The greatest factor of 1 (excluding itself) is not applicable or considered 1 itself depending on definition.");
        }
        else {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }
        input.close();
    }
}


// 10. Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its greatest factor (excluding itself): ");
        int number = input.nextInt();
        int greatestFactor = 1;
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (number == 1) {
            System.out.println("The greatest factor of 1 (excluding itself) is not applicable or considered 1 itself depending on definition.");
        }
        else {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }
        input.close();
    }
}


// 11. Create a program to find all the multiples of a number taken as user input below 100. (for loop)
class MultiplesBelow100ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its multiples below 100: ");
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}


// 12. Create a program to find the power of a number. (for loop)
class PowerOfNumberForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int baseNumber = input.nextInt();
        System.out.print("Enter the exponent (a non-negative integer): ");
        int exponent = input.nextInt();
        if (exponent < 0) {
            System.out.println("Exponent cannot be negative for this calculation.");
        } else {
            long result = 1;
            if (exponent == 0) {
                result = 1;
            } else {
                for (int i = 1; i <= exponent; i++) {
                    result *= baseNumber;
                }
            }
            System.out.println(baseNumber + " raised to the power of " + exponent + " is: " + result);
        }
        input.close();
    }
}


// 13. Rewrite the program to find all the multiples of a number below 100 using while loop.
class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its multiples below 100: ");
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 1;
            int currentMultiple;
            while (true) {
                currentMultiple = number * counter;
                if (currentMultiple < 100) {
                    System.out.println(currentMultiple);
                } else {
                    break;
                }
                counter++;
            }
        }
        input.close();
    }
}


// 14. Rewrite the above program to find the power of a number using a while loop.
class PowerOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int baseNumber = input.nextInt();
        System.out.print("Enter the exponent (a non-negative integer): ");
        int exponent = input.nextInt();
        if (exponent < 0) {
            System.out.println("Exponent cannot be negative for this calculation.");
        } else {
            long result = 1;
            int counter = 0;
            if (exponent == 0) {
                result = 1;
            } else {
                while (counter < exponent) {
                    result *= baseNumber;
                    counter++;
                }
            }
            System.out.println(baseNumber + " raised to the power of " + exponent + " is: " + result);
        }
        input.close();
    }
}


// 1️⃣ Program 1: Bonus calculation for 10 employees
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            years[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            bonus[i] = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        sc.close();
    }
}


// 2️⃣ Program 2: Find youngest and tallest among 3 friends
class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) minAgeIndex = i;
            if (height[i] > height[maxHeightIndex]) maxHeightIndex = i;
        }

        System.out.println("Youngest friend is: " + names[minAgeIndex]);
        System.out.println("Tallest friend is: " + names[maxHeightIndex]);
        sc.close();
    }
}


// 3️⃣ Program 3: Store digits in an array and find largest & second largest
class DigitsLargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];

        while (num > 0) {
            if (index == maxDigit) break;  
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
        sc.close();
    }
}


// 4️⃣ Program 4: Modify above program to dynamically increase array size
class DigitsDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];

        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
        sc.close();
    }
}


// 5️⃣ Program 5: Reverse a number using an array
class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numStr = String.valueOf(num);
        char[] digits = numStr.toCharArray();
        System.out.print("Reversed Number: ");
        for (int i = digits.length - 1; i >= 0; i--) System.out.print(digits[i]);
        sc.close();
    }
}


// 6️⃣ Program 6: BMI Calculation for multiple persons
class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height(m) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nHeight | Weight | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + " | " + weight[i] + " | " + bmi[i] + " | " + status[i]);
        }
        sc.close();
    }
}


// 7️⃣ Program 7: BMI using Multi-Dimensional Array
class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height(m) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nWeight | Height | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + " | " + personData[i][1] + " | " + personData[i][2] + " | " + weightStatus[i]);
        }
        sc.close();
    }
}


// 8️⃣ Program 8: Student Marks, Percentage & Grade Calculation
class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Physics, Chemistry, Maths (0-100) for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextDouble();

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        System.out.println("\nMarks | Percentage | Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "," + marks[i][1] + "," + marks[i][2] + " | " + percentage[i] + " | " + grade[i]);
        }
        sc.close();
    }
}



// 9️⃣ Program 9: Frequency of each digit in a number
class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        int[] freq = new int[10];
        for (char c : num.toCharArray()) freq[c - '0']++;

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println(i + " → " + freq[i]);
        }
        sc.close();
    }
}



// 1. Factors of a Number (Sum, Squares, Product)

public class level2 {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sumOfFactors(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        System.out.println("Product: " + productOfFactors(factors));
    }
}


// 2. Sum of Natural Numbers using Recursion and Formula


public class NaturalNumberSum {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int recSum = recursiveSum(n);
        int formSum = formulaSum(n);

        System.out.println("Recursive Sum: " + recSum);
        System.out.println("Formula Sum: " + formSum);
        System.out.println("Both results are " + (recSum == formSum ? "equal" : "not equal"));
    }
}


// 3. Leap Year Checker

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return (year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian calendar)");
            return;
        }

        System.out.println(year + (isLeapYear(year) ? " is a Leap Year" : " is NOT a Leap Year"));
    }
}


// 4. Unit Converter Utility (All Conversions)

public class UnitConverter {

    // Distance
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
    public static double convertFeetToMeters(double feet) { return feet * 0.3048; }

    // Yards & Inches
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double meters) { return meters * 39.3701; }
    public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
    public static double convertInchesToCm(double inches) { return inches * 2.54; }

    // Temperature
    public static double convertFahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }

    // Weight
    public static double convertPoundsToKg(double pounds) { return pounds * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }

    // Volume
    public static double convertGallonsToLiters(double gallons) { return gallons * 3.78541; }
    public static double convertLitersToGallons(double liters) { return liters * 0.264172; }
}


// 5. Student Voting Eligibility


public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Eligible to vote? " + canStudentVote(ages[i]));
        }
    }
}


// 6. Youngest and Tallest Friend


public class FriendsComparison {

    public static int findYoungest(int[] ages) {
        int min = ages[0], idx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int findTallest(double[] heights) {
        double max = heights[0];
        int idx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " + names[findYoungest(ages)]);
        System.out.println("Tallest: " + names[findTallest(heights)]);
    }
}


// 7. Positive/Negative, Even/Odd, First vs Last Comparison


public class NumberAnalysis {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        return a > b ? 1 : (a < b ? -1 : 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println("Positive and " + (isEven(numbers[i]) ? "Even" : "Odd"));
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.println("Comparison of first and last element: " +
                (result == 0 ? "Equal" : (result == 1 ? "First is greater" : "Last is greater")));
    }
}


// 8. BMI Calculator for 10 People


public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    i + 1, data[i][1], data[i][0], data[i][2], getStatus(data[i][2]));
        }
    }
}


// 9. Quadratic Equation Roots


public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) return new double[]{};
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots");
        else for (int i = 0; i < roots.length; i++) System.out.println("Root " + (i + 1) + ": " + roots[i]);
    }
}


// 10. 4-Digit Random Numbers - Average, Min, Max

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + rand.nextInt(9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new double[]{(double) sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Generated numbers: " + Arrays.toString(arr));
        double[] result = findAverageMinMax(arr);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", result[0], result[1], result[2]);
    }
}




