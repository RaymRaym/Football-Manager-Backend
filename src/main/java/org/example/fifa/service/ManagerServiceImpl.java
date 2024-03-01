package org.example.fifa.service;

import lombok.extern.slf4j.Slf4j;
import org.example.fifa.entity.Manager;
import org.example.fifa.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    ManagerRepository managerRepository;
    @Override
    public Manager addManager(Manager manager) {
        manager = managerRepository.save(manager);
        log.info(manager.getName());
        return manager;
    }
}
