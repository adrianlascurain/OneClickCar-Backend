package com.ecommerce.oneclickcar.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.ecommerce.oneclickcar.model.Comments;

@Service
public class CommentsService {
	
	private static final ArrayList<Comments> lista = new ArrayList<Comments>();
	public CommentsService() {
		lista.add(new Comments(4L, "muy buen vendedor", 5L, "09/10/2024", 1L, 555L, 877L));
	}//CONSTRUCTOR
	
	public ArrayList<Comments> getAllComments() {
		return lista;
	}//getAllComments
	
	public Comments getComments(Long comId) {
		Comments com=null;
		for(Comments comments : lista) {
			if(comments.getId_comment()==comId) {
				com=comments;
				break;
			}//iff
		}//foreach
		return com;
	}//getComments
	
	public Comments addComments(Comments comments) {
		Comments user=null;
		boolean flag = false;
			for(Comments c : lista) {
				if(c.getId_comment().equals(comments.getId_comment())) {
					flag = true;
					break;
				}//if
			}//foreach
			if (! flag) {
				lista.add(comments);
				user = comments;
			}//if
			return comments;
	}//addComments
	
	public Comments deleteComments(Long comId) {
		Comments com=null;
		for (Comments comments : lista) {
			if(comments.getId_comment()==comId) {
				com=lista.remove(lista.indexOf(comments));
				break;
			}//if
		}//foreach
		return com;
	}//deleteProducto

	public Comments updateComments(Long comId, Long id_comment, String content, Long rating, String comment_date,
			Long approved) {
		Comments com=null;
		for(Comments comments : lista) {
			if(comments.getId_comment()==comId) {
				if (content != null) comments.setContent(content);
				if (rating !=null) comments.setRating(rating);
				if(comment_date !=null) comments.setComment_date(comment_date);
				if(approved !=null) comments.setApproved(approved);
				com=comments;
				break;
			}//if
		}//foreach
		return com;
	}//updatecomments

}//class CommentsService
