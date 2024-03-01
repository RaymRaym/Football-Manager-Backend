package org.example.fifa.service;

import lombok.extern.slf4j.Slf4j;
import org.example.fifa.entity.Club;
import org.example.fifa.entity.Manager;
import org.example.fifa.repository.ClubRepository;
import org.example.fifa.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ClubServiceImpl implements ClubService{

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    ManagerRepository managerRepository;

    @Override
    public Club addClub(Club club) {
        club = clubRepository.save(club);
        log.info(club.getName());
        return club;
    }

    @Override
    public Boolean assignManager(Club club, Manager manager) {
        Optional<Club> clubById = clubRepository.findById(club.getId());
        Optional<Manager> managerById = managerRepository.findById(manager.getId());
        if (clubById.isEmpty() || managerById.isEmpty()) return false;
        try {
            club = clubById.get();
            manager = managerById.get();
            club.setManager(manager);
            manager.setClub(club);
            managerRepository.save(manager);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage());
            log.error("assign manager to club, assign club to manager failed");
            return false;
        }
    }
}
