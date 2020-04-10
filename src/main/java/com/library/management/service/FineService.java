package com.library.management.service;

import com.library.management.model.Fine;

import java.util.List;

public interface FineService {

    List<Fine> findByUserId(Long userId);
    Fine save(Fine fine);
    List<Fine> findAll();

}
