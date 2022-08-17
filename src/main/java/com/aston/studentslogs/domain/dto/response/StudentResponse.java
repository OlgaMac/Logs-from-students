package com.aston.studentslogs.domain.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Accessors
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Long> idOfLogs;
}
