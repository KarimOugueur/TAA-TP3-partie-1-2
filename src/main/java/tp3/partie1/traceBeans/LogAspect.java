package tp3.partie1.traceBeans;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 *  https://gayerie.dev/docs/spring/spring/aop.html
 */

@Aspect
@Component
public class LogAspect {

	
	@Pointcut("execution (public * tp3.partie1.*..*(..))")
	public void methodCall() {}

	@Before("execution(public * tp3.partie1..*(..))")
	public void log(JoinPoint joinPoint){
		System.err.println("calling : " + joinPoint.getTarget().getClass().getName() + " -> " + joinPoint.getSignature().getName());  
    }

	/**
	 * @param joinPoint 
	 * @param exception
	 */

	@AfterThrowing(pointcut = "methodCall()", throwing = "e")
	public void log(JoinPoint joinPoint, Throwable exception) {
	  System.out.printf("Retour de %s avec une exception %s%n",
						joinPoint.toShortString(),
						exception.getClass().getSimpleName());
	}





    
}
