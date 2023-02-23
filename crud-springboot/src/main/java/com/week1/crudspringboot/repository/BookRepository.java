package com.week1.crudspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.week1.crudspringboot.entity.BookEntity;



@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
