package studyManager;

import java.util.ArrayList;
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
				int time = scanner.nextInt();

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

				break;
			} catch (Exception e) {
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
		for (StudyModel studyModel : studyList) {
			System.out.println("|ID|タイトル|日付|内容|学習時間|理解度|復習|");
			System.out.println(studyModel);
		}
	}

	public void getStudyById() {
	}

	public void updateStudy() {

	}

	public void deleteStudy() {

	}

	public void searchStudy() {

	}

	public void calcTotalTime() {

	}
}
