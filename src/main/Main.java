package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import studyManager.StudyManager;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StudyManager studyManager = new StudyManager();

		//		StudyModel study = new StudyModel(
		//				"Java",
		//				"2026/08/31",
		//				"ArrayListについて勉強",
		//				2,
		//				3,
		//				false);

		//		studyManager.addStudy(study);

		while (true) {
			try {
				System.out.println("実行する番号を入力してください");
				int command = scanner.nextInt();

				if (command == 1) {
					studyManager.studyInput(scanner);
					continue;
				} else if (command == 2) {
					studyManager.getAllStudies();
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
		System.out.println("=== 操作一覧 ===");
		System.out.println("1:学習内容追加");
		System.out.println("2:学習内容一覧");
		System.out.println("3:");
		System.out.println("4:");
		System.out.println("5:");
	}

}
