package com.ecommerce.oneclickcar.model;

import java.util.Date;

public class Comments {
	private Long id_comment;
	private String content;
	private int rating;
	private Date comment_date; 
	private int approved;
	private Long sellers_id_seller;
	private Long users_id_user;
	
	
	
	// Getters and setters
	public Long getId_comment() {
		return id_comment;
	}
	
	public void setId_comment(Long id_comment) {
		this.id_comment = id_comment;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public Date getComment_date() {
		return comment_date;
	}
	
	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}
	
	public int getApproved() {
		return approved;
	}
	
	public void setApproved(int approved) {
		this.approved = approved;
	}
	
	public Long getSellers_id_seller() {
		return sellers_id_seller;
	}
	
	public void setSellers_id_seller(Long sellers_id_seller) {
		this.sellers_id_seller = sellers_id_seller;
	}
	
	public Long getUsers_id_user() {
		return users_id_user;
	}
	
	public void setUsers_id_user(Long users_id_user) {
		this.users_id_user = users_id_user;
	}

	@Override
	public String toString() {
		return "Comments [id_comment=" + id_comment + ", content=" + content + ", rating=" + rating + ", comment_date="
				+ comment_date + ", approved=" + approved + ", sellers_id_seller=" + sellers_id_seller
				+ ", users_id_user=" + users_id_user + "]";
	}
	
	
	
}
