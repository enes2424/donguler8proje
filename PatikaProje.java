import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen tek bir sayı giriniz : ");
		int num = input.nextInt(), num2 = (num + 1) / 2;
		for (int i = 0; i < num2; i++) {
			for (int j = 1; j < num2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num2 - 2; i >= 0; i--) {
			for (int j = 1; j < num2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
