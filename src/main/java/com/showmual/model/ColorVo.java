package com.showmual.model;

import java.util.List;

import lombok.Data;

@Data
public class ColorVo {
    
    private String name;
    private List<String> hobbies; // multi-checkbox
    private List<String> color;
}
