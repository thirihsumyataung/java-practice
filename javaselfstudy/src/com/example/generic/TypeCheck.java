package com.example.generic;

public class TypeCheck <T> {
    public String typechecking (T type){
        if (type instanceof Object){
            return "Object";
        }
        else if (type instanceof Integer){
            return "Integer";
        }
        else if (type instanceof String){
            return "String";
        }
        else if (type instanceof Double){
            return "Double";
        }
        else if (type instanceof Boolean){
            return "boolean";
        }
        else {
            return "Can't check that type";
        }
    }

}
