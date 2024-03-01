package org.example.fifa.service;

import org.example.fifa.entity.Club;
import org.example.fifa.entity.Manager;
import org.example.fifa.repository.ClubRepository;
import org.example.fifa.repository.ManagerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClubServiceTest {

    @Autowired
    ClubService clubService;

    @Autowired
    ManagerService managerService;

    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    ClubRepository clubRepository;

    @Test
    void addClub() {
        Club club = new Club();
        club.setName("Manchester United");
        club = clubService.addClub(club);
        Manager manager = club.getManager();
        assertNotNull(manager);
//        System.out.println());
    }


    @Test
    void assignManager() {
        Optional<Club> byId = clubRepository.findById(2);
        Club club = byId.get();
        Optional<Manager> byId1 = managerRepository.findById(3);
        Manager manager = byId1.get();
        Boolean b = clubService.assignManager(club, manager);
        System.out.println(b);
    }
}