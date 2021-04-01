package top.liekai.boot.mybatis.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author admin
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Clazz {
    /**
    * 班级Id
    */
    private Integer clazzId;

    /**
    * 班级姓名
    */
    private String clazzName;

    /**
    * 班级管理老师id
    */
    private Integer teacherId;
    /**
     * 一方声明多方集合
     */
    private  List<Student> students;
    /**
     *管理班级的教师对象（一对一）
     */
    private  Teacher teacher;
}