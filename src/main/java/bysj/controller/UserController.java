package bysj.controller;

import bysj.domain.po.UserPO;
import bysj.domain.vo.Result;
import bysj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam  String username,@RequestParam String password, HttpServletRequest request) {
        UserPO userPO = null;
//        UserPO userPO = userService.findUserByUsernameAndPassword(new UserPO(username,password));
        if (userPO != null) {
            HttpSession session = request.getSession();
            session.setAttribute("username", userPO.getUsername());
            //session.setAttribute("id", userPO.getUid());

            return "index";
        }
        return "index";
    }

    @RequestMapping(value = "logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "index";
    }

    /**
     * 注册
     *
     * @return
     */
    @RequestMapping("/add")
    public String add(@RequestParam  String username,@RequestParam String password) {
        try {
            //userService.add(new UserPO(username,password));
            return "login";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
