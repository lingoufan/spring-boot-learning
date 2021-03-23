package top.liekai.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author admin
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudent {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 课程id
    */
    private Integer courseId;

    /**
    * 学生id
    */
    private Integer studentId;
}