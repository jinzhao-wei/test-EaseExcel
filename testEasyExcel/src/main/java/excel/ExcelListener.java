package excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.util.ConverterUtils;

import java.util.Map;

public class ExcelListener extends AnalysisEventListener<ExcelObject> {
    //一行一行读取
    @Override
    public void invoke(ExcelObject excelObject, AnalysisContext analysisContext) {
        System.out.println("^^^"+excelObject);
    }
    //表头读取
    @Override
    public void invokeHead(Map<Integer, CellData> headMap, AnalysisContext context) {
        System.out.println("表头"+headMap);
    }
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
