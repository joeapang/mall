package mall.site.web.site.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class IndexController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        //1.分类
        //2.首页商品
        //3.子分类或者商品
        return "index";

    }

}
