package com.Mock_Spring.project1.Repository;

import com.Mock_Spring.project1.Entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Integer> {

}
