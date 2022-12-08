package com.zzqfsy.tdes.test;

import com.zzqfsy.tdes.TestApplication;
import com.zzqfsy.tdes.domain.other.SkuDO;
import com.zzqfsy.tdes.service.other.SkuDomainService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})// 指定启动类
public class SkuTest {

    @Autowired
    private SkuDomainService skuDomainService;

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
}
