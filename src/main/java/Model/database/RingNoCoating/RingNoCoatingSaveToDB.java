package Model.database.RingNoCoating;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class RingNoCoatingSaveToDB
{
	AnnotationConfigApplicationContext ctx = 
            new AnnotationConfigApplicationContext(RingNoCoatingSaveToDB.class);
    RingNoCoatingDao ringNoCoatingDao = ctx.getBean(RingNoCoatingDao.class);
    //zapisujemy
    RingNoCoatingParameters ringNoCoatingParameters = new RingNoCoatingParameters();
    ringNoCoatingDao.save(ringNoCoatingParameters);
    
     ctx.close();
	 
	
}
