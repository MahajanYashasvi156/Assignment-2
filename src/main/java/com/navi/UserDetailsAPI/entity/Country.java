package com.navi.UserDetailsAPI.entity;

import java.util.HashSet;

public class Country
{
    HashSet<String> countryList = new HashSet<String>();

    public Country()
    {
        countryList.add("ae");
        countryList.add("ar");
        countryList.add("at");
        countryList.add("au");
        countryList.add("be");
        countryList.add("bg");
        countryList.add("br");
        countryList.add("ca");
        countryList.add("ch");
        countryList.add("cn");
        countryList.add("co");
        countryList.add("cu");
        countryList.add("cz");
        countryList.add("de");
        countryList.add("eg");
        countryList.add("fr");
        countryList.add("gb");
        countryList.add("gr");
        countryList.add("hk");
        countryList.add("hu");
        countryList.add("id");
        countryList.add("ie");
        countryList.add("il");
        countryList.add("in");
        countryList.add("it");
        countryList.add("jp");
        countryList.add("kr");
        countryList.add("lt");
        countryList.add("lv");
        countryList.add("ma");
        countryList.add("mx");
        countryList.add("my");
        countryList.add("ng");
        countryList.add("nl");
        countryList.add("no");
        countryList.add("nz");
        countryList.add("ph");
        countryList.add("pl");
        countryList.add("pt");
        countryList.add("ro");
        countryList.add("rs");
        countryList.add("ru");
        countryList.add("sa");
        countryList.add("se");
        countryList.add("sg");
        countryList.add("si");
        countryList.add("sk");
        countryList.add("th");
        countryList.add("tr");
        countryList.add("tw");
        countryList.add("ua");
        countryList.add("us");
        countryList.add("ve");
        countryList.add("za");
    }
    public HashSet<String> getCountry()
    {
        return countryList;
    }
}
