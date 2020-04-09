package com.wrx.js.web;

import com.alibaba.excel.annotation.ExcelIgnore;
import lombok.Data;

import java.util.List;

/**
 * @author jiaosong
 * @desc
 * @date 2020/4/6
 */
@Data
public class StudentVo {
    @ExcelIgnore
    private int id;
    private String name;
    private int age;
    private String sex;
    private List<Subject> subjects;

    @Data
    public static class Subject {
        String subjectName;
        String score;
    }
}
