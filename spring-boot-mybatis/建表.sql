# 建表脚本

DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher`
(
    `teacher_id`   int(11) NOT NULL AUTO_INCREMENT COMMENT '教师id',
    `teacher_name` varchar(50) COMMENT '教师姓名',
    `clazz_id`     int(11) NOT NULL COMMENT '教师管理的班级id',
    PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = DYNAMIC;

INSERT INTO `t_teacher`
VALUES (1, '许老师', 1);
INSERT INTO `t_teacher`
VALUES (2, '王老师', 2);

# 班级表，和教师一对一
DROP TABLE IF EXISTS `t_clazz`;
CREATE TABLE `t_clazz`
(
    `clazz_id`   int(11) NOT NULL AUTO_INCREMENT COMMENT '班级id',
    `clazz_name` varchar(50) COMMENT '班级名称',
    `teacher_id` int(11) NOT NULL COMMENT '班级管理老师的id',
    PRIMARY KEY (`clazz_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = DYNAMIC;

INSERT INTO `t_clazz`
VALUES (1, '软件1921', 1);
INSERT INTO `t_clazz`
VALUES (2, '软件1911', 2);

# 学生表，和
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`
(
    `student_id`   int(11) NOT NULL AUTO_INCREMENT COMMENT '学生id',
    `clazz_id`   int(11) NOT NULL COMMENT '学生所属班级的id',
    `student_name` varchar(50) COMMENT '学生姓名',
    `hometown` varchar(100) COMMENT '学生籍贯',
    `birthday` date COMMENT '出生日期',
    PRIMARY KEY  (`student_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE  = utf8mb4_general_ci
  ROW_FORMAT = DYNAMIC;

INSERT INTO `t_student` VALUES (1001, 1, '金晨星', '江苏苏州 ', '2000-08-18');
INSERT INTO `t_student` VALUES (1002, 1, '李晨星', '江苏徐州 ', '2001-08-18');
INSERT INTO `t_student` VALUES (1003, 1, '张晨星', '江苏无锡 ', '2000-01-18');
INSERT INTO `t_student` VALUES (1004, 1, '王晨星', '江苏南京 ', '2001-07-18');
INSERT INTO `t_student` VALUES (1005, 1, '孙晨星', '江苏常州 ', '2001-05-18');
INSERT INTO `t_student` VALUES (1006, 2, '钱晨星', '江苏南通 ', '2000-12-18');
INSERT INTO `t_student` VALUES (1007, 2, '郭晨', '江苏盐城 ', '2001-09-18');
INSERT INTO `t_student` VALUES (1008, 2, '陈星', '江苏扬州 ', '2001-02-18');
#

# 课程表
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course`
(
    `course_id`   int(11) NOT NULL AUTO_INCREMENT COMMENT '课程id',
    `course_name` varchar(255) COMMENT '课程名称',
    PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

INSERT INTO `t_course`
VALUES (20001, '工业软件后端架构技术');
INSERT INTO `t_course`
VALUES (20002, '前端框架技术');

# 学生选课表，多对多
DROP TABLE IF EXISTS `t_course_student`;
CREATE TABLE `t_course_student`
(
    `id`         int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `course_id`  int(11) NOT NULL COMMENT '课程id',
    `student_id` int(11) NOT NULL COMMENT '学生id',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

INSERT INTO `t_course_student` VALUES (1, 20001, 1001);
INSERT INTO `t_course_student` VALUES (2, 20001, 1002);
INSERT INTO `t_course_student` VALUES (3, 20001, 1003);
INSERT INTO `t_course_student` VALUES (4, 20001, 1004);
INSERT INTO `t_course_student` VALUES (5, 20001, 1005);
INSERT INTO `t_course_student` VALUES (6, 20001, 1006);
INSERT INTO `t_course_student` VALUES (7, 20001, 1007);
INSERT INTO `t_course_student` VALUES (8, 20001, 1008);
INSERT INTO `t_course_student` VALUES (9, 20002, 1001);
INSERT INTO `t_course_student` VALUES (10, 20002, 1002);


