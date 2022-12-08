package com.zzqfsy.tdes.dto;

import com.zzqfsy.tdes.domain.core.StageDO;
import com.zzqfsy.tdes.domain.core.TaskDO;
import com.zzqfsy.tdes.domain.core.TaskDetailDO;
import com.zzqfsy.tdes.domain.core.WaveDO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class WaveCreateDTO implements Serializable {

    private WaveDO waveDO;

    private List<StageDO> stageDOList;

    private List<TaskDO> taskDOList;

    private List<TaskDetailDO> taskDetailDOList;
}
