package cn.yh.beancopy.copytest;

import cn.yh.beancopy.util.CopyUtil;
import cn.yh.beancopy.entity.Employee;
import cn.yh.beancopy.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author: liuyuhang
 * @date: 2020/11/18
 */
@Slf4j
public class BeanCopyTest {


    /**
     * 把 Employee 对象拷贝给 User 对象
     * 注意: Employee 对象有三个参数 name,age,dept
     *      User 对象有两个参数     name,age
     *
     *  只拷贝了两个对象公有的对象，拷贝对象的 字段要一样，否则会拷贝失败
     */
    @Test
    public void test(){
        Employee ee1=new Employee("A",21,"it");

        User user=new User();
        CopyUtil.copyProperties(ee1, user);

        log.info("拷贝之前的对象是:"+ee1);
        log.info("拷贝后的对象是："+user);

    }
}
