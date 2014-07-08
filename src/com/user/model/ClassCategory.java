package com.user.model;

public class ClassCategory {
	private int ClassCategoryId;
	private  String ClassType;
	private int Cid;
	private boolean Retest;
	private boolean Retake; 
	
	
	public int getClassCategoryId() {
		return ClassCategoryId;
	}
	public void setClassCategoryId(int classCategoryId) {
		ClassCategoryId = classCategoryId;
	}
	public String getClassType() {
		return ClassType;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public boolean isRetest() {
		return Retest;
	}
	public void setRetest(boolean retest) {
		Retest = retest;
	}
	public boolean isRetake() {
		return Retake;
	}
	public void setRetake(boolean retake) {
		Retake = retake;
	}
	public void setClassType(String classType) {
		ClassType = classType;
	}

}
