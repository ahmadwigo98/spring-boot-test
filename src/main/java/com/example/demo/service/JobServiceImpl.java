package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Value("${base.api.url}")
    private String baseApiUrl;
    @Override
    public List<Object> getAllPosition() {
        String uri = baseApiUrl + ".json";
        RestTemplate template = new RestTemplate();

        return template.getForObject(uri, List.class);
    }

    @Override
    public Object getPositionById(String id) {
        String uri = baseApiUrl + "/" + id;
        RestTemplate template = new RestTemplate();

        return template.getForObject(uri, Object.class);
    }
}
