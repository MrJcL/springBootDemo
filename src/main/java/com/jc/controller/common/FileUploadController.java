package com.jc.controller.common;

import com.jc.service.common.FileUploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springBootDemo
 * @Date: 2018/12/12 18:01
 * @Author: LiJc
 * @Description:
 */
@Controller //等同于同时加上了@Controller和@ResponseBody
@RequestMapping(value = "/upload")
@Api(tags = "FileUploadController", description = "上传文件相关的api")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping("/index")
    public String uploadView(){
        return "upload";
    }

    @PostMapping("/execute")
    @ResponseBody
    @ApiOperation(value="上传文件", notes="上传文件")
    public String execute(HttpServletRequest request){
        return this.fileUploadService.upload(request);
    }
}
