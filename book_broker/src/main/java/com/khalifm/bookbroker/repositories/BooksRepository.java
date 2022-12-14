package com.khalifm.bookbroker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.khalifm.bookbroker.models.Books;

@Repository
public interface BooksRepository extends CrudRepository <Books, Long>{
	
	List<Books>findAll();
	List<Books> findByUserIdIs(Long userId);
	List<Books> findByBorrowerIdIs(Long userId);
	List<Books> findByBorrowerIdIsOrUserIdIs(Long borrowerID, Long userId);



	
}