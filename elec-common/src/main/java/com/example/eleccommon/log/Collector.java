package com.example.eleccommon.log;

@FunctionalInterface
public interface Collector<T> {
    void collect(T data);
}
