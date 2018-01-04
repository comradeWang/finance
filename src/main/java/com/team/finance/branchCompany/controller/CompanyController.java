package com.team.finance.branchCompany.controller;

import com.team.finance.branchCompany.service.CompanyService;
import com.team.finance.entity.AjaxResponse;
import com.team.finance.util.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZhaoHongliang
 * @Description:
 * @Date: Created in 15:05 2018/1/4
 */
@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/getBranchCompany")
    public AjaxResponse register() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        List list = new ArrayList();
        list = companyService.selectAll();
        ajaxResponse.setData(list);
        return ajaxResponse;
    }
}
