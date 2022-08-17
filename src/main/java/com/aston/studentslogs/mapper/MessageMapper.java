package com.aston.studentslogs.mapper;

import com.aston.studentslogs.dto.request.MessageRequest;
import com.aston.studentslogs.dto.request.MessageRequestUpdateData;
import com.aston.studentslogs.dto.response.MessageResponse;
import com.aston.studentslogs.models.MessageEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {

    MessageResponse toResponse(MessageEntity source);

    MessageEntity fromRequest(MessageRequest source);

    MessageEntity fromRequestUpdate(MessageRequestUpdateData source);

    MessageEntity merge(MessageEntity source, MessageEntity target);



}
