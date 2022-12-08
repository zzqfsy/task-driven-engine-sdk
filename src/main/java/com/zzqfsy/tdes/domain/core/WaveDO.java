package com.zzqfsy.tdes.domain.core;

import com.zzqfsy.tdes.domain.BaseDO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tdes_wave")
@Data
public class WaveDO extends BaseDO {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 编码
     */
    private String waveCode;

    /**
     * 名称
     */
    private String waveName;

    /**
     * 状态
     *
     * @see WaveStatusType
     */
    private Integer waveStatus;

    public String getWaveCode() {
        return waveCode;
    }

    public void setWaveCode(String waveCode) {
        this.waveCode = waveCode;
    }

    public String getWaveName() {
        return waveName;
    }

    public void setWaveName(String waveName) {
        this.waveName = waveName;
    }

    public Integer getWaveStatus() {
        return waveStatus;
    }

    public void setWaveStatus(Integer waveStatus) {
        this.waveStatus = waveStatus;
    }
}
