package ru.vladykina.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vladykina.demo.repository.EmailRepository;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final EmailRepository emailRepository;

    public String findEmail(String accNum) {
        return emailRepository.findEmail(accNum);
    }
}