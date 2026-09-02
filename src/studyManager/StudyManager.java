package studyManager;

import java.util.ArrayList;

import model.StudyModel;

public class StudyManager {
	private ArrayList<StudyModel> studyList = new ArrayList<>();

	public void addStudy(StudyModel study) {
		studyList.add(study);
	}

	public void getAllStudies() {
		for (StudyModel studyModel : studyList) {
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
