package com.zzqfsy.tdes.service.other;

import com.zzqfsy.tdes.domain.other.SkuDO;
import com.zzqfsy.tdes.repository.other.SkuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkuDomainService {

    @Autowired
    private SkuRepository skuRepository;

    public SkuDO create(SkuDO skuDO){
        return skuRepository.save(skuDO);
    }
}
