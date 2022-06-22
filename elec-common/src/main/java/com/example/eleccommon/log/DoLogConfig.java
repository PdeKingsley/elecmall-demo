package com.example.eleccommon.log;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;

@Data
public class DoLogConfig {
    /**
     * 仅当发生异常时才记录
     */
    private boolean logOnErr;
    /**
     * 操作标签(操作分类)
     */
    private String tag;
    /**
     * 记录的headers ,默认记录 content-type user-agent
     */
    private String[] headers;
    /**
     * 切面是否记录 请求参数
     */
    private boolean args;
    /**
     * 切面是否记录 响应参数
     */
    private boolean respBody;
    /**
     * 当发生异常时,AOP是否追加异常堆栈信息到content
     */
    private boolean stackTraceOnErr;
    /**
     * 异步模式 收集日志
     */
    private boolean asyncMode;
    /**
     * 指定专门的收集器
     */
    private Class<? extends LogCollector> collector;

    public DoLogConfig() {
        this.logOnErr = false;
        this.tag = "undefined";
        this.headers = new String[]{HttpHeaders.USER_AGENT, HttpHeaders.CONTENT_TYPE};
        this.args = true;
        this.respBody = true;
        this.stackTraceOnErr = true;
        this.asyncMode = true;
        this.collector = NothingCollector.class;
    }
}
