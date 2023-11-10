import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1人目の情報を入力してください:");
        double height1 = getInput("身長（メートル単位）", scanner);
        double weight1 = getInput("体重（キログラム単位）", scanner);

        System.out.println("2人目の情報を入力してください:");
        double height2 = getInput("身長（メートル単位）", scanner);
        double weight2 = getInput("体重（キログラム単位）", scanner);

        scanner.close();

        double bmi1 = calculateBMI(height1, weight1);
        System.out.printf("1人目のBMIは %.2f です。\n", bmi1);
        printBMIMessage(bmi1);

        double bmi2 = calculateBMI(height2, weight2);
        System.out.printf("2人目のBMIは %.2f です。\n", bmi2);
        printBMIMessage(bmi2);
    }

    private static double getInput(String prompt, Scanner scanner) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }

    private static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    private static void printBMIMessage(double bmi) {
        if (bmi < 18.5) {
            System.out.println("あなたは低体重です。適正体重に近づけるためにバランスの取れた食事を摂りましょう。");
        } else if (bmi < 25.0) {
            System.out.println("あなたは健康的な体重です。この状態を維持しましょう。");
        } else {
            System.out.println("あなたは肥満です。適正体重を目指し、定期的な運動を取り入れましょう。");
        }
    }
}
