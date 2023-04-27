package com.example.learnspringboot;

public record Course(long id, String name, String author) {

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
}
