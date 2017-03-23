package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by mapeiyu on 17-3-23.
 */
@Aspect
public class UsageStatsEventAspect {

    @Pointcut("execution(@com.example.UsageStatsEvent * *(..)) && @annotation(anno)")
    public void event(UsageStatsEvent anno) {}

    @Before("event(annotation)")
    public void injectEvent(JoinPoint joinPoint, UsageStatsEvent annotation) {
        System.out.println("ASPectJ >>>>>>>>" + joinPoint.toString() + "  annotationName:" + annotation.name() +"  annotationPage" +annotation.page());
    }
}
