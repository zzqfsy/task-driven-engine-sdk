package com.zzqfsy.tdes.service.other;

import com.zzqfsy.tdes.domain.other.HUDO;
import com.zzqfsy.tdes.repository.core.HURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HUDomainService {

    @Autowired
    private HURepository huRepository;

    public HUDO createHU(HUDO hudo){
        return huRepository.save(hudo);
    }
}
