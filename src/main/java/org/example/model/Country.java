package org.example.model;

public class Country {
    private int id;
    private String name;
    private String language;
    private String countryArea;
    private String population;
    private String presidents;

    public Country(int id, String name, String language, String countryArea, String population, String presidents) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.countryArea = countryArea;
        this.population = population;
        this.presidents = presidents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(String countryArea) {
        this.countryArea = countryArea;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPresidents() {
        return presidents;
    }

    public void setPresidents(String presidents) {
        this.presidents = presidents;
    }

    @Override
    public String toString() {
        return
                "\n  " + id +
                "   " + name +
                "   " + language +
                "   " + countryArea +
                "   " + population +
                "   " + presidents ;
    }
}
