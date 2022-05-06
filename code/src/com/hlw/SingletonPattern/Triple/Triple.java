package com.hlw.SingletonPattern.Triple;

public class Triple {

    private String name;


    private static Triple[] triples = new Triple[] {
            new Triple("first"),
            new Triple("second"),
            new Triple("third")
    };

    private Triple(String name) {
        this.name = name;
    }

    public Triple getInstance(int id) {
        if(id > 2) {
            return null;
        }
        return triples[id];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
