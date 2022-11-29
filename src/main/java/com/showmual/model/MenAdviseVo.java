package com.showmual.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class MenAdviseVo {
    
    private int menId;
    private int styleCode;
    private int hashtagCode;
    private int colorCode;
    private int temperature;
    private String imagePath;
    
    private StyleVo styleVo;
    private ColorVo colorVo;
    private HashtagVo hashtagVo;

    
}
