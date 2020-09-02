package com.springmvc.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Controller
public class FileUploadController {
    /**
     * 使用传统方式上传
     * @param body
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/upload01")
    public String uploadFile01(String body, HttpServletRequest request) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        File file = new File(path);
        // 判断如果upload文件夹不存在，则创建要和新的
        if (!file.exists()){
            file.mkdir();
        }
        // 解析request请求，获得上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 解析request
        Map<String, List<FileItem>> listMap = upload.parseParameterMap(request);
        for (String s : listMap.keySet()) {
            List<FileItem> items = listMap.get(s);
            for (FileItem item : items) {
                // 判断item是否是文件项
                if (item.isFormField()){
                    // 说明是表单项
                }
                else {
                    // 文件项
                    // 获取文件名
                    String name = item.getName();
                    // 完成文件上传
                    item.write(new File(path, name));
                }
            }
        }
        return "success";
    }
    /**
     * 使用springmvc上传
     */
    @RequestMapping("/upload02")
    public String upload02(HttpServletRequest request, MultipartFile upload) throws IOException {
        // 获得需要上传的路径
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        // 获取文件的名字
        String name = upload.getOriginalFilename();
        // 上传文件
        upload.transferTo(new File(path, name));
        return "success";
    }
}
