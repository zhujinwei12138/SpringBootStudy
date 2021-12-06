package com.example.jpaonetoone.Service.Impl;

import com.example.jpaonetoone.Entity.Card;
import com.example.jpaonetoone.Repository.CardRepository;
import com.example.jpaonetoone.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName:CardServiceImpl
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:17:36
 */

public class CardServiceImpl implements CardService {
    @Autowired
    CardRepository cardRepository;

    @Override
    public List<Card> getCardList() {
        return cardRepository.findAll();
    }

    @Override
    public Card findCardById(long id) {
        return cardRepository.findById(id);
    }
}
