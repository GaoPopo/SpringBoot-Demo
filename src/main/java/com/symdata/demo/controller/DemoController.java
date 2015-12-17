package com.symdata.demo.controller;

import com.symdata.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GaoPopo on 15/12/10.
 */
@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/index.do")
    public String index(@RequestParam String name) {
        return demoService.index(name);
    }
}
