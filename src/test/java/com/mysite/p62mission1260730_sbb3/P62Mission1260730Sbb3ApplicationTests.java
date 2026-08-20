package com.mysite.p62mission1260730_sbb3;

import com.mysite.p62mission1260730_sbb3.answer.AnswerRepository;
import com.mysite.p62mission1260730_sbb3.question.Question;
import com.mysite.p62mission1260730_sbb3.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class P62Mission1260730Sbb1ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

//    @Test
//    void testJpa() {
//        Question q1 = new Question();
//        q1.setSubject("sbb가 무엇");
//        q1.setContent("sbb에 대해서 알고 싶음");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트가 무엇");
//        q2.setContent("id는 자동 생성?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);
//    }

    @Test
    void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(1);
        if (oq.isPresent()) {
            Question q = oq.get();
            assertEquals("sbb가 무엇", q.getSubject());
        }
    }


}
