package com.yao.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.logging.Logger;


/**
 * Created by yaoping on 2018/6/6.
 */
@RestController
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class.getName());

    @RequestMapping(value = "hello", method = {RequestMethod.GET})
    public String hello() throws InterruptedException {

        int sleepTime = new Random().nextInt(3000);
        logger.info("sleepTime: " + sleepTime);

        Thread.sleep(sleepTime);

        return "Hello World!";
    }

}
