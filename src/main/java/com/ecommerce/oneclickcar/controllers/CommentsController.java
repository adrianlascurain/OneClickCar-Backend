package com.ecommerce.oneclickcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.oneclickcar.model.Comments;
import com.ecommerce.oneclickcar.service.CommentsService;

@RestController
@RequestMapping(path="/api/comments/") //	http://localhost:8080/api/comments/
public class CommentsController {
	
	private final CommentsService commentsService;
	@Autowired
	public CommentsController(CommentsService commentsService) {
		this.commentsService = commentsService;
	}//constructor
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping
	public List<Comments> getComments() {
		return commentsService.getAllComments();
	}//getComments
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping (path="{comId}") //http://localhost:8080/api/comments/1
	public Comments getComments(@PathVariable("comId") Long comId) {
		return commentsService.getComments(comId);
	}//getComment
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PostMapping
	public Comments addComments(@RequestBody Comments comments) {
		return commentsService.addComments(comments);
	}//postMapping
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@DeleteMapping(path="{comId}") //http://localhost:8080/api/comments/1
	public Comments deleteComments (@PathVariable("comId") Long comId) {
		return commentsService.deleteComments(comId);
	}//deleteComments
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PutMapping(path="{comId}") //http://localhost:8080/api/comments/1
	public Comments updateComments(@PathVariable("comId") Long comId,
									@RequestParam(required=false) String content,
									@RequestParam(required=false) Long rating,
									@RequestParam(required=false) Long approved) {
		return commentsService.updateComments(comId, content, rating, approved);
	}//updateComments
	
}// class CommentsController
