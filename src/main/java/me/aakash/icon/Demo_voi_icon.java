package me.aakash.icon;

import javax.persistence.Column;
import javax.persistence.Entity;



import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;


@Entity

public class Demo_voi_icon {
	
	
		
	   @Id
	   
	  private int id;
	   
	   @NaturalId
	   @Column(name="age_group")   
    private int age;
    private String icon_name;
    private String url;
    
    
    
    
	/**
	 * @param id
	 * @param age
	 * @param icon_name
	 * @param url
	 */
    public Demo_voi_icon()
    {
    	
    }
    
    
    public Demo_voi_icon( int age, String icon_name, String url) {    
	this.age = age;
	this.icon_name = icon_name;
	this.url = url;
}

	public Demo_voi_icon(int id, int age, String icon_name, String url) {

		this.id = id;
		this.age = age;
		this.icon_name = icon_name;
		this.url = url;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age_group) {
		this.age = age_group;
	}
	public String getIcon_name() {
		return icon_name;
	}
	public void setIcon_name(String icon_name) {
		this.icon_name = icon_name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	
    

}
