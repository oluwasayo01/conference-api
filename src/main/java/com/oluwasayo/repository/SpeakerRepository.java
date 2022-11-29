package com.oluwasayo.repository;

import com.oluwasayo.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
