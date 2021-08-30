package io.learnandgrow.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/config")
public class GreetingController {

    @Value("${my.greeting}")
    private String greet;

    @Value("${app.description}")
    private  String desc;

    @Value("Direct Value")
    private String directValue;

    @Value("${app.notPresent : default message}")
    private String defaultMessage;

    @Value("${app.my.lst}")
    private List<String> list;

    @Value("#{${dbvalues}}")
    private Map<String, String> dbVales;

    @GetMapping("/greet")
    public String getGreeting(){
        return greet+" Chandan!, "+ desc+directValue+defaultMessage+list+dbVales;
    }
}
