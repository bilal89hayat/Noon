package com.library.management.service.impl;

import com.library.management.model.Fine;
import com.library.management.repository.FineRepository;
import com.library.management.service.FineService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;

@Service
public class FineServiceImpl implements FineService {

    private FineRepository fineRepository;

    public FineServiceImpl(FineRepository fineRepository) {
        this.fineRepository = fineRepository;
    }

    @Override
    public List<Fine> findByUserId(Long userId) {

        List<Fine> fineList = fineRepository.findByUserId(userId);
        Map<String, List<Fine>> map =fineList.stream().collect(groupingBy(ele->ele.getBookId()));

        return null;
    }

    @Override
    public Fine save(Fine fine) {
        return null;
    }

    @Override
    public List<Fine> findAll() {
        return fineRepository.findAll();
    }
}
