package com.hlw.StrategyPattern;

/**
 * 表示参加猜拳游戏的选手的类，在生成Player类的实例时，需要向其传递 "姓名" 和 "策略"
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
