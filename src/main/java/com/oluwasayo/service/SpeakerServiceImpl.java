package com.oluwasayo.service;

import com.oluwasayo.model.Speaker;
import com.oluwasayo.repository.HibernateSpeakerRepositoryImpl;
import com.oluwasayo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();


    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
