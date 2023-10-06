package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final String BASE_API_URL = "https://dev6.dansmultipro.com/api/recruitment/positions";
    @Override
    public List<Object> getAllPosition() {
        String uri = BASE_API_URL + ".json";
        RestTemplate template = new RestTemplate();
        List<Object> positions = template.getForObject(uri, List.class);

        return positions;
    }

    @Override
    public Object getPositionById(String id) {
        String uri = BASE_API_URL + "/" + id;
        RestTemplate template = new RestTemplate();
        Object position = template.getForObject(uri, Object.class);

        return position;
    }
}
