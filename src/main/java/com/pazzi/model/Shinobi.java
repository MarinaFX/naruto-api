package com.pazzi.model;

import java.util.List;

public class Shinobi {
    private String name;
    private String lastName;
    private int age;
    private String clan;
    private boolean isJinchuuriki;

    private List<Jutsu> jutsus;
    private Village village;
    private ShinobiRank rank;

    public Shinobi firstName(String name) {
        this.name = name;
        return this;
    }

    public Shinobi lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Shinobi age(int age) {
        this.age = age;
        return this;
    }

    public Shinobi clan(String clan) {
        this.clan = clan;
        return this;
    }

    public Shinobi isJinchuuriki(boolean isJinchuuriki) {
        this.isJinchuuriki = isJinchuuriki;
        return this;
    }

    public Shinobi jutsus(List<Jutsu> jutsus) {
        this.jutsus = jutsus;
        return this;
    }

    public Shinobi village(Village village) {
        this.village = village;
        return this;
    }

    public Shinobi rank(ShinobiRank rank) {
        this.rank = rank;
        return this;
    }



    public boolean addJutsu(Jutsu jutsu) {
        if (jutsu != null) {
            this.jutsus.add(jutsu);
            return true;
        }
        return false;
    }

    public boolean removeJutsu(Jutsu jutsu) {
        if (this.jutsus.contains(jutsu)) {
            return this.jutsus.remove(jutsu);
        }
        return false;
    }
}
