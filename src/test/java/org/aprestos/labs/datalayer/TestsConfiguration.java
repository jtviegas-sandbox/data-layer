package org.aprestos.labs.datalayer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("org.aprestos.labs.datalayer.repositories")
@EntityScan("org.aprestos.labs.datalayer.model")
@SpringBootApplication
@Configuration
@EnableTransactionManagement
public class TestsConfiguration {

}
