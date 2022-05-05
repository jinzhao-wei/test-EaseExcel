package excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
       // write();
        read();
    }
    //实现写操作
    public static void write(){
        String fileName="A:/GuLi Institute/WriteExcel/test_write.xlsx";
        List<ExcelObject> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            ExcelObject object=new ExcelObject();
            object.setSno(i);
            object.setSname("joker"+i);
            list.add(object);
        }
        EasyExcel.write(fileName, ExcelObject.class).sheet("学生列表").doWrite(list);
    }
    //实现读操作
    public static void read(){
        String filePath="A:/GuLi Institute/WriteExcel/test_write.xlsx";
        EasyExcel.read(filePath,ExcelObject.class,new ExcelListener()).sheet().doRead();
    }
}
