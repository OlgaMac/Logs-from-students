package com.aston.studentslogs.service;

import com.aston.studentslogs.domain.entity.MessageEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {


    MessageEntity createMessage(Long studentId, String message);

    MessageEntity updateMessage(MessageEntity messageEntity);

    List<MessageEntity> findByStudentId(Long studentId);


}
