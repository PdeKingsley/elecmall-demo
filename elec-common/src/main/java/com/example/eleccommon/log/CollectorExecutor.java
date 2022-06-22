package com.example.eleccommon.log;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class CollectorExecutor {

    /**
     * 异步
     * @param collector
     * @param data
     * @param <D>
     */
    @Async("AsyncCollector")
    public <D> void AsyncExecutor(Collector<D> collector,D data){
        execute(collector,data);
    }

    /**
     * 同步
     * @param collector
     * @param data
     * @param <D>
     */
    public <D> void execute(Collector<D> collector,D data){
        collector.collect(data);
    }
}
