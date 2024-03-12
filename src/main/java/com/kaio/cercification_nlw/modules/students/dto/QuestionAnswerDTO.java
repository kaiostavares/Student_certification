package com.kaio.cercification_nlw.modules.students.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAnswerDTO {
    private UUID questionId;
    private UUID alternativeID;
    private boolean isCorrect;
}
