package su.ibn.springMVCTraining.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false)String name,
                            @RequestParam(value = "surname", required = false) String surname) {
        System.out.println(name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/bye")
    public String goodBye() {
        return "first/bye";
    }

}
