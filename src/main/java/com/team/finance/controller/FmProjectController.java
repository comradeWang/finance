package com.team.finance.controller;

import com.team.finance.entity.AjaxResponse;
import com.team.finance.entity.FmProject;
import com.team.finance.service.FmProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by CodeGenerator on 2017/12/27.
 */
@RestController
@RequestMapping("/fm/project")
public class FmProjectController {
    @Resource
    private FmProjectService fmProjectService;

    @PostMapping("/add")
    public void add(FmProject fmProject) {

    }

    @PostMapping("/delete")
    public void delete(@RequestParam Integer id) {

    }

    @PostMapping("/update")
    public void update(FmProject fmProject) {

    }

    @PostMapping("/detail")
    public void detail(@RequestParam Integer id) {

    }

    @PostMapping("/list")
    public void list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {

    }

    @GetMapping("/getAllfmProject")
    public AjaxResponse getAllfmProject() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        List<Map<String,Object>> list = fmProjectService.selectAll();
        ajaxResponse.setData(list);
        return ajaxResponse;
    }

    @PutMapping("/updateProject")
    public AjaxResponse updateProject(Long id,String type,String showValue) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        FmProject fmProject  =  new FmProject();
        int a = fmProjectService.updateProject(fmProject.getId(), fmProject.getType(), fmProject.getShow_value());
        if (a == 1) {
            ajaxResponse.setSuccessCode(1);
            ajaxResponse.setMsg("更新成功");
        } else {
            ajaxResponse.setErrorCode(0);
            ajaxResponse.setMsg("更新失败");
        }
        return ajaxResponse;
    }

    @PutMapping("/updateProjectState")
    public AjaxResponse updateProjectState(FmProject fmProject) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        int a = fmProjectService.updateProjectState(fmProject.getId(), fmProject.getState());
        if (a == 1) {
            ajaxResponse.setMsg("屏蔽成功！");
            ajaxResponse.setSuccessCode(1);
        } else {
            ajaxResponse.setMsg("屏蔽失败！");
            ajaxResponse.setErrorCode(0);
        }
        return ajaxResponse;
    }

}
