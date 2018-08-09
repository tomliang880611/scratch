package com.tom.scratch.service;

import com.tom.scratch.dao.StudentService;
import com.tom.scratch.domain.Student;
import mockit.Expectations;
import mockit.Mocked;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class ServiceTest {
    @Autowired
    private DoSomething sayer;

    @Autowired
    private StudentService studentService;

    @Test
    public void test_say_something() {
        sayer.sayHello();
    }

    @Test
    public void test_do_something(@Mocked Doer doer) {
        new Expectations(){{
            doer.doSomething(); result = false; times = 1;
        }};

        Assert.assertThat(
                false,
                CoreMatchers.equalTo(doer.doSomething())
        );
    }

    @Test
    public void test_add_a_user() {
        Student student = studentService.findById("1");
        Assert.assertThat(student.getAge(), CoreMatchers.equalTo(20));
        Assert.assertThat(student.getName(), CoreMatchers.equalTo("Jerry"));
    }
}
