package com.tom.scratch.service;

import com.tom.scratch.dao.UserDTO;
import com.tom.scratch.dao.UserService;
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
    private UserService userService;

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
        UserDTO user = new UserDTO("Jerry", 25);

        boolean result = userService.insert(user);
        Assert.assertThat(true, CoreMatchers.equalTo(result));
    }
}
