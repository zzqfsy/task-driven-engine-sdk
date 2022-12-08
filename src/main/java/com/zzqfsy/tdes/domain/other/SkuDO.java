package com.zzqfsy.tdes.domain.other;

import com.zzqfsy.tdes.domain.BaseDO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tdes_sku")
@Data
public class SkuDO extends BaseDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 商品名称
     */
    private String skuName;
}
