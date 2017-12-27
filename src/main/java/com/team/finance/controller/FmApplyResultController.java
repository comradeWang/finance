package com.team.finance.controller;


import com.team.finance.entity.FmApplyvoid;
import com.team.finance.service.FmApplyvoidService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
* Created by CodeGenerator on 2017/12/27.
*/
@RestController
@RequestMapping("/fm/apply/void")
    public class FmApplyvoidController {
    @Resource
    private FmApplyvoidService fmApplyvoidService;

    @PostMapping("/add")
    public void add(FmApplyvoid fmApplyvoid) {

    }

    @PostMapping("/delete")
    public void delete(@RequestParam Integer id) {

    }

    @PostMapping("/update")
    public void update(FmApplyvoid fmApplyvoid) {

    }

    @PostMapping("/detail")
    public void detail(@RequestParam Integer id) {

    }

    @PostMapping("/list")
    public void list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {

    }
}
