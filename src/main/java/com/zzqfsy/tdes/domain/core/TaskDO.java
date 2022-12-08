package com.zzqfsy.tdes.domain.core;

import com.zzqfsy.tdes.domain.BaseDO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tdes_task")
@Data
public class TaskDO extends BaseDO {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 波次编码
     */
    private String waveCode;

    /**
     * 阶段编码
     */
    private String stageCode;

    /**
     * 任务编码
     */
    private String taskCode;

    /**
     * 任务状态
     */
    private Integer taskStatus;


}
