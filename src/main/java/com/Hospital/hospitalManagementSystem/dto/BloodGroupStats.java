package com.Hospital.hospitalManagementSystem.dto;

import com.Hospital.hospitalManagementSystem.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGrouptype;

    private final Long count;

}
