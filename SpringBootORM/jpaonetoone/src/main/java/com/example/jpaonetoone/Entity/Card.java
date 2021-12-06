package com.example.jpaonetoone.Entity;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * FileName:Card
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:16:02
 */
@Entity
@Table(name = "card")
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int num;
}
