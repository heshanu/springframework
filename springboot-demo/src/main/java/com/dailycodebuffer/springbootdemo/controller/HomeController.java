package com.dailycodebuffer.springbootdemo.controller;

import com.dailycodebuffer.springbootdemo.model.HomeModel;
import com.dailycodebuffer.springbootdemo.service.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/api/v1/home")
public class HomeController {

    @Autowired
    private HomeServiceImpl homeService;

    @GetMapping("/")
    public String home(){
      return  homeService.test();
    }
    
    @GetMapping("/page")
    public String page(){
        return "page";
    }

    @GetMapping("/ok")
    public String ok(){
        return "200";
    }

    @GetMapping("/user")
    public HomeModel homeModel(){
        HomeModel h=new HomeModel();
        h.setName("heshan");
        h.setAddress("hikkaduwa");
        return  h;
    }

    //path variables
    @GetMapping("/{id}/{id2}")
    public String pathVaraible(@PathVariable int id,@PathVariable int id2){
        return id+" "+id2;
    }

    //requestparams
    @GetMapping("/requestParams")
    public String requestParams(@RequestParam String name){
        return name;
    }

}
