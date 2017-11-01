/**
 * @author Balaji
 * <p>
 * 26-Sep-2017 - Balaji creation UserRestController.java
 */
package com.example.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

/**
 * @author Balaji
 *
 */
@RestController
public class UserRestController {

  @RequestMapping("/")
  public RedirectView index() {
    RedirectView redirectView = new RedirectView();
    redirectView.setUrl("http://localhost:4200/");
    return redirectView;
  }

  @RequestMapping("/user")
  public Principal user(Principal principal) {
    return principal;
  }
}
