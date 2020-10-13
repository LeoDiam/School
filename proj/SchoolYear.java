package gr.school.proj;

import java.util.Arrays;

public class SchoolYear {

	private Student[] studentsp;
	private Student[] studentsn;
	private Teacher teacherp;
	private Teacher teachern;
	private int year;

	public SchoolYear(Student[] studentsp, Student[] studentsn, Teacher teacherp, Teacher teachern, int year) {

		this.studentsp = studentsp;
		this.studentsn = studentsn;
		this.teacherp = teacherp;
		this.teachern = teachern;
		this.year = year;

	}

	public Student[] getStudentsp() {
		return studentsp;
	}

	public void setStudentsp(Student[] studentsp) {
		this.studentsp = studentsp;
	}

	public Student[] getStudentsn() {
		return studentsn;
	}

	public void setStudentsn(Student[] studentsn) {
		this.studentsn = studentsn;
	}

	public Teacher getTeacherp() {
		return teacherp;
	}

	public void setTeacherp(Teacher teacherp) {
		this.teacherp = teacherp;
	}

	public Teacher getTeachern() {
		return teachern;
	}

	public void setTeachern(Teacher teachern) {
		this.teachern = teachern;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "SchoolYear [studentsp=" + Arrays.toString(studentsp) + ", studentsn=" + Arrays.toString(studentsn)
				+ ", teacherp=" + teacherp + ", teachern=" + teachern + ", year=" + year + "]";
	}

}

