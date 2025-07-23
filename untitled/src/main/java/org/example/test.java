package org.example;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {

        //模板目录
        File file = new File("C:\\Users\\ycq的办公电脑\\Desktop\\fljc.docx");
        //输出流
        FileInputStream fin = new FileInputStream(file);
        //创建新文档
        XWPFDocument doc = new XWPFDocument(fin);


        // 替换内容
        replaceTextInDocument(doc, "项目地址123", "广州市番禺区广州市番禺区沙湾街沙湾古镇");

        //创建执行器
        XWPFWordExtractor extractor = new XWPFWordExtractor(doc);

        //获取文本内容
        String text = extractor.getText();
        System.out.println(text);


        //创建段落
        XWPFParagraph newParagraph = doc.createParagraph();

        //生成路径
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\modified_fljc.docx";
        try (FileOutputStream out = new FileOutputStream(desktopPath)) {
            doc.write(out);
        }
        System.out.println("修改后的文档已保存至桌面：" + desktopPath);

        //关闭流
        fin.close();
        doc.close();

    }

    private static void replaceTextInDocument(XWPFDocument doc, String oldText, String newText) {
        for (XWPFParagraph paragraph : doc.getParagraphs()) {
            List<XWPFRun> runs = paragraph.getRuns();

            if (runs != null) {
                for (XWPFRun run : runs) {
                    String text = run.getText(0);
                    if (text != null && text.contains(oldText)) {
                        text = text.replace(oldText, newText);
                        run.setText(text, 0); // 替换第一个文本片段
                    }
                }
            }
        }
    }
}
