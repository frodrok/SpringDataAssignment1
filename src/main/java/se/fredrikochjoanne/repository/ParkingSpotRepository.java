package se.fredrikochjoanne.repository;

import org.springframework.data.repository.CrudRepository;
import se.fredrikochjoanne.model.ParkingSpot;

/**
 * Created by joanne on 21/01/16.
 */
public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {}
