package jp.ne.hyukke.wts.hello.persistence;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = "jp.ne.hyukke.wts.hello.persistence.entity")
@EnableJpaRepositories(basePackages = "jp.ne.hyukke.wts.hello.persistence.repository")
public class PersistenceConfig {

}
