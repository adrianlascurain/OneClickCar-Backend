package com.ecommerce.oneclickcar.repository;

import com.ecommerce.oneclickcar.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.oneclickcar.model.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

	

}
