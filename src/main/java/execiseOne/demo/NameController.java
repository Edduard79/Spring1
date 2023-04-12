package execiseOne.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String getName(){
        return "Eduard";
    }

    @PostMapping("/name")
    public String reverseName(@RequestBody String name){
        StringBuilder rvs = new StringBuilder(name);
        return rvs.reverse().toString();

    }

}
