package org.example.fifa.service;

import org.example.fifa.entity.Club;
import org.example.fifa.entity.Event;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class MatchServiceImpl implements MatchService {
    @Override
    public void test() {
        System.out.println("test!");
    }

    @Override
    public void addMatch(Club home, Club away, LocalDateTime time, Integer homeGoal, Integer awayGoal, Event event) {
        System.out.println(1);
    }


}
