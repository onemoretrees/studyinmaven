package cn.yh.beancopy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: liuyuhang
 * @date: 2020/11/18
 */
@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private Integer age;

    private String dept;
}
