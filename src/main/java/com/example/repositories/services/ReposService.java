package com.example.repositories.services;

import com.example.repositories.domain.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ReposService  {

    RestTemplate restTemplate = new RestTemplate();
    private final AtomicLong counter = new AtomicLong();
    List<Repository> list = new ArrayList<>();

    public List<Repository> getList(String login){

        String url = "https://api.github.com/users/" + login + "/repos";
        List<LinkedHashMap<String, String>> repos =
                    restTemplate.getForObject(url, List.class);

        for (LinkedHashMap<String, String> repo : repos) {
            list.add(new Repository(counter.incrementAndGet(), repo.get("name")));
        }

        return list;
    }


}
