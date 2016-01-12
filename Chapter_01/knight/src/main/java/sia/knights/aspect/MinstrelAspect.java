package sia.knights.aspect;

import java.io.PrintStream;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Define a POJO class annotated with @Aspect
 * @author lmthien
 *
 */
@Aspect
public class MinstrelAspect {

	private PrintStream stream;

	public MinstrelAspect(PrintStream stream) {
		this.stream = stream;
	}

	@Pointcut("execution(* *embarkOnQuest(..))")
	public void embarkCalled() {
	}

//	@Before("embarkCalled()")
//	public void singBeforeQuest() {
//		stream.println("Fa la la, the knight is so brave!");
//	}
//
//	@After("embarkCalled()")
//	public void singAfterQuest() {
//		stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
//	}
	
	@Around("embarkCalled()") 
	public void singAroundQuest(ProceedingJoinPoint joinpoint) throws Throwable {
		stream.println("Before embarkOnQuest is called");
		joinpoint.proceed();
		stream.println("After embarkOnQuest is called");
	}

}
