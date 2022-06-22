package com.example.eleccommon.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

public class DoLogProcessor {
    private final ApplicationContext applicationContext;
    private final CollectorExecutor collectorExecutor;
    private final LogCollector logCollector;
    private final Map<Class<? extends Collector>,Collector> collectorMap = new HashMap<>();
    private final String appName;

    @Autowired
    public DoLogProcessor(ApplicationContext applicationContext,CollectorExecutor collectorExecutor,LogCollector logCollector){
        this.applicationContext = applicationContext;
        this.collectorExecutor = collectorExecutor;
        this.logCollector = logCollector;
        this.appName = getAppName(applicationContext);
    }

    private String getAppName(ApplicationContext applicationContext){
        Environment environment = applicationContext.getEnvironment();
        String appName = environment.getProperty("spring.application.name");
        if(appName != null){
            return appName;
        }
        if(applicationContext.getId() != null){
            return applicationContext.getId();
        }
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements){
            if("main".equals(stackTraceElement.getFileName())){
                return stackTraceElement.getFileName();
            }
        }
        return applicationContext.getApplicationName();
    }

    public Object proceed(DoLogConfig config, LogData data, ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        return null;
    }
}
