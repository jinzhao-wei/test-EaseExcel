package excel;

import com.alibaba.excel.annotation.ExcelProperty;

public class ExcelObject {

    @ExcelProperty(value = "学生编号",index = 0)
    private Integer sno;

    @ExcelProperty(value = "学生实体",index = 1)
    private String sname;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "ExcelObject{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
