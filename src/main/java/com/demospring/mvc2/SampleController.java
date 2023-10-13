package com.demospring.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello(){
        throw new SampleException();
    }

    //주석을 해제하면 5xx.html이 나타난다.
//    @ExceptionHandler(SampleException.class)
//    public @ResponseBody AppError sampleError(SampleException e){
//        AppError appError = new AppError();
//        appError.setMessage("error.app.key");
//        appError.setReason("IDK IDK IDK");
//        return appError;
//    }
}
