/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itschool.springmvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emergency
 */
public class Pizza {

    private String name;
    private String flavor;
    private List<String> toppings = new ArrayList<String>();

    public Pizza() {
    }       

    public Pizza(String name) {
        this.name = name;
        this.flavor="tasty";
        this.toppings.add("тесто");
        this.toppings.add("cheese");
        this.toppings.add("колбаса");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

}
