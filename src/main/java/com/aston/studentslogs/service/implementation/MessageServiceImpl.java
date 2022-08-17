package com.aston.studentslogs.service.implementation;

import com.aston.studentslogs.domain.entity.MessageEntity;
import com.aston.studentslogs.repository.MessageRepository;
import com.aston.studentslogs.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;


    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    @Transactional
    public MessageEntity createMessage(Long studentId, String message) {
        return null;
    }

    @Override
    public MessageEntity updateMessage(MessageEntity messageEntity) {
        messageRepository.save(messageEntity);
        return messageEntity;
    }

    @Override
    public List<MessageEntity> findByStudentId(Long studentId) {
        return messageRepository.findByStudentId(studentId);
    }
    @Transactional
    public MessageEntity findOne (Long id){
       Optional<MessageEntity> messageEntity = messageRepository.findById(id);
        return messageEntity.orElseThrow(IllegalArgumentException::new);
    }
}