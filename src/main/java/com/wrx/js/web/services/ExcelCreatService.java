package com.wrx.js.web.services;

import com.wrx.js.web.StudentVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaosong
 * @desc
 * @date 2020/4/6
 */
@Service
public class ExcelCreatService {

    public List<StudentVo> getSomeStudent(int count) {
        List<StudentVo> students = new ArrayList<StudentVo>();
        for (int i = 0; i < count; i++) {
            StudentVo studentVo = new StudentVo();
            studentVo.setId(i);
            studentVo.setName("test" + i);
            students.add(studentVo);
        }
        return students;
    }
}
