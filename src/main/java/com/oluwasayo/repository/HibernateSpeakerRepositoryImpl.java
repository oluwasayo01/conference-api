package com.oluwasayo.repository;

import com.oluwasayo.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Bryan");
        speaker.setLastname("Hansen");

        speakers.add(speaker);
        return speakers;
    }
}
