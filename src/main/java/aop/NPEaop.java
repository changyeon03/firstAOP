package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NPEaop {
    @AfterThrowing(pointcut="execution(* service.*.*(..))", throwing="ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex){
        // 메소드 호출이 예외를 던졌을 때 동작
        //메소드 명을 어떻게 출력하지 ㅠㅠㅠㅜㅠㅜㅠㅜㅠㅜㅠㅜ
        System.out.println("method : " + joinPoint.getSignature().getName());
        System.out.println("ex message : " + ex.toString());
    }
}


