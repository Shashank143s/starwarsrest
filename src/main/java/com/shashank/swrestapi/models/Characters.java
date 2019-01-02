package com.shashank.swrestapi.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Characters {
	@Id
	public ObjectId _id;
	public String forceSide;
	public String name;
	public String gender;
	public Integer height;
	public String birthYear;
	public Integer mass;
	
	public Characters() {}
	
	public Characters(ObjectId _id,String forceSide,String name,String gender,Integer height,String birthYear,Integer mass) {
		this._id = _id;
		this.forceSide = forceSide;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.birthYear = birthYear;
		this.mass = mass;
	}
	
	 public String getid() { return _id.toHexString(); }
	 public void setid(ObjectId _id) { this._id = _id; }

	 public String getforceSide() { return forceSide; }
	 public void setforceSide(String forceSide) { this.forceSide = forceSide; }
	 
	 public String getName() { return name; }
	 public void setName(String name) { this.name = name; }
	 
	 public Integer getHeight() { return height; }
	 public void setHeight(Integer height) { this.height = height; }
	 
	 public String getGender() { return gender; }
	 public void setGender(String gender) { this.gender = gender; }
	 
	 public String getbirthYear() { return birthYear; }
	 public void setbirthYear(String birthYear) { this.birthYear = birthYear; }
	 
	 public Integer getmass() { return mass; }
	 public void setmass(Integer mass) { this.mass = mass; }
	

}
