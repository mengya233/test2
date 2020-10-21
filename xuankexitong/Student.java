package xuankexitong;

public class Student extends Renyuan {
	private Course course;

	/**
	 * @param id
	 * @param name
	 * @param sex
	 * @param course
	 */
	public Student(String id, String name, String sex) {
		super(id, name, sex);
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	private String getCourseName() {
		if (course != null) {
			return course.getName();
		}
		return "无课程";
	}

	@Override
	public String toString() {
		return "学生信息：\n" + "学生姓名：" + getName() + "\n" + "学生学号：" + getId() + "\n" + "学生性别：" + getSex() + "\n" + "选择课程："
				+ getCourseName();
	}

}