package com.example.elecsecurity.common.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

/**
 * @author wd
 *
 * @desciption 默认路径配置器
 */
public class DefaultAuthConfigAdapter implements AuthConfigAdapter{
    private static final Logger logger = LoggerFactory.getLogger(DefaultAuthConfigAdapter.class);

    public DefaultAuthConfigAdapter() {
        logger.info("not implement other AuthConfigAdapter, use DefaultAuthConfigAdapter... all url need auth...");
    }

    @Override
    public List<String> pathPatterns() {
        return Collections.singletonList("/*");
    }

    @Override
    public List<String> excludePathPatterns() {
        return Collections.emptyList();
    }
}
