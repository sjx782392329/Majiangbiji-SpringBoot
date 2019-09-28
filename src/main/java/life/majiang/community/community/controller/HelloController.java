package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Shenjinxin
 * @Date 2019/9/28 09:19
 * @Version 1.0
 **/
@Controller
public class HelloController {
    @GetMapping
    public String hello(@RequestParam(name = "name") String hello, Model model){
        model.addAttribute("name", hello);
        return "hello";
    }
}
