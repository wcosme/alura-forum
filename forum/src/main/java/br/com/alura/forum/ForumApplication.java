package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

//Com essa anotação (@EnableSpringDataWebSupport) habilitamos esse suporte, para o Spring pegar da requisição, dos parâmetros da url os campos, 
//as informações de paginação e ordenação, e repassar isso para o Spring data.
@EnableSpringDataWebSupport 
@SpringBootApplication
//habilita o uso de cache na aplicação.
@EnableCaching 
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
