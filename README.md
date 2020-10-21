# 练习三 学生选课系统 计G202王飞2020322115
## 一、实验目的
掌握面向对象的类设计方法。
掌握类的继承用法，用过构造方法实例化对象。
运用super();继承，用于实例化子类
掌握使用toString()方法，应用在相关对象的信息输出中。
## 二、实验要求
实验三中有人员、教师、学生、课程、选课系统，5个类，教师教授课程，学生选择课程，由业务要求简化系统，每名教师仅教授一门课程，每门课程的授课教师也仅有以为，每名学生选仅选一门课程。人员类里面有教师和学生的共同属性，教师类继承人员类属性，额外有所授课程属性。学生类继承人员类属性，额外有所选课程属性。
## 三、实验流程
<img src="学生选课系统流程图.png">
## 四、核心代码
```Java
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

```

```Java
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

```

## 五、实验结果


## 六、实验感想
