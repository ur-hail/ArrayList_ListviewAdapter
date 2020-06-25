package com.example.test_yt_vid;

public class template_listview {
    private String CocktailName;
    private String CocktailSubName;
    private int CocktailIconId;

    public template_listview(String cocktailName, String cocktailSubName, int cocktailIconId) {
        this.CocktailName = cocktailName;
        this.CocktailSubName = cocktailSubName;
        this.CocktailIconId = cocktailIconId;
    }

    public String getCocktailName() {
        return CocktailName;
    }

    public String getCocktailSubName() {
        return CocktailSubName;
    }

    public int getCocktailIconId() {
        return CocktailIconId;
    }
}
