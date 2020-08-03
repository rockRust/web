package com.wrx.js.web.repository.mysql;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author jiaosong
 * @desc
 * @date 2020/8/2
 */
@Repository
public interface TeacherInfoRepository {
    @Select("select teacher_id from pe_teacher_info where id = #{teacherId}")
    Object findByTeacherId(@Param("teacherId") Integer teacherId);
}
