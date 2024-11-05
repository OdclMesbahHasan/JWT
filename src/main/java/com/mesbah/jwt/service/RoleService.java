package com.mesbah.jwt.service;

import com.mesbah.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class RoleService {

    @Autowired
    private RoleService roleService;

    @PostMapping({"/createNewRole"})
    public Role createNewRole(Role role) {
        return roleService.createNewRole(role);
    }
}
