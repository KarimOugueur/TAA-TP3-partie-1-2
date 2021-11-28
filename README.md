# TAA-TP3 partie 1 et 2

# Binôme : 
	- Karim OUGUEUR
	- Arnaud Yao Akoto 

# Partie 1 : Injection de dépendances
L'objectif de cette première partie est de prendre en amin le framework Spring et de maîtriser le processus de développement et de déploiement à l'aide de Spring.

pour cette parte 1, nous avions développé des classes comme c'était demandé dans le sujet( client, Irun, Store, Bank etc...), et nous avions également rajouté les injections de dépendances entre classes avec l'annotation <span style="color:red"> *@Autowired* text</span>. 

# Partie 2. Spring AOP :

Pour cette deuxième partie, nous avons créé une classe LogBeans pour les logs. 

le code de la classe LogAspect est le suivant : 

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
La fonction log nous permet d'avoir la trace d'exécution. 

Nous n'avons pas fini la parie sécurité, mais nous avons quand même regardé les videos. 
