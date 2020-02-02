package Model.database.RingNoCoating;


import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;


public class JpaConfig {

	public LocalEntityManagerFactoryBean createEMF() {
        LocalEntityManagerFactoryBean emf = new LocalEntityManagerFactoryBean();
        emf.setPersistenceUnitName("spring-jpa-pu");
        return emf;
    }
	
}
