package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class InstrumentInfo {

        private int id;                  // 编号
        private String instrumentName;    // 仪器名称
        private String instrumentModel;   // 仪器型号
        private String instrumentNumber;  // 仪器编号

    /**
     * 静态方法：返回初始化数据
     */
    public static List<InstrumentInfo> getData() {
        List<InstrumentInfo> list = new ArrayList<>();
        list.add(new InstrumentInfo(1, "数字万用表", "FLUKE 87V", "SN1001"));
        list.add(new InstrumentInfo(2, "钳形电流表", "FLUKE 345", "SN1002"));
        list.add(new InstrumentInfo(3, "示波器", "Tektronix TBS1102", "SN2001"));
        list.add(new InstrumentInfo(4, "信号发生器", "Rigol DG1022Z", "SN2002"));
        list.add(new InstrumentInfo(5, "绝缘电阻测试仪", "Megger MIT400", "SN3001"));
        list.add(new InstrumentInfo(6, "接地电阻测试仪", "Fluke 1625", "SN3002"));
        list.add(new InstrumentInfo(7, "红外热像仪", "FLIR T620", "SN4001"));
        list.add(new InstrumentInfo(8, "温湿度计", "Testo 608", "SN4002"));
        return list;
    }

    public InstrumentInfo(int id, String instrumentName, String instrumentModel, String instrumentNumber) {
            this.id = id;
            this.instrumentName = instrumentName;
            this.instrumentModel = instrumentModel;
            this.instrumentNumber = instrumentNumber;
        }

        // Getter 和 Setter 方法
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getInstrumentName() {
            return instrumentName;
        }

        public void setInstrumentName(String instrumentName) {
            this.instrumentName = instrumentName;
        }

        public String getInstrumentModel() {
            return instrumentModel;
        }

        public void setInstrumentModel(String instrumentModel) {
            this.instrumentModel = instrumentModel;
        }

        public String getInstrumentNumber() {
            return instrumentNumber;
        }

        public void setInstrumentNumber(String instrumentNumber) {
            this.instrumentNumber = instrumentNumber;
        }



    // toString 方法（可选）
        @Override
        public String toString() {
            return "InstrumentInfo{" +
                    "id=" + id +
                    ", instrumentName='" + instrumentName + '\'' +
                    ", instrumentModel='" + instrumentModel + '\'' +
                    ", instrumentNumber='" + instrumentNumber + '\'' +
                    '}';
        }


}