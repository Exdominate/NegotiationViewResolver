/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itschool.springmvc.resolvers;

import com.itschool.springmvc.ExcelView;
import java.util.Locale;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

/**
 *
 * @author emergency
 */
public class ExcelViewResolver implements ViewResolver{

    public View resolveViewName(String string, Locale locale) throws Exception {
        ExcelView view=new ExcelView();
        return view;
    }
    
}
