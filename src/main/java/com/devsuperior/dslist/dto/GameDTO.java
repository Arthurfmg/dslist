package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

public class GameDTO {

	private long id;
	private String title;
	private int year;
	private String genre;
	private String platforms;
	private double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO() {
	}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
}
