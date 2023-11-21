/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.AddRemoveGyms;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Import your AddRemoveGyms entity class correctly
import com.csc340.jpacruddemo.AddRemoveGyms.AddRemoveGyms;

/**
 * GymService for handling business logic related to AddRemoveGyms entities.
 */
@Service
public class GymService {

    @Autowired
    private AddRemoveGymsRepository addRemoveGymsRepository;

    public List<AddRemoveGyms> getAllGyms() {
        return addRemoveGymsRepository.findAll();
    }

    public Optional<AddRemoveGyms> getGymById(long id) {
        return addRemoveGymsRepository.findById(id);
    }

    public AddRemoveGyms saveGym(AddRemoveGyms gym) {
        return addRemoveGymsRepository.save(gym);
    }

    public void deleteGym(long id) {
        addRemoveGymsRepository.deleteById(id);
    }

    public AddRemoveGyms updateGym(long id, AddRemoveGyms gymDetails) {
        return addRemoveGymsRepository.findById(id)
                .map(gym -> {
                    gym.setName(gymDetails.getName());
                    gym.setDescription(gymDetails.getDescription());
                    gym.setAddress(gymDetails.getAddress());
                    gym.setCity(gymDetails.getCity());
                    gym.setState(gymDetails.getState());
                    gym.setZipCode(gymDetails.getZipCode());
                    gym.setCountry(gymDetails.getCountry());
                    gym.setContactNumber(gymDetails.getContactNumber());
                    gym.setEmailAddress(gymDetails.getEmailAddress());
                    return addRemoveGymsRepository.save(gym);
                })
                .orElseGet(() -> {
                    gymDetails.setId(id);
                    return addRemoveGymsRepository.save(gymDetails);
                });
    }

    // Additional methods can be added here as per your requirements.
}
