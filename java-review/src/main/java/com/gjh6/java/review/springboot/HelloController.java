package com.gjh6.java.review.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-17
 * Time: 5:06 PM
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/")
    public String index() throws InterruptedException {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm:ss");
        LocalDateTime arrivalDate  = LocalDateTime.now();
        System.out.println("start:"+arrivalDate.format(format));
        int i=1;
        Thread.sleep(3000);
        i++;
        System.out.println("1");
        System.out.println("2");
        arrivalDate  = LocalDateTime.now();
        System.out.println("end:"+arrivalDate.format(format));
        return "hello world!"+i;
    }
}
