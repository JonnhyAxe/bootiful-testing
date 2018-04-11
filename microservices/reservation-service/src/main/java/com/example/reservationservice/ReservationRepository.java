package com.example.reservationservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	@Query("select r from Reservation r where r.reservationName='CAFEBABE'")
	Collection<Reservation> findAllCafeBabe();

	Collection<Reservation> findByReservationName(String rn);
}
