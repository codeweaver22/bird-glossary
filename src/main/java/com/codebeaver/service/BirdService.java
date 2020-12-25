package com.codebeaver.service;

import com.codebeaver.model.Bird;
import com.codebeaver.repository.BirdDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirdService {

    @Autowired
    private BirdDao birdDao;

    public List<Bird> getBirds(){
        List<Bird> birds = birdDao.getBirds();
        return birds;
    }
}
