package com.aston.studentslogs.service.implementation;

import com.aston.studentslogs.domain.entity.MessageEntity;
import com.aston.studentslogs.domain.entity.StudentEntity;
import com.aston.studentslogs.repository.MessageRepository;
import com.aston.studentslogs.repository.StudentRepository;
import com.aston.studentslogs.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
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
        Optional<StudentEntity> student = studentRepository.findById(studentId);
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setMessage(message);
        messageEntity.setDate(LocalDate.now());
        messageEntity.setStudent(student.get());
        messageRepository.save(messageEntity);
        return messageEntity;
    }

    @Override
    @Transactional
    public MessageEntity updateMessage(MessageEntity messageEntity) {
        messageRepository.save(messageEntity);
        return messageEntity;
    }

    @Override
    @Transactional
    public List<MessageEntity> findByStudentId(Long studentId) {
        return messageRepository.findAllById(studentId);
    }

    @Transactional
    public MessageEntity findOne(Long id) {
        Optional<MessageEntity> messageEntity = messageRepository.findById(id);
        return messageEntity.orElseThrow(IllegalArgumentException::new);
    }
}
