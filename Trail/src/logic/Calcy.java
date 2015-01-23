package logic;

import com.opensymphony.xwork2.ActionSupport;

public class Calcy extends ActionSupport{
	
	private String t1;
	
	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String execute(){
		return SUCCESS;
	}
}
