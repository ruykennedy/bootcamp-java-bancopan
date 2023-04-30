package com.dio.estrutural;

public class CafeComCanela extends CafeDecorator {

    public CafeComCanela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 0.25;
    }

    @Override
    public String getComplementos() {
        return super.getComplementos() + "\n\t+ Canela em Pó";
    }
}
