package com.edu.jewelry.controller.web;

import com.edu.jewelry.model.Group;
import com.edu.jewelry.service.group.impls.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/web/group")
@Controller
public class GroupWebController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Group> getGroups() {
        return groupService.getAll();
    }

}
