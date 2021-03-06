package com.chen.dayaction.designpattern.factory4.computer;

/**
 * Created by ChenTian on 2018/9/11.
 */
public class IntelComputeFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard();
    }
}
