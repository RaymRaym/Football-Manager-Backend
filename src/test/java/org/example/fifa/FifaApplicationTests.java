package org.example.fifa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.fifa.entity.Club;
import org.example.fifa.entity.Manager;
import org.example.fifa.repository.ClubRepository;
import org.example.fifa.repository.ManagerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.management.timer.Timer;

@SpringBootTest
class FifaApplicationTests {

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    ManagerRepository managerRepository;

    @Test
    void testClubCascade() throws InterruptedException {
        Club club = new Club();
        club.setName("qwer");
        Manager manager = new Manager();
        manager.setName("asdf");
        club.setManager(manager);
        manager.setClub(club);

        clubRepository.save(club);
//        Thread.sleep(Timer.ONE_MINUTE * 2);
    }

    @Test
    void testManagerCascade() {
        Manager manager = new Manager();
        manager.setName("mnbv");

        Club club = new Club();
        club.setName("zxcv");

        manager.setClub(club);

        managerRepository.save(manager);

        System.out.println(manager);

    }




}
