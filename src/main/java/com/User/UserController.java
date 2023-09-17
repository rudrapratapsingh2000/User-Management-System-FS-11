package com.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Predicate;

@RestController
public class UserController {
    @Autowired
    List<User> userList;
    @PostMapping("adduser")
    public String addUser(@RequestBody User user) {
        userList.add(user);
        return "User Added Successfully";
    }

    @GetMapping("getalluser")
    public List<User> getAllUser() {
        return userList;
    }

    @PostMapping("getuser/{userid}")
    public User getUser(@PathVariable Integer userid) {
        /*
        Predicate<? super User> predicate1 = user -> user.getUserId() == userid;
        User user = userList.stream().filter(predicate1).findFirst().get();
        return user;
        */

        User user1= (User) userList.stream().filter(user -> user.getUserId().equals(userid)).findFirst().get();
        return user1;
    }

    @PutMapping("updateuserinfo/{userid}")
    public String updateUserInfo(@PathVariable Integer userid, @RequestBody User newUser) {
        User user = getUser(userid);
        user.setUserName(newUser.getUserName());
        user.setName(newUser.getName());
        user.setAddress(newUser.getAddress());
        user.setPhonenumber(newUser.getPhonenumber());
        return "User Updated Successfully";
    }

    @DeleteMapping("deleteuser/{userid}")
    public String deleteUser(@PathVariable Integer userid) {
        User user = getUser(userid);
        userList.remove(user);
        return "User Deleted Successfully";
    }

}
