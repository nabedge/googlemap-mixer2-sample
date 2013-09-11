package org.mixer2.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private static Log log = LogFactory.getLog(IndexController.class);
    
    @RequestMapping(value = "/")
    public String map(Model model) {
        log.debug("showing map()...");

        Map<String,Double> latLngMap = new HashMap<String,Double>();
        latLngMap.put("lat", 35.633302);
        latLngMap.put("lng", 139.799652);
        
        model.addAttribute("latLngMap", latLngMap);
        
        return "mapView";
    }

}
