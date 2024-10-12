package com.ecommerce.oneclickcar.model;
import javax.persistence.Column;
//POJO Plain Old Java Object
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Comments")
public class Comments {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idComment", unique=true, nullable=false)
	private Long idComment;
	@Column(nullable=false)
	private String content;
	@Column(nullable=false)
	private Long rating;
	@Column(nullable=false)
	private String commentDate; 
	@Column(nullable=false)
	private Long approved;
	@Column(nullable=false)
	private Long sellersIdSeller;
	@Column(nullable=false)
	private Long usersIdUser;
	
	public Comments(String content, Long rating, String commentDate, Long approved,
			Long sellersIdSeller, Long usersIdUser) {
		this.content = content;
		this.rating = rating;
		this.commentDate = commentDate;
		this.approved = approved;
		this.sellersIdSeller = sellersIdSeller;
		this.usersIdUser = usersIdUser;
	}//constructor

	public Comments() {
	}

	// Getters and setters
	
	public Long getIdComment() {
		return idComment;
	}
	
	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Long getRating() {
		return rating;
	}
	
	public void setRating(Long rating) {
		this.rating = rating;
	}
	
	public String getCommentDate() {
		return commentDate;
	}
	
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	
	public Long getApproved() {
		return approved;
	}
	
	public void setApproved(Long approved) {
		this.approved = approved;
	}
	
	public Long getSellersIdSeller() {
		return sellersIdSeller;
	}
	
	public void setSellersIdSeller(Long sellersIdSeller) {
		this.sellersIdSeller = sellersIdSeller;
	}
	
	public Long getUsersIdUser() {
		return usersIdUser;
	}
	
	public void setUsersIdUser(Long usersIdUser) {
		this.usersIdUser = usersIdUser;
	}

	@Override
	public String toString() {
		return "Comments [idComment=" + idComment + ", content=" + content + ", rating=" + rating + ", commentDate="
				+ commentDate + ", approved=" + approved + ", sellersIdSeller=" + sellersIdSeller
				+ ", usersIdUser=" + usersIdUser + "]";
	}//ToString
}//ClassComments
