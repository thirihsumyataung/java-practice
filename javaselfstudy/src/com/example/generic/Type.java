package com.example.generic;

public class Type <T> {
    T anyObject;
    public Type(T anyKindOfObjectType){
        this.anyObject = anyKindOfObjectType;
    }
    public T getAnyObject(){
        return this.anyObject;
    }


}
