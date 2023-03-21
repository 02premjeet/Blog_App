package com.myblogapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.myblogapp.entites.Category;
import com.myblogapp.entites.Post;
import com.myblogapp.entites.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	@Query("select p from Post p where p.title like:key")
	List<Post> findByTitle(@Param("key") String title);
}
