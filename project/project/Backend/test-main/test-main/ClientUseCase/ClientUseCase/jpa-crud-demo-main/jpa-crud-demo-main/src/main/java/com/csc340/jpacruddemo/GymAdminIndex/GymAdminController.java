/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.GymAdminIndex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * GymAdmin Controller
 * Handles web requests related to gym administrators
 */
@Controller
public class GymAdminController {

    @GetMapping("/gymAdmin")
    public String showGymAdminPage() {

        return "adminPages/gymAdmin";
    }

    @GetMapping("/manageGym")
    public String manageGym() {

        return "adminPages/manageGym";
    }

    @GetMapping("/manageTrainers")
    public String manageTrainers() {

        return "adminPages/manageTrainers";
    }


    @GetMapping("/adminSignOut")
    public String adminSignOut() {
        // Perform any necessary sign-out logic specific to the gym admin
        return "index"; // Redirect to the index page after signing out
    }
}
