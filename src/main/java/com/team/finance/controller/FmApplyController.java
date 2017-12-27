package com.team.finance.controller;

import com.team.finance.entity.FmApply;
import com.team.finance.service.FmApplyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by CodeGenerator on 2017/12/27.
*/
@RestController
@RequestMapping("/fm/apply")
public class FmApplyController {
    @Resource
    private FmApplyService fmApplyService;

    @PostMapping("/add")
    public void add(FmApply fmApply) {
         
    }

    @PostMapping("/delete")
    public void delete(@RequestParam Integer id) {

    }

    @PostMapping("/update")
    public void update(FmApply fmApply) {

    }

    @PostMapping("/detail")
    public void detail(@RequestParam Integer id) {

    }

    @PostMapping("/list")
    public void list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {

    }
}
