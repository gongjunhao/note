package com.gjh6.java.review.springboot;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-20
 * Time: 2:56 PM
 */
@Service
public class MyService {

    public void a() {
        System.out.println("a");
        b();
    }

    @Transactional()
    public void b() {
        System.out.println("b");
    }
}
