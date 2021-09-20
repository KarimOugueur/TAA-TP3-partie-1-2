package tp3.partie1.traceBeans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

@Aspect
@Component

public class SecureApp {
    
	//Utilisation de l'annotation @Around autour de la méthode transfert
	
	@Around("execution(public * sample.simple.bank..transfert(..))")
	public void log(ProceedingJoinPoint joinPoint) throws Throwable{
		System.err.println("****LoggingAspect- Before bank method call");  
		joinPoint.proceed();
		System.err.println("****LoggingAspect- After bank method call");  
	}