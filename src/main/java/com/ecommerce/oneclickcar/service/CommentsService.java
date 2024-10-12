package com.ecommerce.oneclickcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.ecommerce.oneclickcar.model.Comments;
import com.ecommerce.oneclickcar.repository.CommentsRepository;


@Service
public class CommentsService {
	public final CommentsRepository commentsRepository;
	
	public CommentsService(CommentsRepository commentsRepository) {
		this.commentsRepository = commentsRepository;
	}//CONSTRUCTOR
	
	public List<Comments> getAllComments() {
		return commentsRepository.findAll();
	}//getAllComments
	
	public Comments getComments(Long comId) {
	return commentsRepository.findById(comId).orElseThrow(
			()-> new IllegalArgumentException("El comentario con el id [" + comId
					+ "] no existe.")
			);
	}//getComments
	
	public Comments addComments(Comments comments) {

		if(comments.getIdComment()==null) {//Id es nulo
			return commentsRepository.save(comments);
		}else{
			Optional <Comments> com = commentsRepository.findById(comments.getIdComment());
			if(com.isEmpty()) {//Id no existe
				return commentsRepository.save(comments);
			}
			System.out.println("El id del comentario [" + comments.getIdComment()
			+ "] ya se encuentra registrado.");
			return null;
		}

	}//addComments
	
	public Comments deleteComments(Long comId) {
		Comments com=null;
			if(commentsRepository.existsById(comId)) {
				com=commentsRepository.findById(comId).get();
				commentsRepository.deleteById(comId);
			}//if exists
		return com;
	}//deleteProducto

	public Comments updateComments(Long comId, String content, Long rating, Long approved) {
		Comments com=null;
		
			if(commentsRepository.existsById(comId)) {
				Comments comments = commentsRepository.findById(comId).get();
				if (content != null) comments.setContent(content);
				if (rating !=null) comments.setRating(rating);
				if(approved !=null) comments.setApproved(approved);
				commentsRepository.save(comments);
				com=comments;
			}//exists
		return com;
	}//updatecomments

}//class CommentsService
