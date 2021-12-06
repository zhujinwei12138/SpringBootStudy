package com.example.jpaonetoone.Service;

import com.example.jpaonetoone.Entity.Card;

import java.util.List;

/**
 * FileName:CardService
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:17:09
 */
public interface CardService {
    public List<Card> getCardList();

    public Card findCardById(long id);
}
