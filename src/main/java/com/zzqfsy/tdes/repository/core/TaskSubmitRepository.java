package com.zzqfsy.tdes.repository.core;

import com.zzqfsy.tdes.domain.core.TaskDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskSubmitRepository extends JpaRepository<TaskDO, Long> {
}
