package com.zzqfsy.tdes.service.core;

import com.zzqfsy.tdes.domain.core.StageStatusType;
import com.zzqfsy.tdes.domain.core.TaskStatusType;
import com.zzqfsy.tdes.domain.core.WaveStatusType;
import com.zzqfsy.tdes.dto.WaveCreateDTO;
import com.zzqfsy.tdes.repository.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaveDomainService {

    @Autowired
    private WaveRepository waveRepository;
    @Autowired
    private StageRepository stageRepository;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskDetailRepository taskDetailRepository;

    public void create(WaveCreateDTO waveCreateDTO){
        waveCreateDTO.getWaveDO().setWaveStatus(WaveStatusType.READY.getStatus());
        waveRepository.save(waveCreateDTO.getWaveDO());

        waveCreateDTO.getStageDOList().forEach(stageDO -> stageDO.setStageStatus(StageStatusType.INIT.getStatus()));
        stageRepository.save(waveCreateDTO.getStageDOList());

        waveCreateDTO.getTaskDOList().forEach(taskDO -> taskDO.setTaskStatus(TaskStatusType.READY.getStatus()));
        taskRepository.save(waveCreateDTO.getTaskDOList());

        taskDetailRepository.save(waveCreateDTO.getTaskDetailDOList());
    }
}
