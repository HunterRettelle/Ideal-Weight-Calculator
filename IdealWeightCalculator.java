import java.util.Scanner;

public class IdealWeightCalculator {
    public static int calculateFemaleIdealWeight(int heightFeet, int heightInches) {

        int totalHeightInches = heightFeet * 12 + heightInches;

        int idealWeight = 100 + (totalHeightInches - 60) * 5;
        return idealWeight;
    }

    public static int calculateMaleIdealWeight(int heightFeet, int heightInches) {

        int totalHeightInches = heightFeet * 12 + heightInches;

        int idealWeight = 106 + (totalHeightInches - 60) * 6;
        return idealWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your height in feet: ");
        int heightFeet = scanner.nextInt();

        System.out.print("Enter your height in inches: ");
        int heightInches = scanner.nextInt();


        System.out.print("Enter your weight in pounds: ");
        int weight = scanner.nextInt();


        int femaleIdealWeight = calculateFemaleIdealWeight(heightFeet, heightInches);
        int maleIdealWeight = calculateMaleIdealWeight(heightFeet, heightInches);


        System.out.println("Ideal weight for a female: " + femaleIdealWeight + " pounds");
        System.out.println("Ideal weight for a male: " + maleIdealWeight + " pounds");


        if (weight == femaleIdealWeight) {
            System.out.println("Your weight matches the ideal weight for a female.");
        } else if (weight == maleIdealWeight) {
            System.out.println("Your weight matches the ideal weight for a male.");
        } else {
            System.out.println("Your weight does not match the ideal weight for your height and gender.");
        }
    }
}
