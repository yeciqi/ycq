package org.example.dto;

public class ReportData {

    private String name;
    private String address;
    private String image1;
    private String image2;
    private String date;
    private String image;
    private String taddress;
    private String phone;
    private String email;

    public ReportData() {
        // 初始化数据，也可以从数据库或接口获取
        this.name = "(项目调用)新项目0717";
        this.address = "广州市番禺区广州市番禺区沙湾街沙湾古镇";
        this.image1 = "D:\\FLJC\\fljc-ui\\public\\figureimg\\nok.png";
        this.image2 = "D:\\FLJC\\fljc-ui\\public\\figureimg\\ok.png";
        this.date = "2026年07月17日前";
        this.image = "D:\\FLJC\\fljc-ui\\public\\figureimg\\2Dcode.png";
        this.taddress = "广东省广州市番禺区沙头街景观大道5号办公楼1楼";
        this.phone = "3075116746@qq.com";
        this.email = "020-34808655";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getImage1() {
        return image1;
    }

    public String getImage2() {
        return image2;
    }

    public String getDate() {
        return date;
    }

    public String getImage() {
        return image;
    }

    public String getTaddress() {
        return taddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
