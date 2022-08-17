package com.aston.studentslogs.config.domain.mapper;

import com.aston.studentslogs.config.domain.dto.request.StudentRequest;
import com.aston.studentslogs.config.domain.dto.request.StudentRequestUpdate;
import com.aston.studentslogs.config.domain.dto.response.StudentResponse;
import com.aston.studentslogs.config.domain.entity.StudentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentResponse toResponse (StudentEntity studentEntity);
    StudentEntity fromRequest (StudentRequest studentRequest);
    StudentEntity fromUpdate (StudentRequestUpdate studentRequestUpdate);
    StudentEntity merge (StudentEntity source, StudentEntity target);
}
