package com.scoremg.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @program: demo
 * @description:
 * @author: 陈程猿
 * @create: 2024-12-11 08:39
 **/

@Aspect
@Component
public class HttpAspect {

    private static final Logger logger= LoggerFactory.getLogger(HttpAspect.class);

    /**
     *   * com.example.demo.api.TeacherApiController.*(..)
     *   第一个*  表示任何返回值 第二个* 表示任一方法 后面括号的两点 表示任一输入参数
     */
    @Pointcut("execution(* com.scoremg.api.*.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(){
        logger.info("开始执行api..........");
    }

    @After("log()")
    public void doAfter(){
        logger.info("api执行结束..........");
    }

    // 返回值
    @AfterReturning(pointcut = "log()",returning = "object")
    public void AfterR(Object object){
        logger.info("object:{}",object);
    }

    @Around("log()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable { //循环通知 输入参数连接点的进程
        StopWatch stopWatch = new StopWatch(); //观察对象
        stopWatch.start(); // 计数器

        Object obj = pjp.proceed(pjp.getArgs());

        stopWatch.stop(); // 计时结束

        long cost = stopWatch.getTotalTimeMillis();
        MethodSignature signature = (MethodSignature)pjp.getSignature();
        String methodName = signature.getDeclaringTypeName() + "." + signature.getName();
        logger.info("......执行"+methodName+"方法用时:"+cost+"ms..........");
        return obj;
    }
}
