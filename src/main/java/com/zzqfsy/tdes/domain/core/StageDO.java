package com.zzqfsy.tdes.domain.core;

import com.zzqfsy.tdes.domain.BaseDO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tdes_stage")
@Data
public class StageDO extends BaseDO {

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
     * 阶段状态
     */
    private Integer stageStatus;

    /**
     * HU类型
     */
    @Column(name = "hu_type")
    private Long HUType;

    /**
     * 下一阶段编码
     */
    private String nextStageCode;

    /**
     * 支持下一阶段HU类型
     */
    private Long nextHUType;

    /**
     * 下一阶段依赖阶段状态
     */
    private Long nextDependStageStatus;
}
