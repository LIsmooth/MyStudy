package cn.po;

import java.util.List;

public class Dept {

	private String deptno;

	private String deptname;

	private String dlocation;
	
	private List<Emp> emps;
	
	

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Dept() {
	}

	public Dept(String deptno, String deptname, String dlocation) {
		this.deptno = deptno;
		this.deptname = deptname;
		this.dlocation = dlocation;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDlocation() {
		return dlocation;
	}

	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}

}
