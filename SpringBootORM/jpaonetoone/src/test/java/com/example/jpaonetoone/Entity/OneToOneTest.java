package com.example.jpaonetoone.Entity;

import com.example.jpaonetoone.Repository.CardRepository;
import com.example.jpaonetoone.Repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:OneToOneTest
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:46:55
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OneToOneTest {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CardRepository cardRepository;

    @Test
    public void testonetoone() {
        Student student1 = new Student();
        student1.setName("朱金炜");
        student1.setSex("male");
        Student student2 = new Student();
        student2.setName("李兴振");
        student2.setSex("female");

        Card card1 = new Card();
        card1.setNum(422802);
        student1.setCard(card1);
        Card card2 = new Card();
        card2.setNum(422803);
        student2.setCard(card2);
        //cardRepository.save(card2);
        studentRepository.save(student1);
        studentRepository.save(student2);

        /**
         * Description: 获取添加之后的id
         */
        Long id = student1.getId();
        Long id2=student2.getId();
        /**
         * Description: 删除刚刚添加的student1
         */
        studentRepository.deleteById(id);
        studentRepository.deleteById(id2);
    }
}
