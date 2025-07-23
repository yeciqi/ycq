package org.example;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.Pictures;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class test2 {
    public static void main(String[] args) throws IOException {
        // 获取数据
        ReportData reportData = new ReportData();

        XWPFTemplate template = XWPFTemplate.compile("C:\\Users\\ycq的办公电脑\\Desktop\\fljc.docx").render(
                new HashMap<String, Object>(){{
                    put("name", reportData.getName());
                    put("address",reportData.getAddress());
                    //勾选
                    put("image1",reportData.getImage1());
                    put("image2", reportData.getImage2());
                    put("date", reportData.getDate());
                    // 图片文件
                    put("image", Pictures.ofLocal(reportData.getImage()).size(115, 115).create());
                    put("taddress",reportData.getTaddress());
                    put("phone", reportData.getPhone());
                    put("email", reportData.getEmail());
                }});
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\modified_fljc.docx";
        template.writeAndClose(new FileOutputStream(desktopPath));
    }
}
