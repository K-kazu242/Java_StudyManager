package studyManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.StudyModel;

public class StudyManager {
	private ArrayList<StudyModel> studyList = new ArrayList<>();
	private int nextId = 1;

	public void studyInput(Scanner scanner) {
		while (true) {
			try {
				scanner.nextLine();

				System.out.print("タイトル：");
				String title = scanner.nextLine();

				System.out.print("学習日(0000/00/00)：");
				String day = scanner.nextLine();

				System.out.print("学習内容：");
				String content = scanner.nextLine();

				System.out.print("学習時間：");
				Double time = scanner.nextDouble();

				System.out.print("理解度：");
				int level = scanner.nextInt();
				scanner.nextLine();

				System.out.print("復習済み？（y / n）：");
				String sta = scanner.nextLine();
				Boolean status = sta.equals("y");

				StudyModel study = new StudyModel(
						title,
						day,
						content,
						time,
						level,
						status);

				addStudy(study);
				System.out.println("登録完了");
				System.out.println("");

				break;
			} catch (InputMismatchException e) {
				System.out.println("正しく入力してください");
				scanner.nextLine();
			}
		}

	}

	public void addStudy(StudyModel study) {
		study.setId(nextId);
		studyList.add(study);
		nextId++;
	}

	public void getAllStudies() {
		System.out.println("|  ID  |  タイトル  |  日付  |  内容  |  学習時間  |  理解度  |  復習  |");
		for (StudyModel studyModel : studyList) {
			System.out.println(studyModel);
		}
		calcTotalTime();
		System.out.println("");
	}

	public void getStudyById() {
		for (StudyModel studyModel : studyList) {
			System.out.print(studyModel.getId() + ":");
			System.out.println(studyModel.getTitle());
		}
	}

	public void updateStudy(Scanner scanner) {
		getStudyById();
		System.out.print("変更するIDを入力：");
		int id = scanner.nextInt();
		for (StudyModel studyModel : studyList) {
			if (studyModel.getId() == id) {
				while (true) {
					try {
						System.out.println("1.タイトル｜2.日付｜3.内容｜4.時間｜5.理解度｜6.復習状況｜7.戻る");
						System.out.print("変更する番号を入力してください：");
						int command = scanner.nextInt();
						if (command == 1) {
							System.out.print("タイトル変更：");
							studyModel.setTitle(scanner.next());
							System.out.println("更新完了");
							continue;

						} else if (command == 2) {
							System.out.print("日付の変更：");
							studyModel.setDay(scanner.next());
							System.out.println("更新完了");
							continue;

						} else if (command == 3) {
							System.out.print("内容変更：");
							studyModel.setContent(null);
							System.out.println("更新完了");
							continue;

						} else if (command == 4) {
							System.out.print("時間変更：");
							studyModel.setTime(scanner.nextInt());
							System.out.println("更新完了");
							continue;

						} else if (command == 5) {
							System.out.print("理解度変更：");
							studyModel.setLevel(scanner.nextInt());
							System.out.println("更新完了");
							continue;

						} else if (command == 6) {
							scanner.nextLine();
							System.out.print("");
							System.out.print("復習済み？（y / n）：");
							String sta = scanner.nextLine();
							Boolean status = sta.equals("y");
							studyModel.setStatus(status);
							System.out.println("更新完了");
							continue;

						} else if (command == 7) {
							System.out.println("戻る");
							break;
						}

					} catch (InputMismatchException e) {
						System.out.println("数字を入力してください");
						scanner.nextLine();
					}
				}
			}
		}
	}

	public void deleteStudy(Scanner scanner) {
		getStudyById();
		System.out.print("削除するIDを入力：");
		int id = scanner.nextInt();
		studyList.removeIf(model -> model.getId() == id);
		System.out.println("削除完了");
		System.out.println("");
	}

	public void searchStudy(Scanner scanner) {
		System.out.print("検索したいタイトルを入力：");
		String title = scanner.next();
		for (StudyModel studyModel : studyList) {
			if (studyModel.getTitle().contains(title)) {
				System.out.println(studyModel);
			}
		}
		System.out.println("");
	}

	public void calcTotalTime() {
		int sumtime = 0;
		for (StudyModel studyModel : studyList) {
			sumtime += studyModel.getTime();
		}
		System.out.println("合計時間：" + sumtime + "時間");
	}
}
