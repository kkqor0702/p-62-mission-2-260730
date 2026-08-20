package com.mysite.p62mission1260730_sbb3.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message = "제목은 필수항목")
    @Size(max = 200)
    private String subject;

    @NotEmpty(message = "내용은 필수항목")
    private String content;
}
