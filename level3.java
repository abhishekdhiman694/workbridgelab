// --- Level 3 Practice Programs ---
import java.util.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.math.BigInteger;

// 1. Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = input.nextInt();
        boolean isLeapYear = false;
        if (year < 1582) {
            System.out.println("The Leap Year check is applicable for years 1582 or greater (Gregorian calendar).");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
            if (isLeapYear) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }
        input.close();
    }
}


// 2. Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
class LeapYearCheckerSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("The Leap Year check is applicable for years 1582 or greater (Gregorian calendar).");
        } else {
            boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
            if (isLeapYear) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }
        input.close();
    }
}


// 3. Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines
class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_MARKS_PER_SUBJECT = 100;
        final int NUMBER_OF_SUBJECTS = 3;
        System.out.print("Enter marks for Physics (out of " + MAX_MARKS_PER_SUBJECT + "): ");
        double physicsMarks = input.nextDouble();
        System.out.print("Enter marks for Chemistry (out of " + MAX_MARKS_PER_SUBJECT + "): ");
        double chemistryMarks = input.nextDouble();
        System.out.print("Enter marks for Maths (out of " + MAX_MARKS_PER_SUBJECT + "): ");
        double mathsMarks = input.nextDouble();
        if (physicsMarks < 0 || physicsMarks > MAX_MARKS_PER_SUBJECT ||
            chemistryMarks < 0 || chemistryMarks > MAX_MARKS_PER_SUBJECT ||
            mathsMarks < 0 || mathsMarks > MAX_MARKS_PER_SUBJECT) {
            System.out.println("Invalid marks entered. Marks must be between 0 and " + MAX_MARKS_PER_SUBJECT + ".");
        } else {
            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
            double maxTotalMarks = MAX_MARKS_PER_SUBJECT * NUMBER_OF_SUBJECTS;
            double percentage = (totalMarks / maxTotalMarks) * 100;
            String grade;
            String remarks;
            if (percentage >= 90) {
                grade = "A+";
                remarks = "Excellent performance!";
            } else if (percentage >= 80) {
                grade = "A";
                remarks = "Very good performance.";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Good performance.";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Satisfactory performance.";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Needs improvement.";
            } else {
                grade = "F";
                remarks = "Failed. Please study harder.";
            }
            System.out.println("\n--- Student Performance Report ---");
            System.out.println("Total Marks: " + String.format("%.2f", totalMarks) + " / " + maxTotalMarks);
            System.out.println("Average Mark (Percentage): " + String.format("%.2f", percentage) + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
        input.close();
    }
}


// 4. Write a Program to check if the given number is a prime number or not
class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("The number " + number + " is a Prime Number.");
        } else {
            System.out.println("The number " + number + " is Not a Prime Number.");
        }
        input.close();
    }
}


// 5. Create a program to check if a number is armstrong or not.
class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's an Armstrong number: ");
        int number = input.nextInt();
        int sumOfCubes = 0;
        int originalNumber = number;
        int tempNumber = number;
        if (number <= 0) {
             System.out.println("Armstrong numbers are typically positive integers. " + number + " is not an Armstrong Number.");
        } else {
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                sumOfCubes += (digit * digit * digit);
                tempNumber /= 10;
            }
            if (originalNumber == sumOfCubes) {
                System.out.println("The number " + originalNumber + " is an Armstrong Number.");
            } else {
                System.out.println("The number " + originalNumber + " is Not an Armstrong Number.");
            }
        }
        input.close();
    }
}


// 6. Create a program to count the number of digits in an integer.
class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to count its digits: ");
        int number = input.nextInt();
        int tempNumber = Math.abs(number);
        int count = 0;
        if (tempNumber == 0) {
            count = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }
        }
        System.out.println("The number " + number + " has " + count + " digits.");
        input.close();
    }
}


// 7. Create a program to find the BMI of a person
class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms (kg): ");
        double weightKg = input.nextDouble();
        System.out.print("Enter your height in centimeters (cm): ");
        double heightCm = input.nextDouble();
        final double CM_TO_METER_CONVERSION = 100.0;
        double heightM = heightCm / CM_TO_METER_CONVERSION;
        double bmi = weightKg / (heightM * heightM);
        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            weightStatus = "Normal weight";
        } else if (bmi >= 25.0 && bmi < 29.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }
        System.out.println("\n--- BMI Calculation Result ---");
        System.out.println("Your BMI is: " + String.format("%.2f", bmi) + " kg/m^2");
        System.out.println("Your weight status is: " + weightStatus);
        input.close();
    }
}


// 8. Create a program to check if a number taken from the user is a Harshad Number.
class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's a Harshad Number: ");
        int number = input.nextInt();
        int sumOfDigits = 0;
        int tempNumber = number;
        if (number <= 0) {
            System.out.println("Harshad numbers are typically positive integers. " + number + " is not a Harshad Number.");
        } else {
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                sumOfDigits += digit;
                tempNumber /= 10;
            }
            if (sumOfDigits == 0) {
                System.out.println("The sum of digits is zero, cannot determine Harshad Number for " + number + ".");
            } else if (number % sumOfDigits == 0) {
                System.out.println("The number " + number + " is a Harshad Number.");
            } else {
                System.out.println("The number " + number + " is Not a Harshad Number.");
            }
        }
        input.close();
    }
}


// 9. Create a program to check if a number is an Abundant Number.
class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's an Abundant Number: ");
        int number = input.nextInt();
        int sumOfDivisors = 0;
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            if (sumOfDivisors > number) {
                System.out.println("The number " + number + " is an Abundant Number (Sum of divisors: " + sumOfDivisors + ").");
            } else {
                System.out.println("The number " + number + " is Not an Abundant Number (Sum of divisors: " + sumOfDivisors + ").");
            }
        }
        input.close();
    }
}


// 10. Write a program to create a calculator using switch...case.
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        String operator;
        double result;
        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = firstNumber / secondNumber;
                    System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid Operator! Please use +, -, *, or /.");
                break;
        }
        input.close();
    }
}


// 11. Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide month, day, and year as command-line arguments.");
            System.out.println("Example: java DayOfWeek 7 26 2025 (for July 26, 2025)");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1) {
            System.out.println("Invalid date. Please ensure month (1-12), day (1-31), and year (positive) are valid.");
            return;
        }
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        System.out.println("The day of the week for " + m + "/" + d + "/" + y + " is: " + d0);
        String dayName;
        switch (d0) {
            case 0: dayName = "Sunday"; break;
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            default: dayName = "Error"; break;
        }
        System.out.println("Which is: " + dayName);
    }
}




// Program 1: Football Team Height Analysis

public class FootballTeamStats {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    public static void displayHeights(int[] heights) {
        System.out.println("Heights of players:");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", findMean(heights));
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        displayHeights(heights);
    }
}

// Program 2: NumberChecker Utility (All Parts)
public class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : digits) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : digits) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        return new int[]{first, second};
    }
}


// Program 3: OTP Validation System

public class OTPValidator {
    public static String generateOTP() {
        Random rand = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            otp.append(rand.nextInt(10));
        }
        return otp.toString();
    }

    public static boolean validateOTP(String generated, String entered) {
        return generated.equals(entered);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String otp = generateOTP();
        System.out.println("Generated OTP (for testing): " + otp);
        System.out.print("Enter OTP: ");
        String userInput = scanner.nextLine();
        if (validateOTP(otp, userInput)) {
            System.out.println("OTP Verified Successfully!");
        } else {
            System.out.println("Invalid OTP!");
        }
    }
}

// Program 4: Calendar Display Generator

public class CalendarDisplay {
    public static void printCalendar(int daysInMonth, int startDay) {
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int i;
        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days in month: ");
        int days = sc.nextInt();
        System.out.print("Enter start day (0=Sun, 1=Mon,...6=Sat): ");
        int start = sc.nextInt();
        printCalendar(days, start);
    }
}

// Program 5: Geometry Area and Perimeter Computation
public class Geometry {
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static double perimeterOfRectangle(double length, double breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        System.out.println("Area of Circle: " + areaOfCircle(7));
        System.out.println("Perimeter of Circle: " + perimeterOfCircle(7));
        System.out.println("Area of Rectangle: " + areaOfRectangle(5, 3));
        System.out.println("Perimeter of Rectangle: " + perimeterOfRectangle(5, 3));
    }
}

// Program 6: Salary Computation System

public class SalaryCalculator {
    public static double calculateGross(double basic) {
        double hra = 0.2 * basic;
        double da = 0.1 * basic;
        return basic + hra + da;
    }

    public static double calculateNet(double gross, double deductions) {
        return gross - deductions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter Deductions: ");
        double deductions = sc.nextDouble();

        double gross = calculateGross(basic);
        double net = calculateNet(gross, deductions);

        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

// Program 7: ScoreCard Display

public class ScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int total = 0;
        System.out.println("Enter scores for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            scores[i] = sc.nextInt();
            total += scores[i];
        }
        double avg = total / 5.0;
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 75) System.out.println("Grade: B");
        else if (avg >= 60) System.out.println("Grade: C");
        else System.out.println("Grade: D");
    }
}

// Program 8: Matrix Operations

public class MatrixOperations {
    public static void addMatrices(int[][] a, int[][] b, int rows, int cols) {
        System.out.println("Addition Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void subtractMatrices(int[][] a, int[][] b, int rows, int cols) {
        System.out.println("Subtraction Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((a[i][j] - b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrices(int[][] a, int[][] b, int rows, int cols) {
        System.out.println("Multiplication Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < cols; k++) {
                    sum += a[i][k] * b[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2, cols = 2;
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat1[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat2[i][j] = sc.nextInt();

        addMatrices(mat1, mat2, rows, cols);
        subtractMatrices(mat1, mat2, rows, cols);
        multiplyMatrices(mat1, mat2, rows, cols);
    }
}
