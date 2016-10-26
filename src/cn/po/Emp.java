package cn.po;

public class Emp {

	private String empno;

	private String empname;

	private Dept dept;

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Emp() {
	}

	public Emp(String empno, String empname) {

		this.empno = empno;
		this.empname = empname;

	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
