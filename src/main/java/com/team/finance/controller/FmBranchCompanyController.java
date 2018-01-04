package com.team.finance.controller;

import com.team.finance.entity.AjaxResponse;
import com.team.finance.entity.FmBranchCompany;
import com.team.finance.service.FmBranchCompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
* Created by CodeGenerator on 2017/12/27.
*/
@RestController
@RequestMapping("/fm/branch/company")
public class FmBranchCompanyController {
    @Resource
    private FmBranchCompanyService fmBranchCompanyService;

    @PostMapping("/add")
    public void add(FmBranchCompany fmBranchCompany) {

    }

    @PostMapping("/delete")
    public void delete(@RequestParam Integer id) {

    }

    @PostMapping("/update")
    public void update(FmBranchCompany fmBranchCompany) {

    }

    @PostMapping("/detail")
    public void detail(@RequestParam Integer id) {

    }

    @PostMapping("/list")
    public void list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {

    }
    @GetMapping("/getBranchCompany")
    public AjaxResponse getBranchCompany() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        List list = new ArrayList();
        list = fmBranchCompanyService.selectAll();
        ajaxResponse.setData(list);
        return ajaxResponse;
    }
    @PostMapping("/updateBranchCompany")
    public AjaxResponse updateBranchCompany(FmBranchCompany fmBranchCompany){
        AjaxResponse ajaxResponse=new AjaxResponse();
        int i=fmBranchCompanyService.updateBranchCompany(fmBranchCompany.getName(),fmBranchCompany.getCorporation_name(),fmBranchCompany.getAddress(),fmBranchCompany.getPhone(),fmBranchCompany.getArea(),fmBranchCompany.getSphere_of_business(),fmBranchCompany.getRemark(),fmBranchCompany.getId());
        if(i==0){
            ajaxResponse.setMsg("更新成功！");
        }else {
            ajaxResponse.setMsg("更新失败！");
        }
        return ajaxResponse;
    }
    @PostMapping("/deleteBranchCompany")
    public AjaxResponse deleteBranchCompany(FmBranchCompany fmBranchCompany){
        AjaxResponse ajaxResponse=new AjaxResponse();
        int i=fmBranchCompanyService.deleteBranchCompanyByID(fmBranchCompany.getId());
        if(i==0){
            ajaxResponse.setMsg("删除成功！");
        }else {
            ajaxResponse.setMsg("删除失败！");
        }
        return ajaxResponse;
    }
}
