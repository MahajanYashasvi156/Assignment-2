package com.navi.UserDetailsAPI.entity;

import java.util.HashSet;

public class Category
{
    HashSet<String> categoryList = new HashSet<String>();

    public Category()
    {
        categoryList.add("business");
        categoryList.add("entertainment");
        categoryList.add("general");
        categoryList.add("health");
        categoryList.add("science");
        categoryList.add("sports");
        categoryList.add("technology");
    }
    public HashSet<String> getCategory()
    {
        return categoryList;
    }
}
