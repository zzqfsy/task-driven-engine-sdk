package com.zzqfsy.tdes.test;

import com.zzqfsy.tdes.TestApplication;
import com.zzqfsy.tdes.domain.other.HUDO;
import com.zzqfsy.tdes.domain.other.SkuDO;
import com.zzqfsy.tdes.repository.other.SkuRepository;
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
public class SkuTest {

    @Autowired
    private SkuDomainService skuDomainService;
    @Autowired
    private SkuRepository skuRepository;

    @Test
    public void create(){
        SkuDO skuDO = new SkuDO();
        skuDO.setTenantCode("zzqfsy");
        skuDO.setWarehouseCode("zzq1");
        skuDO.setSkuCode("iphone11");
        skuDO.setSkuName("iphone11");
        SkuDO skuDO1 = skuDomainService.create(skuDO);
        Assert.assertNotNull(skuDO1);
    }

    @Test
    public void findAll(){
        List<SkuDO> skuDOList = skuRepository.findAll();
        Assert.assertNotNull(skuDOList);
    }

    @Test
    public void update(){
        SkuDO skuDO1 = skuRepository.findOne(2L);
        skuDO1.setSkuName("iphone12");
        skuDO1.setSkuCode("iphone12");
        skuRepository.save(skuDO1);
    }

}
