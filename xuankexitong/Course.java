package xuankexitong;

import java.util.ArrayList;

public class Course {

	private String name;
	private int id;
	private Teacher teacher;
	private String room;
	private String cTime;
	private ArrayList<Student> students;

	/**
	 * @param courseName
	 * @param courseId
	 * @param teacher
	 */
	public Course(int id, String name, String room, String cTime, Teacher teacher) {
//		super();
		this.name = name;
		this.id = id;
		this.teacher = teacher;
		teacher.setCourse(this);
		this.cTime = cTime;
		this.room = room;
		this.students = new ArrayList<>();
	}

	// 修改或获取属性值id，name，credit，
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getcTime() {
		return cTime;
	}

	public void setcTime(String cTime) {
		this.cTime = cTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// public void setCredit(float credit) {
	// this.credit = credit;
	// }
	//
	// public float getCredit() {
	// return this.credit;
	// }

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean hasSpace() {
		return this.students.size() < 30;
	}

	public boolean hasStudent(Student stu) {
		return this.students.contains(stu);
	}

	public boolean addStudent(Student stu) {
		if (!hasSpace())
			return false;
		this.students.add(stu);
		return true;
	}

	public void rmStudent(Student stu) {
		this.students.remove(stu);
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}
	
	@Override
	public String toString() {
		return "课程信息：\n"
				+ "课程名称："+getName()+"\n"
				+ "课程编号："+getId()+"\n"
				+ "课程人数："+students.size()+"\n"
				+ "课程地点："+getRoom()+"\n"
				+ "课程时间："+getcTime()+"\n"
				+ "任课老师："+getTeacher().getName()+"\n\n";
	}
}