package com.example.elechelpcenter.common.utils;

import org.springframework.web.util.HtmlUtils;

/**
 * @author wd
 *
 * @description html富文本转换工具类
 */
public class HtmlTool {
    //html的特殊字符转换成符合Intel HEX文件的字符串
    public static void htmlToHex(String html){html = HtmlUtils.htmlEscapeHex(html);}

    //html的特殊字符反转换成html标签
    public static void hexToHtml(String html){html = HtmlUtils.htmlEscape(html);}
}
