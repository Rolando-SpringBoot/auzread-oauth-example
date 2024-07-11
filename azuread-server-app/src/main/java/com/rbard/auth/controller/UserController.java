package com.rbard.auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping(path = "/user")
  @PreAuthorize("hasRole('readuser')")
  public String getUser() {
    return "Access Granted : Read User Details";
  }

  @PostMapping(path = "/user")
  @PreAuthorize("hasRole('createuser')")
  public String createUser() {
    return "Access Granted : Create User details";
  }

}
