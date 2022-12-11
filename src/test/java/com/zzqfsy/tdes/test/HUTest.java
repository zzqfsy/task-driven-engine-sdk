package com.zzqfsy.tdes.test;

import com.zzqfsy.tdes.TestApplication;
import com.zzqfsy.tdes.domain.other.HUDO;
import com.zzqfsy.tdes.domain.other.HUType;
import com.zzqfsy.tdes.domain.other.SkuDO;
import com.zzqfsy.tdes.repository.core.HURepository;
import com.zzqfsy.tdes.service.other.HUDomainService;
import com.zzqfsy.tdes.service.other.SkuDomainService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})// 指定启动类
public class HUTest {

    @Autowired
    private HUDomainService huDomainService;
    @Autowired
    private HURepository huRepository;

    @Test
    public void create(){
        HUDO hudo = new HUDO();
        hudo.setTenantCode("zzqfsy");
        hudo.setWarehouseCode("zzq1");
        hudo.setHUCode("cabinet001");
        hudo.setHUType(HUType.CABINET.getType());
        HUDO hudo1 = huDomainService.createHU(hudo);
        Assert.assertNotNull(hudo1);
    }

    @Test
    public void get(){
        HUDO hudo1 = huRepository.findOne(1L);
        Assert.assertNotNull(hudo1);
    }

    @Test
    public void findAll(){
        List<HUDO> hudoList = huRepository.findAll();
        Assert.assertNotNull(hudoList);
    }


    @Test
    public void update(){
        HUDO hudo = new HUDO();
        hudo.setId(4L);
        hudo.setTenantCode("zzqfsy");
        hudo.setWarehouseCode("zzq1");
        hudo.setHUCode("cabinet002");
        hudo.setHUType(HUType.CABINET.getType());
        hudo = huRepository.save(hudo);
        Assert.assertNotNull(hudo);
    }
}
