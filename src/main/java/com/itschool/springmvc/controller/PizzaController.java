/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itschool.springmvc.controller;

import com.itschool.springmvc.model.Pizza;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author emergency
 usage: http://localhost:8080/Spring4MVCHelloWorldDemo/pizzavalley/pizza
 * */
@Controller
public class PizzaController {
    @RequestMapping(value = "/pizzavalley/{pizzaName}",method =RequestMethod.GET)
    public String getPizza(@PathVariable String pizzaName, ModelMap model){
        Pizza pizza=new Pizza(pizzaName);
        model.addAttribute(pizza);
        
        return "pizza";
        
    }    
}
