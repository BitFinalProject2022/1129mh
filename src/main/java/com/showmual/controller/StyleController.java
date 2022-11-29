package com.showmual.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.showmual.model.ColorVo;
import com.showmual.model.MenAdviseVo;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping(value = "/menstyle")
@Slf4j
public class StyleController {
    

    @Autowired
    MenAdviseVo menAdviseVo;
    
/*  @RequestMapping(value = "/menstyle", method = RequestMethod.POST)
    // colorValue는 html에서 checkbox에 있는 name 이
    public String menstylelist(@RequestParam List<String> colorValue) {
        for (String c : colorValue) {
            styleService.
        }
        
    }*/
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("form", new ColorVo());
        return "/menstyle";
    }
    
//    @PostMapping("/form")
//    public String form(@ModelAttribute("form") ColorVo colorVo) {
//
//        return "/menstyle";
//    }
    
    @ModelAttribute("hobbies")
    private Map<String, String> favorite() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("movie", "영화보기");
        map.put("music", "음악듣기");
        map.put("running", "런닝하기");
        map.put("game", "게임하기");
        
    return map; 
    }
    
    @ModelAttribute("color")
    private Map<String, String> color() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("red", "빨강");
        map.put("blue", "파랑");
        map.put("green", "초록");
        map.put("yello", "노랑");
        
    return map; 
    }
    
    @PostMapping("/form")
    public String form2(@ModelAttribute("form") ColorVo colorVo) {
        log.info("formDto.name = {}", colorVo.getName());
        List<String> hobbies = colorVo.getHobbies();
        for (String hobby : hobbies) {
            log.info("formDto.hobby = {}", hobby);
        }
        List<String> color = colorVo.getColor();
        for (String colors : color) {
            log.info("formDto.color = {}", colors);
        }

        return "/menstyle";
    }
}
