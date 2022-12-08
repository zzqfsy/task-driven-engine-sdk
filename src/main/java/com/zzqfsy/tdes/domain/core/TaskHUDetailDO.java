package com.zzqfsy.tdes.domain.core;

import com.zzqfsy.tdes.domain.BaseDO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tdes_task_hu_detail")
@Data
public class TaskHUDetailDO extends BaseDO {

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
     * HU编码
     */
    private String HUCode;

    /**
     * HU类型
     */
    private Integer HUType;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 提交明细
     */
    private Integer submitQuantity;
}
