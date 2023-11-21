package com.csc340.jpacruddemo.AddRemoveGyms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AddRemoveGymsRepository extends JpaRepository<AddRemoveGyms, Long> {

}