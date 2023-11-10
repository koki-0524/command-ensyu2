import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("身長（メートル単位）を入力してください: ");
        double height = scanner.nextDouble();
        System.out.print("体重（キログラム単位）を入力してください: ");
        double weight = scanner.nextDouble();
        scanner.close();

        double bmi = weight / (height * height);

        double health = 22.0 * (height * height);

        System.out.printf("あなたのBMIは %.2f です。\n", bmi);

        if (bmi < 18.5) {
            System.out.println("あなたは低体重です。適正体重に近づけるためにバランスの取れた食事を摂りましょう。");
        } else if (bmi < 25.0) {
            System.out.println("あなたは健康的な体重です。この状態を維持しましょう。");
        } else {
            System.out.println("あなたは肥満です。適正体重を目指し、定期的な運動を取り入れましょう。");
        }
    }
}
