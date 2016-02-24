package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Qiang on 2/23/16.
 */
@Controller
public class TestController {
    @RequestMapping("test")
    public String test()
    {
        return "view";
    }
}
