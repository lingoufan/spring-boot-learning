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
}