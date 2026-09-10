package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import studyManager.StudyManager;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StudyManager studyManager = new StudyManager();

		while (true) {
			showMenu();
			try {
				System.out.print("実行する番号を入力してください：");
				int command = scanner.nextInt();

				if (command == 1) {
					studyManager.studyInput(scanner);
					continue;
				} else if (command == 2) {
					studyManager.getAllStudies();
					continue;
				} else if (command == 3) {
					studyManager.updateStudy(scanner);
					continue;
				} else if (command == 4) {
					studyManager.deleteStudy(scanner);
					continue;
				} else if (command == 5) {
					studyManager.searchStudy(scanner);
					continue;
				} else if (command == 6) {
					System.out.println("プログラムを終了します");
					break;
				} else if (command >= 7) {
					System.out.println("無効な数字です");
					continue;
				}

			} catch (InputMismatchException e) {
				System.out.println("数字を入力してください");
				scanner.nextLine();
			}
		}

		scanner.close();

	}

	public static void showMenu() {
		System.out.println("=== 操作一覧 ===");
		System.out.println("1:学習内容追加");
		System.out.println("2:学習内容一覧");
		System.out.println("3:内容更新");
		System.out.println("4:内容削除");
		System.out.println("5:タイトル検索");
		System.out.println("6:終了");
	}

}
