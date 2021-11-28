# TAA-TP3 partie 2 

# Partie 1 : Injection de dépendances
L'objectif de cette première partie est de prendre en amin le fraimwork 
spring et de maitiser le prossus de développement et de déploiement à l'aide de Spring.

pour cette partei, nous avions développé des classes comme cc'était demandé dans le sujet
et nous avions également rajouté les injections de dépendances entre classes avec l'annotation @Autowired. 

# Partie 2. Spring AOP :

Pour cette deuxème partie, nousa avons créé une classe logBeans pour les logs. 

le code de la classe SecureApp est le suivant : 

```java
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
```
La focntion log nous permet d'avoir la tarace d'exécution. 

Nous n'avons pas fini la parie sécurité, mais nous avons quand même regardé les videos. 
