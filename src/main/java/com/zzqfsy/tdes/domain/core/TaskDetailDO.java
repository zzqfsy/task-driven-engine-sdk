package com.zzqfsy.tdes.domain.core;

import com.zzqfsy.tdes.domain.BaseDO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tdes_task_detail")
@Data
public class TaskDetailDO extends BaseDO {

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
     * 商品编码
     */
    private String skuCode;

    /**
     * 推荐HU编码
     */
    private String suggestHUCode;

    /**
     * 商品数量
     */
    private Integer quantity;

    /**
     * 待提交数量
     */
    private Integer waitQuantity;

    /**
     * 缺货数量
     */
    private Integer lackQuantity;


}
