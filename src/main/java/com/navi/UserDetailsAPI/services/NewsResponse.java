package com.navi.UserDetailsAPI.services;

import java.util.List;

public class NewsResponse
{
    private List<Article> articles;

    public List<Article> getArticles()
    {
        return articles;
    }
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public static class Article
    {
        private String title;
        private String description;

        // Getters and setters
        public String getTitle ()
        {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getDescription ()
        {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
    }
}



