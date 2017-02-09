package guru.springframework.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class BlogPostsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogPostsApplication.class, args);
    }
}
