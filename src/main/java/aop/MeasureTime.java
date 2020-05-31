package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Component
@Aspect
public class MeasureTime {
    @Around("execution(* service.*.*Search(..))")
    public void MeasureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object result = joinPoint.proceed();
        stopWatch.stop();
        System.out.println("걸린시간 : " + stopWatch.getTotalTimeMillis() + "ms");
    }
}
