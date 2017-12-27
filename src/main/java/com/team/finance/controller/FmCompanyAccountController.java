package com.team.finance.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.isoft91.project.common.core.void;
import com.isoft91.project.common.core.voidGenerator;
import com.isoft91.project.model.FmCompanyAccount;
import com.isoft91.project.service.FmCompanyAccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/12/27.
*/
@RestController
@RequestMapping("/fm/company/account")
public class FmCompanyAccountController {
    @Resource
    private FmCompanyAccountService fmCompanyAccountService;

    @PostMapping("/add")
    public void add(FmCompanyAccount fmCompanyAccount) {
        fmCompanyAccountService.save(fmCompanyAccount);
        return voidGenerator.genSuccessvoid();
    }

    @PostMapping("/delete")
    public void delete(@RequestParam Integer id) {
        fmCompanyAccountService.deleteById(id);
        return voidGenerator.genSuccessvoid();
    }

    @PostMapping("/update")
    public void update(FmCompanyAccount fmCompanyAccount) {
        fmCompanyAccountService.update(fmCompanyAccount);
        return voidGenerator.genSuccessvoid();
    }

    @PostMapping("/detail")
    public void detail(@RequestParam Integer id) {
        FmCompanyAccount fmCompanyAccount = fmCompanyAccountService.findById(id);
        return voidGenerator.genSuccessvoid(fmCompanyAccount);
    }

    @PostMapping("/list")
    public void list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<FmCompanyAccount> list = fmCompanyAccountService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return voidGenerator.genSuccessvoid(pageInfo);
    }
}
