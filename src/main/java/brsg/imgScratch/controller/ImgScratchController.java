package brsg.imgScratch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("imgScratch")
public class ImgScratchController {

    @RequestMapping("main")
    public String main(){
        System.out.println("imgScratch/main");
        return "imgScratch/imgScratch";
    }
}
