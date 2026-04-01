package dao.impl;
import dao.AuthorDao;
import domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class AuthorDaoImpl  implements AuthorDao {

    private JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        String sql = "INSERT INTO authors (id, name, age) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, author.getId(), author.getName(), author.getAge());
    }

    @Override
    public Optional<Author> findOne(long authorId) {
        String sql = "SELECT * FROM authors WHERE id = ?";
        List<Author> authors =jdbcTemplate.query(sql, new AuthorRowMapper(), authorId);
         return authors.stream().findFirst();
    }

    // Me convierte una fila de registro SQL en un objeto con sus respectivos campos
    public static class AuthorRowMapper implements RowMapper<Author> {
        @Override
        public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Author.builder().
                    id(rs.getLong("id"))
                    .name(rs.getNString("name"))
                    .age(rs.getInt("age"))
                    .build();
        }
    }
}
