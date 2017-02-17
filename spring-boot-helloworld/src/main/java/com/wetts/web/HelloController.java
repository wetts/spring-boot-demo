package com.wetts.web;

/**
 * Created by wetts on 2017/2/17.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
