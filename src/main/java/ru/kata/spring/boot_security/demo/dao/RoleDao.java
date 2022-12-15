package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleDao {
    Role findByIdRole(Integer id);

    List<Role> listRoles();

    boolean add(Role role);

    Role findByName(String name);

    List<Role> listByName(List<String> name);
}