package com.hlw.StrategyPattern.Strategy_;

import com.hlw.StrategyPattern.Hand;
import com.hlw.StrategyPattern.Strategy;

import java.util.Random;

/**
 * 如果上一局的手势获胜，则下一局的手势就与上局相同，不然，则下局手势随机
 */
public class WinningStrategy implements Strategy {


    private Random random;
    private boolean won = false;
    private Hand prevHand;
    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
