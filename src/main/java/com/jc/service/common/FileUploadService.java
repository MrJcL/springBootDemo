package com.jc.service.common;

import com.jc.configBean.CommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @program: springBootDemo
 * @Date: 2018/12/12 17:13
 * @Author: LiJc
 * @Description:
 */
@Service
public class FileUploadService {

    @Autowired
    private CommonConfig commonConfig;

    /**
     * 上传文件
     * @param request
     * @return
     */
    public String upload(HttpServletRequest request){
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        //  上传失败数量
        int num = 0;
        String message = "上传成功！";
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                num++;
            }
            boolean flag = uploadBase(file);
            if(!flag){
                num++;
            }
        }
        if(num>0){
            message = "上传失败数量："+num;
        }
        return message;
    }

    /**
     * 上传文件（单个）
     * @param file
     * @return
     */
    public boolean uploadBase(MultipartFile file){
        //  文件名
        String fileName = file.getOriginalFilename();
        //  上传路径
        String filePath = commonConfig.getFilePath() + fileName;
        System.out.println("=====================filePath:"+filePath);
        //  创建文件
        File dest = new File(filePath);
        try {
            file.transferTo(dest);
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
