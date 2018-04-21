package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Article;
import softuniBlog.entity.Role;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}