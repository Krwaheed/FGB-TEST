package com.csc340.jpacruddemo.AddRemoveGyms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

// Ensure you import the AddRemoveGyms class correctly


@Controller
@RequestMapping("/admin/gyms")
public class GymController {
    private final GymService gymService;

    @Autowired
    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping("/manage")
    public String showGyms(Model model) {
        model.addAttribute("gyms", gymService.getAllGyms());
        return "ManageGyms";
    }

    @PostMapping("/add")
    public String addGym(@ModelAttribute AddRemoveGyms gym, Model model) {
        gymService.saveGym(gym);
        return "redirect:/admin/gyms/manage";
    }

    @GetMapping("/edit/{id}")
    public String editGymForm(@PathVariable long id, Model model) {
        Optional<AddRemoveGyms> gym = gymService.getGymById(id);
        model.addAttribute("gym", gym.orElse(null));
        return "ManageGyms";
    }

    @PostMapping("/update/{id}")
    public String updateGym(@PathVariable long id, @ModelAttribute AddRemoveGyms gym, Model model) {
        gymService.updateGym(id, gym);
        return "redirect:/admin/gyms/manage";
    }

    @GetMapping("/delete/{id}")
    public String deleteGym(@PathVariable long id, Model model) {
        gymService.deleteGym(id);
        return "redirect:/admin/gyms/manage";
    }
}
