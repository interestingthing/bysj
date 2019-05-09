package bysj.controller;

import bysj.domain.po.RestaurantPO;
import bysj.domain.vo.Result;
import bysj.service.RestaurantService;
import bysj.utils.AjaxStringUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @Resource
    RestaurantService restaurantService;

    @RequestMapping(value = "/findByName")
    @ResponseBody
    public Result findByName(@RequestParam("restaurantName") String restaurantName, HttpServletRequest request) throws Exception {

        restaurantName = AjaxStringUtils.ISO2UTF(restaurantName);

        List<RestaurantPO> restaurantPOS = restaurantService.findUserByRestaurantName(restaurantName);
        Result result = new Result(true, restaurantPOS);

        return result;
    }

    @RequestMapping("/detail")
    public String details(Integer id, Model model) {

        RestaurantPO restaurant = restaurantService.findOne(id.longValue());
        System.out.println(restaurant);
        Object o = JSON.toJSON(restaurant);

        System.out.println(o);
        model.addAttribute("detail", o);


        return "details";
    }
}
