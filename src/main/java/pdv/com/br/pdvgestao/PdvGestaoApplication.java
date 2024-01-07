package pdv.com.br.pdvgestao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableAsync
@EntityScan(basePackages = "pdv.com.br.pdvgestao.model")
@ComponentScan(basePackages = {"pdv.*"})
@EnableJpaRepositories(basePackages = {"pdv.com.br.pdvgestao.repository"})
@EnableTransactionManagement
public class PdvGestaoApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(PdvGestaoApplication.class, args);
	}

}
