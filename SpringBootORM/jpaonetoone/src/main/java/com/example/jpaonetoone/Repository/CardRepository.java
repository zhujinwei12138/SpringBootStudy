package com.example.jpaonetoone.Repository;

import com.example.jpaonetoone.Entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * FileName:CardRepository
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:16:37
 */
public interface CardRepository extends JpaRepository<Card, Long>, JpaSpecificationExecutor<Card> {
    Card findById(long id);
}
