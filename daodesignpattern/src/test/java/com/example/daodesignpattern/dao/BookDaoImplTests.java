package com.example.daodesignpattern.dao;


import dao.impl.BookDaoImpl;
import domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookDaoImplTests {
    @Mock
    private JdbcTemplate jdbcTemplate;


    @InjectMocks
    private BookDaoImpl test;

    @Test
    public void testThatCreateBookReturnsCorrectSql(){
        Book book = Book.builder().
                isbn("978-3-16-148410-0")
                .title("The Great Gatsby")
                .authorId(1L).
                build();

        test.create(book);
        verify(jdbcTemplate).update(
                eq("INSERT INTO books (isbn,title,author_id) VALUES (?, ?, ?)"),
                eq("978-3-16-148410-0"),
                eq("The Great Gatsby"),
                eq(1L)
        );
    }

}
