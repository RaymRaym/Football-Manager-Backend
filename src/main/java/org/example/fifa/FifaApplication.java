package org.example.fifa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.fifa.entity.Club;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class FifaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FifaApplication.class, args);
    }


//    @Bean
//    public CommandLineRunner demoData() {
//        return args -> {
//            Club club = new Club();
//            club.setName("qwer");
//            entityManager.persist(club);
//        };
//    }
}
