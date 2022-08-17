package com.aston.studentslogs.domain.mapper;

import com.aston.studentslogs.domain.dto.request.MessageRequest;
import com.aston.studentslogs.domain.dto.request.MessageRequestUpdateData;
import com.aston.studentslogs.domain.dto.response.MessageResponse;
import com.aston.studentslogs.domain.entity.MessageEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    MessageResponse toResponse(MessageEntity source);
    MessageEntity fromRequest(MessageRequest source);
    MessageEntity fromRequestUpdate(MessageRequestUpdateData source);
}
