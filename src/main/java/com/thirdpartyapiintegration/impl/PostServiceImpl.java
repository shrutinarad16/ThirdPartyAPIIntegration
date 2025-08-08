package com.thirdpartyapiintegration.impl;

import com.thirdpartyapiintegration.postservice.PostService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class PostServiceImpl implements PostService {

    String baseUrl = "https://jsonplaceholder.typicode.com";

    //StringBuilder stringBuilder = new StringBuilder(baseUrl);

    String POST = "/posts";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Map<String, Object>> getPosts(){
        HttpEntity <Void> httpEntity = new HttpEntity <> (gethttpHeaders());
        //String url = stringBuilder.append(POST).toString();
        String url = baseUrl + POST;
        ResponseEntity<List> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                List.class
        );

        return response.getBody();
    }

    @Override
    public Map<String, Object> getPostById(int id) {
        String url = baseUrl + POST + "/" + id;

        HttpEntity<Void> httpEntity = new HttpEntity<>(gethttpHeaders());

        ResponseEntity<Map> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                Map.class
        );

        return response.getBody();
    }

    private HttpHeaders gethttpHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

}
