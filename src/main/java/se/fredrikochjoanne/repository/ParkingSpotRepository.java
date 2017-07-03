package se.fredrikochjoanne.repository;

import org.springframework.data.repository.CrudRepository;
import se.fredrikochjoanne.model.ParkingSpot;

public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {}
