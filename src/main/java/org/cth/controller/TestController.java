package org.cth.controller;

import org.cth.model.CrmUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController extends BaseController {
    @GetMapping("testGet")
    public String testGet() {
        return "hello...";
    }

    @GetMapping("testGet1")
    public String testGet1() {
        CrmUser user = new CrmUser();
        user.setId(2L);
        user.setAcctName("ccc");
        user.setAge(13);
        userService.insert(user);
        return "hello...";
    }

    @GetMapping("testGet2")
    public String testGet2() {
        List<CrmUser> res = userService.findAll();
        return String.valueOf(res.size());
    }
}
