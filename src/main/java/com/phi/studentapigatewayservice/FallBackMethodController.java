package com.phi.studentapigatewayservice;


import org.springframework.web.bind.annotation.*;

@RestController
public class FallBackMethodController {


    @GetMapping("/read-service-fallback")
    public String userServiceFallBack(){
        return "Student read service is not available" +
                "please try again later";
    }

    @PostMapping("/write-service-fallback")
    public String userServiceFallBackPost(){
        return "You can't make post call. Student write-service is not available" +
                "please try again later";
    }

    @PutMapping("/write-service-fallback")
    public String userServiceFallBackPut(){
        return "You can't make update call. Student write service is not available" +
                "please try again later";
    }

    @DeleteMapping("/write-service-fallback")
    public String userServiceFallBackDelete(){
        return "You can't make delete call. Student write service is not available" +
                "please try again later";
    }
}
