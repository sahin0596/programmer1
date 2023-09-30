package ms2aop.ms2aop.Service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class ExecutionTimeLogger {
     @Pointcut("execution(  * ms2aop.ms2aop.Service.GoodServiceImp.*(..))")
    public  void logExecutionTimePc(){

    }
    @SneakyThrows
    @Around(value = "logExecutionTimePc()")
    public void logExecutionTime(ProceedingJoinPoint pc){
         long started = System.currentTimeMillis();
         log.info("Fake Database");
         pc.proceed();
         long ended = System.currentTimeMillis();
        log.info("Elapsed Time {}",ended-started);

    }
    @SneakyThrows
    @Before(value = "logExecutionTimePc()")
    public void logExecutionTime(JoinPoint joinPoint){
        Arrays.stream(joinPoint.getArgs())
                .forEach((arg) -> log.info("arguments are {}",arg));
    {

        }


}}
