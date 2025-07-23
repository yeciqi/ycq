package org.example;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.Pictures;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import org.example.dto.InstrumentInfo;
import org.example.dto.ReportData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test2 {
    public static void main(String[] args) throws IOException {

        // 获取预设数据
        ReportData reportData = new ReportData();
        List<InstrumentInfo> LayersData = InstrumentInfo.getData();

        //表格
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder()
                .bind("LayersData", policy).build();//.bind("labors", policy)

        //文档地址
        String resource = "C:\\Users\\ycq的办公电脑\\Desktop\\fljc.docx";


        //操作
        XWPFTemplate template = XWPFTemplate.compile(resource, config).render(
                new HashMap<String, Object>(){{
                    //首页
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

                    //器械表格
                    put("LayersData", LayersData);
                }});

//
//        XWPFTemplate template2 = XWPFTemplate.compile(resource, config).render(
//                new HashMap<String, Object>() {{
//                    put("LayersData", LayersData);
//                    //put("labors", labors);
//                }}
//        );

        String desktopPath = System.getProperty("user.home") + "\\Desktop\\modified_fljc.docx";
        template.writeAndClose(new FileOutputStream(desktopPath));
        //template2.writeAndClose(new FileOutputStream(desktopPath));
    }

}
