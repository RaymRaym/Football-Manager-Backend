package org.example.fifa.service;

import org.example.fifa.entity.Club;
import org.example.fifa.entity.Event;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;

public interface MatchService {
    void test();
    void addMatch(Club home, Club away, LocalDateTime time, Integer homeGoal, Integer awayGoal, Event event);
}
