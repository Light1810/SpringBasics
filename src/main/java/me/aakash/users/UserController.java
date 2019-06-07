package me.aakash.users;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepo usrob;
	
	@GetMapping("/user")
	public List<User_info> index(){
        return usrob.findAll();
    }
	
    @GetMapping("user/{id}")
    public User_info showbymobid(@PathVariable long id){
        long mobId = id;
        return usrob.findById(mobId).get();
    }
    
    @PostMapping("/user/new")
    public void create(@RequestBody Map<String,String> body)
    {
    	long mob=Long.parseLong(body.get("mob_number"));
    	String usrname=body.get("usrname");
    	String email=body.get("email");
    	usrob.save(new User_info(mob,usrname,email));
    }
    
    @PutMapping("/user/mob/{id}")
    public void update(@PathVariable String id, @RequestBody Map<String, String> body){
        long mobId = Long.parseLong(id);
        User_info user =  usrob.findById(mobId).get();
        user.setMob_number(Long.parseLong(body.get("mob_number")));
        user.setUsrname(body.get("usrname"));
        user.setEmail(body.get("email"));
        
    }
    
    @DeleteMapping("user/mob/{id}")
    public boolean delete(@PathVariable String id){
        long mobId = Long.parseLong(id);
        usrob.deleteById(mobId);
        return true;
    }
    
	@GetMapping("/user/count")
	 public String count() {
		String out="Total Registered Users = " +usrob.count();
         return out;     }

}
