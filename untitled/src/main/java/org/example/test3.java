package org.example;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import org.example.dto.InstrumentInfo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test3 {
    public static void main(String[] args) throws IOException {

        //文档地址
        String resource = "C:\\Users\\ycq的办公电脑\\Desktop\\fljc.docx";

        //表格
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        // 获取预设数据
        List<InstrumentInfo> LayersData = InstrumentInfo.getData();

        // 输出数据
        for (InstrumentInfo info : LayersData) {
            System.out.println(info);
        }
        Configure config = Configure.builder()
                .bind("LayersData", policy).build();//.bind("labors", policy)

        XWPFTemplate template2 = XWPFTemplate.compile(resource, config).render(
                new HashMap<String, Object>() {{
                    put("LayersData", LayersData);
                    //put("labors", labors);
                }}
        );

        String desktopPath = System.getProperty("user.home") + "\\Desktop\\modified_fljc.docx";
        template2.writeAndClose(new FileOutputStream(desktopPath));
    }
}
