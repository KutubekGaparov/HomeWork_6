package org.example.model;

public class Cities {
    private int id;
    private String name;
    private String population;
    private String cityArea;
    private String mayors;

    public Cities(int id, String name, String population, String cityArea, String mayors) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.cityArea = cityArea;
        this.mayors = mayors;
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

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCityArea() {
        return cityArea;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public String getMayors() {
        return mayors;
    }

    public void setMayors(String mayors) {
        this.mayors = mayors;
    }

    @Override
    public String toString() {
        return
                "\n  " + id +
                "  " + name +
                "  " + population +
                "  " + cityArea +
                "  " + mayors ;
    }
}
