package com.aston.studentslogs.domain.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DtoErrorInfoForSwagger {

    private LocalDateTime timestamp;

    private Integer status;

    private String error;

    private String exception;

    private String message;
}
