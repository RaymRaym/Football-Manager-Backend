package org.example.fifa.service;

import org.example.fifa.entity.Manager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManagerServiceImplTest {

    @Autowired
    ManagerService managerService;

    @Test
    void addManager() {
        Manager manager = new Manager();
        manager.setName("Rui Wang");
        manager = managerService.addManager(manager);
        assertEquals(1, List.of(manager).size());
    }
}