package com.deezerAPI.entities.dto;

public class UserDTO {

	private String id;
	private String name;
	private String link;
	private String picture;
	private String country;
	private String type;
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(String id, String name, String link, String picture, String country, String type) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
		this.picture = picture;
		this.country = country;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", link=" + link + ", picture=" + picture + ", country="
				+ country + ", type=" + type + "]";
	}

	
	
}
