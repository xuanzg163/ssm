package com.ssm.dto;

import com.ssm.po.Card;
import com.ssm.po.User;

import java.io.Serializable;

/**
 * @auther zhangxuan
 * @date 2018/10/12
 * @time 15:57
 */

public class UserCardDto implements Serializable {
    private User user;
    private Card card;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "UserCardDto{" +
                "user=" + user +
                ", card=" + card +
                '}';
    }
}
