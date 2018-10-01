package by.vinty.books.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"by.vinty.books.entity"})
@EnableJpaRepositories(basePackages = {"by.vinty.books.repository"})
@EnableTransactionManagement
@ComponentScan(basePackages = {"by.vinty.books.services"})
public class RepositoryConfigurationTest {
}
