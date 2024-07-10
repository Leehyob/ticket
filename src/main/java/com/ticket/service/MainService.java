package com.ticket.service;

import com.ticket.entity.Main;
import com.ticket.repository.MainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MainService {

    private final MainRepository mainRepository;

    public List<Main> getList(String making){

        List<Main> mains = mainRepository.findByMaking(making);

        return mains;
    }
}
