package com.kaio.cercification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.kaio.cercification_nlw.modules.students.dto.VerifyIfHasCertificationDto;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute(VerifyIfHasCertificationDto dto){
        if(dto.getEmail().equals("kaiosandek@gmail.com") && dto.getTechnology().equals("Java")){
            return true;
        }
        return false;
    }
}
