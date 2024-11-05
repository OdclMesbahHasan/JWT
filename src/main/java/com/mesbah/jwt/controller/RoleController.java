package com.mesbah.jwt.controller;

import com.mesbah.jwt.dao.RoleDao;
import com.mesbah.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleDao roleDao;

    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleDao.save(role);
    }

    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return (List<Role>) roleDao.findAll();
    }

}
