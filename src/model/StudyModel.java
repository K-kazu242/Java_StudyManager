package model;

public class StudyModel {
	private int id;
	private String title;
	private String day;
	private String content;
	private double time;
	private int level;
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public StudyModel() {
	}

	public StudyModel(int id, String title, String day, String content, Double time, int level, boolean status) {
		this.id = id;
		this.title = title;
		this.day = day;
		this.content = content;
		this.time = time;
		this.level = level;
		this.status = status;
	}

	public StudyModel(String title, String day, String content, Double time, int level, boolean status) {
		this.title = title;
		this.day = day;
		this.content = content;
		this.time = time;
		this.level = level;
		this.status = status;
	}

	@Override
	public String toString() {
		return
		//		id + " "
		//				+ title + " "
		//				+ day + " "
		//				+ content + " "
		//				+ time + "時間" + " "
		//				+ level + " "
		//				+ status;

		"ID：" + id
				+ ", タイトル：" + title
				+ ", 日付：" + day
				+ ", 内容：" + content
				+ ", 学習時間：" + time + "時間"
				+ ", 理解度：" + level
				+ ", 復習：" + status;
	}

}
