package com.zzqfsy.tdes.test;

import com.zzqfsy.tdes.TestApplication;
import com.zzqfsy.tdes.domain.core.StageDO;
import com.zzqfsy.tdes.domain.core.WaveDO;
import com.zzqfsy.tdes.domain.core.WaveStatusType;
import com.zzqfsy.tdes.dto.WaveCreateDTO;
import com.zzqfsy.tdes.service.core.WaveDomainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplication.class})// 指定启动类
public class WaveTest {


    @Autowired
    private WaveDomainService waveDomainService;

    @Test
    public void create(){
//        WaveCreateDTO waveCreateDTO = new WaveCreateDTO();
//        waveCreateDTO.setWaveDO(getWave());
//
//
//        waveCreateDTO.setStageDOList();
//
//
//        waveCreateDTO.setTaskDOList();
//
//        waveCreateDTO.setTaskDetailDOList();
//        waveDomainService.create(waveCreateDTO);
    }

    public WaveDO getWave(){
        WaveDO waveDO = new WaveDO();
        waveDO.setTenantCode("zzqfsy");
        waveDO.setWarehouseCode("zzq1");
        waveDO.setWaveCode("bjbf001");
        waveDO.setWaveName("边检边分001");
        waveDO.setWaveStatus(WaveStatusType.READY.getStatus());



        return waveDO;
    }

    public List<StageDO> stageDOList(){
        List<StageDO> stageDOList = new ArrayList<>();

        StageDO stageDO1 = new StageDO();
        stageDO1.setTenantCode("zzqfsy");
        stageDO1.setWarehouseCode("zzq1");
        stageDO1.setWaveCode("bjbf001");

        stageDO1.setStageCode("JH001");

        return stageDOList;
    }
}
