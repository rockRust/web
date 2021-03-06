package com.wrx.js.web.controller;

import com.alibaba.excel.EasyExcel;
import com.wrx.js.web.model.StudentVo;
import com.wrx.js.web.reponse.ResultData;
import com.wrx.js.web.service.ExcelCreatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

/**
 * @author jiaosong
 * @desc
 * @date 2020/4/6
 */
@Slf4j
@RestController
public class ExcelDownloadController {

    @Autowired
    private ExcelCreatService mExcelCreatService;

    @RequestMapping(value = "/hello")
    public ResultData hello(HttpServletRequest request) {
        log.info("hello world");
        return ResultData.of("hello");
    }

    @RequestMapping(value = "/download")
    public void download(HttpServletResponse response) throws Exception {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition",
                "attachment;filename=" + URLEncoder.encode("产品在班学员列表.xlsx", "UTF-8"));
        EasyExcel.write(response.getOutputStream(), StudentVo.class).withTemplate("D:\\mycode\\财务导出表格.xlsx").sheet("学生").doWrite(mExcelCreatService.getSomeStudent(2));
    }
}
