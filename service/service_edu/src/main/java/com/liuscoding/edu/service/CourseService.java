package com.liuscoding.edu.service;

import com.liuscoding.edu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liuscoding.edu.model.form.CourseInfoForm;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author liusCoding
 * @since 2020-05-10
 */
public interface CourseService extends IService<Course> {

    /**
     *  保存课程信息
     * @param courseInfoForm 课程信息
     * @return String 课程id
     */
    String saveCourseInfo(CourseInfoForm courseInfoForm);
}
