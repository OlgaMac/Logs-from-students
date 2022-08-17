package com.aston.studentslogs.domain.mapper;

import com.aston.studentslogs.domain.dto.request.StudentRequest;
import com.aston.studentslogs.domain.dto.request.StudentRequestUpdate;
import com.aston.studentslogs.domain.dto.response.StudentResponse;
import com.aston.studentslogs.domain.entity.StudentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentResponse toResponse (StudentEntity studentEntity);
    StudentEntity fromRequest (StudentRequest studentRequest);
    StudentEntity fromUpdate (StudentRequestUpdate studentRequestUpdate);
}
