package virtualstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*  
 * Ative apenas se o Spring não detectar automaticamente:  
 * - @EntityScan: Se entidades JPA não estiverem no pacote padrão.  
 * - @ComponentScan: Se componentes (@Service, @Controller) não forem encontrados.  
 * - @EnableJpaRepositories: Se repositórios JPA não forem detectados.  
 * - @EnableTransactionManagement: Raramente necessário (já habilitado por padrão).  
 */  
// @EntityScan(basePackages = "virtualstore.model")  
// @ComponentScan(basePackages = {"virtualstore.*"})  
// @EnableJpaRepositories(basePackages = {"virtualstore.repository"})  
// @EnableTransactionManagement  
@SpringBootApplication
public class VirtualStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualStoreApplication.class, args);
	}

}
