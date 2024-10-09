package com.ecommerce.oneclickcar.model;

public class Comments {
	private Long id_comment;
	private String content;
	private Long rating;
	private String comment_date; 
	private Long approved;
	private Long sellers_id_seller;
	private Long users_id_user;
	
	public Comments(Long id_comment, String content, Long rating, String comment_date, Long approved,
			Long sellers_id_seller, Long users_id_user) {
		this.id_comment = id_comment;
		this.content = content;
		this.rating = rating;
		this.comment_date = comment_date;
		this.approved = approved;
		this.sellers_id_seller = sellers_id_seller;
		this.users_id_user = users_id_user;
	}//constructor

	public Comments() {
	}

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
	
	public void setContent(String content2) {
		this.content = content2;
	}
	
	public Long getRating() {
		return rating;
	}
	
	public void setRating(Long rating) {
		this.rating = rating;
	}
	
	public String getComment_date() {
		return comment_date;
	}
	
	public void setComment_date(String comment_date) {
		this.comment_date = comment_date;
	}
	
	public Long getApproved() {
		return approved;
	}
	
	public void setApproved(Long approved) {
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
	}//ToString
}//ClassComments
