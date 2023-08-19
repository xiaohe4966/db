package cn.he4966.flex;


import cn.he4966.test.domain.TbArticle;
import cn.he4966.test.domain.User;
import cn.he4966.test.mapper.TbArticleMapper;
import cn.he4966.test.mapper.UserMapper;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class FlexApplicationTests {
    //
    @Test
    void contextLoads() {
    }


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TbArticleMapper tbArticleMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- 开始打印输出 ------"));
        List<User> userList = userMapper.selectList(null);

//        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印 ------"));
    }

    @Test
    public void testId小于3() {
        System.out.println(("----- 开始打印输出id<3 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.lt("id", 3);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印输出id<3 ------"));
    }


    @Test
    public void testId大于3() {
        System.out.println(("----- 开始打印输出id>3 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.gt("id", 3);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印输出id>3 ------"));
    }

    @Test
    public void testId大于等于3() {
        System.out.println(("----- 开始打印输出id>=3 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.ge("id", 3);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印输出id>=3 ------"));
    }

    @Test
    public void Id小于等于3() {
        System.out.println(("----- 开始打印输出id<=3 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.le("id", 3);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印输出id<=3 ------"));
    }


    @Test
    public void email模糊搜索() {
        System.out.println(("----- 开始打印输出email模糊搜索 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.like("email", "est");
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印输出email模糊搜索 ------"));
    }

    @Test
    public void email模糊搜索加age大于等于() {
        System.out.println(("----- 开始打印输出email模糊搜索加age大于等于 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.like("email", "est");
        wrapper.ge("age", 21);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印输出email模糊搜索加age大于等于 ------"));
    }


    @Test
    public void email模糊搜索加age大于() {
        System.out.println(("----- 开始打印输出email模糊搜索加age大于 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.like("email", "est");
        wrapper.gt("age", 21);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
        System.out.println(("----- 结束打印输出email模糊搜索加age大于 ------"));
    }


    @Test
    public void 翻页() {
        System.out.println(("----- 开始打印输出翻页 ------"));
        //        注意记得要添加分页配置
        Page<User> page = new Page<>(1, 2);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("id", 1);
        Page<User> userList = userMapper.selectPage(page, wrapper);

        System.out.println(JSON.toJSONString(userList));
        System.out.println("————————————————————————");
        System.out.println(userList.getTotal());
        System.out.println("————————————————————————");
        List<User> list = userList.getRecords();
        String jsonString = JSON.toJSONString(list);

        System.out.println(jsonString);
        System.out.println(("----- 结束打印输出翻页 ------"));
    }

    @Test
    public void 统计数量() {
        System.out.println(("----- 开始打印输出统计数量 ------"));
        QueryWrapper wrapper = new QueryWrapper<User>();
        wrapper.like("email", "est");
        wrapper.gt("age", 21);
        Long count = userMapper.selectCount(wrapper);

        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);

        System.out.println(count);
        System.out.println(("----- 结束打印输出统计数量 ------"));
    }



    @Test
    public void 统计文章数量() {
        System.out.println(("----- 开始打印输出统计数量 ------"));
        QueryWrapper wrapper = new QueryWrapper<TbArticle>();
        wrapper.like("title", "标题");
//        wrapper.gt("id", 1);
        Long count = tbArticleMapper.selectCount(wrapper);

        List<TbArticle>list = tbArticleMapper.selectList(wrapper);
        list.forEach(System.out::println);

        System.out.println(count);
        System.out.println(("----- 结束打印输出统计数量 ------"));
    }

}
