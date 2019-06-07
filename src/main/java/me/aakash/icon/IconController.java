package me.aakash.icon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class IconController {

    @Autowired
    IconRespository iconRespository;

    @GetMapping("/icon")
    public List<Demo_voi_icon> index(){
        return iconRespository.findAll();
    }

    @GetMapping("/icon/age/{id}")
    public List<Demo_voi_icon> showbyage(@PathVariable int id){
        int iconId = id;
        return iconRespository.findByAge(iconId);
    }
    
    @GetMapping("/icon/id/{id}")
    public Optional<Demo_voi_icon> showbyid(@PathVariable int id){
        int iconId = id;
        return iconRespository.findById(iconId);
    }
    
    @PostMapping("/icon/new")
    public void create(@RequestBody Map<String,String> body)
    {
    	int id=Integer.parseInt(body.get("id"));
    	int age=Integer.parseInt(body.get("age"));
    	String icon_name=body.get("icon_name");
    	String url=body.get("url");
    	
    	Demo_voi_icon demoobj=	new Demo_voi_icon(id, age, icon_name, url);
    	iconRespository.save(demoobj);
    	
    }
    
    @PutMapping("/icon/id/{id}")
    public void update(@PathVariable String id, @RequestBody Map<String, String> body){
        int iconId = Integer.parseInt(id);
        
        Demo_voi_icon icon = iconRespository.findById(iconId).get();
        icon.setId(Integer.parseInt(body.get("id")));
        icon.setAge(Integer.parseInt(body.get("age")));
        icon.setIcon_name(body.get("icon_name"));
        icon.setUrl(body.get("url"));
        iconRespository.save(icon);
    }
    
    @DeleteMapping("icon/id/{id}")
    public boolean delete(@PathVariable String id){
        int iconId = Integer.parseInt(id);
        iconRespository.deleteById(iconId);
        return true;
    }

}