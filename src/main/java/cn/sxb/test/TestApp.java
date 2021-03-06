package cn.sxb.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by SXB on 2018/7/26.
 */
@Controller
@SpringBootApplication
public class TestApp {
    public static void main(String[] args) {
        SpringApplication.run(TestApp.class);
    }

    @RequestMapping("/test")
    @ResponseBody
    public boolean get(){
        return true;
    }
    ///this is test
    @RequestMapping("/abc")
    @ResponseBody
    public String abc(){
        return this.toString();//8888888888888888888888
    }
}
