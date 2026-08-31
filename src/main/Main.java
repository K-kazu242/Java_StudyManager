package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("実行する番号を入力してください");
				int command = scanner.nextInt();

				if (command == 1) {

					continue;
				} else if (command == 2) {

					continue;
				} else if (command == 3) {

					continue;
				} else if (command == 4) {

					continue;
				} else if (command == 5) {
					System.out.println("プログラムを終了します");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("数字を入力してください");
				scanner.nextLine();
			}
		}

		scanner.close();

	}

	public void whowMenu() {

	}

}
