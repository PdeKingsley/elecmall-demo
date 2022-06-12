package com.example.elechelpcenter.controller;

import com.example.elechelpcenter.common.entity.JsonResult;
import com.example.elechelpcenter.common.utils.HtmlTool;
import com.example.elechelpcenter.common.utils.ResultTool;
import com.example.elechelpcenter.entity.HelpCenterDocument;
import com.example.elechelpcenter.service.HelpCenterDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpCenterDocumentController {
    @Autowired
    HelpCenterDocumentService helpCenterDocumentService;

    @GetMapping("/helpCenter/document/i/{id}")
    public JsonResult getDocumentById(@PathVariable(value = "id") Integer id){
        HelpCenterDocument document = helpCenterDocumentService.queryById(id);
        if(document == null){
            return ResultTool.fail();
        }
        //将数据库存储文档转换为h5文档格式
        HtmlTool.hexToHtml(document.getContent());
        return ResultTool.success(document);
    }

    @GetMapping("/helpCenter/document/t/{title}")
    public JsonResult getDocumentByTitle(@PathVariable(value = "title") String title){
        HelpCenterDocument document = helpCenterDocumentService.queryByTitle(title);
        if(document == null){
            return ResultTool.fail();
        }
        //将数据库存储文档转换为h5文档格式
        HtmlTool.hexToHtml(document.getContent());
        return ResultTool.success(document);
    }

    @PutMapping("/helpCenter/insert")
    public JsonResult insertDocument(@RequestBody HelpCenterDocument helpCenterDocument){
        //将h5文档格式转换为数据库存储格式
        if(helpCenterDocument.getContent() == null) {
            return ResultTool.fail();
        }
        HtmlTool.htmlToHex(helpCenterDocument.getContent());
        HelpCenterDocument document = helpCenterDocumentService.insert(helpCenterDocument);
        if(document == null){
            return ResultTool.fail();
        }
        return ResultTool.success(document);
    }

    @PutMapping("/helpCenter/update")
    public JsonResult updateDocument(@RequestBody HelpCenterDocument helpCenterDocument){
        //将h5文档格式转换为数据库存储格式
        if(helpCenterDocument.getContent() == null) {
            return ResultTool.fail();
        }
        HtmlTool.htmlToHex(helpCenterDocument.getContent());
        HelpCenterDocument document = helpCenterDocumentService.update(helpCenterDocument);
        if(document == null){
            return ResultTool.fail();
        }
        return ResultTool.success(document);
    }

    @DeleteMapping("/helpCenter/delete/{id}")
    public JsonResult deleteDocument(@PathVariable Integer id){
        boolean result = helpCenterDocumentService.deleteById(id);
        if(!result){
            return ResultTool.fail();
        }
        return ResultTool.success(id);
    }
}
