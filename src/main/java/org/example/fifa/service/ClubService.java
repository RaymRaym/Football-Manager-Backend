package org.example.fifa.service;

import org.example.fifa.entity.Club;
import org.example.fifa.entity.Manager;

public interface ClubService {

    public Club addClub(Club club);

    public Boolean assignManager(Club club, Manager manager);
}
