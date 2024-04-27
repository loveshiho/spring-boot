package com.akai.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("dept") // 当实体类类名和 dept表名不一致时发挥作用
public class Dept implements Serializable {
    /*@TableField(exist = false)
    private Integer age;*/  // 当数据库表中没有 age字段时发挥作用
    @TableField("deptno")  // 字段名称和属性名称不一致时发挥作用
    private Integer deptno;
    private String dname;
    private String loc;
}
