package com.inkarkapen.dateDisplay.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers{
    @RequestMapping("/")
    public String index() {
        return "date.jsp";
    }
    @RequestMapping("/day")
    public String day(Model model) {
    	Date date = new Date();
    	String day = new SimpleDateFormat("EEE, MMM d, yyyy").format(date);
    	model.addAttribute("date", day);
        return "day.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model) {
    		Date date = new Date();
    		String time = new SimpleDateFormat("h:mm a").format(date);
    		model.addAttribute("date", time);
        return "time.jsp";
    }
}
