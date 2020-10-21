package xuankexitong;

public class ChooseCourseByStu {
	
	// 学生选课
	public static boolean addStudent(Student stu,Course c) {
		if(c.hasStudent(stu)) return false;
		stu.setCourse(c);
		c.addStudent(stu);
		return true;
	}

	// 课移除学生
	public static boolean removeStudent(Student stu,Course c) {
		if(!c.hasStudent(stu)) return false;
		c.rmStudent(stu);
		stu.setCourse(null);
		return true;
	}

	// 显示选择课程的学生：
	public static void displayStudent(Course c) {
		System.out.println("选择的课程：" + c.getName() + "的学生有:");
		for (Student s : c.getStudents()) {
			System.out.print(s.getName() + " ");
		}
		System.out.println();
	}

	 
	 /**
	  * 选课管理系统
	  */
	 public static void main(String[] args) {
		 Student stu1 = new Student("1001","Lily","女");
		 Student stu2 = new Student("1002","Eilly","女");
		 Student stu3 = new Student("1003","Floris","男");
		 
		 Teacher tea1 = new Teacher("2001","zhangsan","男");
		 Teacher tea2 = new Teacher("2002","lisi","女");
		 Teacher tea3 = new Teacher("2003","wangwu","男");
	
		 Course c1 = new Course(101,"高数","300","上午9点",tea1);
		 Course c2 = new Course(102,"线代","301","上午11点",tea2);
		 Course c3 = new Course(103,"概率论","302","下午1点",tea3);
		 
		 addStudent(stu1,c1);
		 System.out.println(c1);
		 
		 removeStudent(stu1,c1);
		 System.out.println(c1);
		 
//	  Student stu0 = new Student(1001,"Lily");
//	  Student stu1 = new Student(1002,"Eilly");
////	  Student stu2 = new Student(1003,"Floris");
//	  Student stu3 = new Student(1004,"HaHa");
//	  Course cour0 = new Course(001,"高数");
//	  Course cour1 = new Course(002,"线代");
////	  Course cour2 = new Course(003,"概率论");
//	  stu0.addCourse(cour0);
////	  stu0.addCourse(cour2);
//	  stu0.addCourse(cour1);
////	  stu1.addCourse(cour2);
////	  stu1.addCourse(cour0);
////	  stu2.addCourse(cour1);
////	  stu3.addCourse(cour0);
//	  stu3.addCourse(cour1);
////	  stu1.removeCourse(cour2);
//	  stu0.displayCourse();
//	  cour0.removeStudent(stu0);
//	  cour1.displayStudent();
	 }
	 
	}