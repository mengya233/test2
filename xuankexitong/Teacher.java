package xuankexitong;

public class Teacher extends Renyuan {
//	private int id;
//	private String teacherName;
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @param id
	 * @param name
	 * @param sex
	 * @param course
	 */
	public Teacher(String id, String name, String sex) {
		super(id, name, sex);
	}
	
	private String getCourseName() {
		if(course!=null) {
			return course.getName();
		}
		return "无课程";
	}

	@Override
    public String toString() {
		return "教师信息：\n"
				+ "教师姓名："+getName()+"\n"
				+ "教师学号："+getId()+"\n"
				+ "教师性别："+getSex()+"\n"
				+ "所授课程："+getCourseName();
	}
}