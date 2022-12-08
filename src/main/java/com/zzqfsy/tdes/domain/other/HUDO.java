package com.zzqfsy.tdes.domain.other;

import com.zzqfsy.tdes.domain.BaseDO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tdes_hu")
@Data
public class HUDO extends BaseDO {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * HU编码
     */
    private String HUCode;

    /**
     * HU类型
     */
    private Integer HUType;
}
