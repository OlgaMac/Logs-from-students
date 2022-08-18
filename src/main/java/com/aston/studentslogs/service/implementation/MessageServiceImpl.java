package com.aston.studentslogs.service.implementation;

import com.aston.studentslogs.domain.entity.MessageEntity;
import com.aston.studentslogs.domain.entity.StudentEntity;
import com.aston.studentslogs.repository.MessageRepository;
import com.aston.studentslogs.repository.StudentRepository;
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
    private final StudentRepository studentRepository;


    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository, StudentRepository studentRepository) {
        this.messageRepository = messageRepository;
        this.studentRepository = studentRepository;
    }


    @Override
    @Transactional
    public MessageEntity createMessage(Long studentId, String message) {
        Optional<StudentEntity> student  = studentRepository.findById(studentId);
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setMessage(message);
        messageEntity.setStudent(student.get());
        messageRepository.save(messageEntity);
        return messageEntity;
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
    public MessageEntity findOne(Long id) {
        Optional<MessageEntity> messageEntity = messageRepository.findById(id);
        return messageEntity.orElseThrow(IllegalArgumentException::new);
    }
}
