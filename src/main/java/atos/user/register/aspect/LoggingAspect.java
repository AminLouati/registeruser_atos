package atos.user.register.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.controller.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Calling method: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(
        pointcut = "execution(* com.example.controller.*.*(..))",
        returning = "result"
    )
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("Returned from method: " + joinPoint.getSignature().toShortString());
    }
}


