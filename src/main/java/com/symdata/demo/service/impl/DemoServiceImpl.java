package com.symdata.demo.service.impl;

import com.symdata.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by GaoPopo on 15/12/10.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String index(String name) {
        return "Hello, " + name + "! this message send by service.";
    }
}
