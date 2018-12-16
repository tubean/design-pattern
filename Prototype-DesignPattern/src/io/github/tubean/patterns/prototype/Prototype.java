package io.github.tubean.patterns.prototype;

public interface Prototype extends Cloneable {

    public AccessControl clone() throws CloneNotSupportedException;

}