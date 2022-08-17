package com.aston.studentslogs.domain.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MessageRequestUpdateData {
    private Long id;
    private String text;
}
