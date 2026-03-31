package dao.impl;
import dao.AuthorDao;
import domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

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
}
