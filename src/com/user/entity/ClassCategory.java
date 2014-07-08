package com.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClassCatgory1")
public class ClassCategory {
	

	private int ClassCategoryId;
	private  String ClassType;
	private int Cid;
	private boolean Retest;
	private boolean Retake;
	
	@Column(name="ClassCategoryId", length=15, nullable=false, unique=true)
	public int getClassCategoryId() {
		return ClassCategoryId;
	}
	public void setClassCategoryId(int classCategoryId) {
		ClassCategoryId = classCategoryId;
	}
	
	@Column(name="ClassType", length=40, nullable=false, unique=false)
	public String getClassType() {
		return ClassType;
	}
	public void setClassType(String classType) {
		ClassType = classType;
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
	@Column(name="Cid", length=15, nullable=false, unique=true)
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	
	@Id
	//采用数据库自增方式生成主键
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
	
		this.id = id;
	}
		
}
	

	
	
	

}
