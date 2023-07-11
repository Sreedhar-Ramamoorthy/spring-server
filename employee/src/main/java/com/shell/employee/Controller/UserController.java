package com.shell.employee.Controller;

import com.shell.employee.Entity.User;
import com.shell.employee.Service.UserService;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/user")
@AllArgsConstructor
//@Tag(name = "CRUD Operations")
public class UserController {

    @Autowired
    private UserService userService;

    //     @PostMapping()
//     public ResponseEntity<User> createUser(@RequestBody User user) {
//     User saveUser=userService.createUser(user);
//     return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
//     }

    @PostMapping("/addUser")
    @Operation(summary = "Add New Data")

    //@ApiOperation(value = "Add User Data")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @GetMapping("/getList")
    @Operation(summary = "Get All Data")
    // @ApiOperation(value = "Get User Data")
    public List<User> getList() {
        return userService.getList();
    }


    @DeleteMapping("/deleteById/{id}")
    @Operation(summary = "Delete The Data Using ID")
    public String deleteById(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "Successfully Deleted";
    }


    @GetMapping("/getById/{id}")
    @Operation(summary = "Get The Data Using ID")
    public Optional<User> getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }


    @PutMapping("/updateById/{id}")
    @Operation(summary = "Update The Data Using ID")
    public Optional<User> updateById(@RequestBody User user, @PathVariable("id") Long id) {
        return userService.updateUserById(user, id);
    }
}
