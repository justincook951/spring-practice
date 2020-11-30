package com.justincook.learningspring;

import com.justincook.learningspring.data.entity.Guest;
import com.justincook.learningspring.data.entity.Reservation;
import com.justincook.learningspring.data.repository.GuestRepository;
import com.justincook.learningspring.data.repository.ReservationRepository;
import com.justincook.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.justincook.learningspring.data.entity.Room;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}


}
