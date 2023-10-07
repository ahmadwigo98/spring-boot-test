package com.example.demo.controller;

import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/api")
public class RestController {

    @Autowired
    JobService jobService;

    @GetMapping(value = "/getAllPosition")
    @ResponseBody
    public List<Object> getAllPostion() { return jobService.getAllPosition(); }

    @GetMapping(value = "/getPosition/{id}")
    @ResponseBody
    public Object getPostionById(@PathVariable String id) {
        return jobService.getPositionById(id);
    }
}
