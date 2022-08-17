package com.aston.studentslogs.config.domain.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentRequestUpdate {
    private Long id;
    private String firstName;
    private String lastName;

}
