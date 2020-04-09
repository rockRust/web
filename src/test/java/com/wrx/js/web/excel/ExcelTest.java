package com.wrx.js.web.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.wrx.js.web.StudentVo;
import com.wrx.js.web.services.ExcelCreatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @author jiaosong
 * @desc
 * @date 2020/4/6
 */
public class ExcelTest {
    @Autowired
    private ExcelCreatService mExcelCreatService;

    @Test
    public void createExcelWithTemplate() {
        String templateFileName = "D:\\mycode\\财务导出表格.xlsx";
        String fileName = "D:\\mycode\\students" + System.currentTimeMillis() + ".xlsx";
        ExcelWriter excelWriter = EasyExcel.write(fileName).withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        List<StudentVo> someStudent = mExcelCreatService.getSomeStudent(2);
        Map<String, List<Object>> contractQuarter = new HashMap<String, List<Object>>();
        for (int i = 0; i < someStudent.size(); i++) {
            List<Object> rowList = new ArrayList<Object>();
            StudentVo studentVo = someStudent.get(i);
            rowList.add(studentVo.getId());
            rowList.add(studentVo.getName());
            List<Object> objects = contractQuarter.get("1");
            for (int i1 = 0; i1 < objects.size(); i1++) {
                Object o = objects.get(i1);
            }
            excelWriter.write(Collections.singletonList(rowList), writeSheet);
        }
        excelWriter.finish();
    }

}
