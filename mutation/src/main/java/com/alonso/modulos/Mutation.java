package com.alonso.modulos;

public class Mutation {

    public int getNumberOfMutations(boolean fullMode){
        if(fullMode == true){
            return 10;
        }
        else {
            return 20;
        }
    }
}
