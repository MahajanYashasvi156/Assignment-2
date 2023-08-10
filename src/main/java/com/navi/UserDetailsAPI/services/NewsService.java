package com.navi.UserDetailsAPI.services;
import com.navi.UserDetailsAPI.entity.Category;
import com.navi.UserDetailsAPI.entity.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.navi.UserDetailsAPI.entity.Country;
import java.util.List;
import java.util.Map;

@Service
public class NewsService {

    // Autowire the apiKey from application.properties
    @Value("${news.api.key}")
    private String apiKey; // Set this in your application properties
    // Get top headlines for a category and country

    Country countryObj = new Country();
    Category categoryObj = new Category();
    public NewsResponse getTopHeadlines(String category, String country,int maxResults)
    {
        if(!countryObj.getCountry().contains(country))
            throw new IllegalArgumentException("Invalid country");

        if(!categoryObj.getCategory().contains(category))
        {
            throw new IllegalArgumentException("Invalid category");
        }

        String url = "https://newsapi.org/v2/top-headlines?category=" + category + "&country=" + country + "&apiKey=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        NewsResponse response =  restTemplate.getForObject(url, NewsResponse.class);


        if(response.getArticles().size() > maxResults)
        {
            response.setArticles(response.getArticles().subList(0,maxResults));
        }

        return response;
    }



}
