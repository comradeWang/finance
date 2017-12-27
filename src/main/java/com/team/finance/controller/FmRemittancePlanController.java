package com.team.finance.controller;

import com.team.finance.entity.FmRemittancePlan;
import com.team.finance.service.FmRemittancePlanService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by CodeGenerator on 2017/12/27.
*/
@RestController
@RequestMapping("/fm/remittance/plan")
public class FmRemittancePlanController {
    @Resource
    private FmRemittancePlanService fmRemittancePlanService;

    @PostMapping("/add")
    public void add(FmRemittancePlan fmRemittancePlan) {

    }

    @PostMapping("/delete")
    public void delete(@RequestParam Integer id) {

    }

    @PostMapping("/update")
    public void update(FmRemittancePlan fmRemittancePlan) {

    }

    @PostMapping("/detail")
    public void detail(@RequestParam Integer id) {

    }

    @PostMapping("/list")
    public void list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {

    }
}
