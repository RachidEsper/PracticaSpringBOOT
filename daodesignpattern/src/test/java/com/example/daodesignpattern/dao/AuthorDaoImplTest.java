package com.example.daodesignpattern.dao;


import dao.impl.AuthorDaoImpl;
import domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.mockito.Mockito.verify;


/*
 Esta clase existe para probar el metodo crear autor, sin
 el uso de una conexion a psql
 */
@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTest {
    @Mock
    private JdbcTemplate jdbcTemplate;


    @InjectMocks
    private AuthorDaoImpl test;


    @Test
    public void testThatCreateAuthorGeneratesCorrectSql(){
        Author author = Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
        test.create(author);
        verify(jdbcTemplate).update(
                ArgumentMatchers.eq("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)"),
                ArgumentMatchers.eq(1L),ArgumentMatchers.eq("Abigail Rose"),ArgumentMatchers.eq(80)
        );

    }
}
