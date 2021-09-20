package tp3.partie1.traceBeans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TraceBean {
    // A mettre en commentaire avant SecureMonitor
	@Before("execution(public * sample.simple..*(..))")
	public void log(JoinPoint pjp){
		System.err.println("calling : " + pjp.getTarget().getClass().getName() + " -> " + pjp.getSignature().getName());  
    }
    
}
