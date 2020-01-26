package com.example.repositories.domain;


public class Repository {

    private final long id;
    private final String repositoryName;

    public Repository(long id, String repositoryName) {
        this.id = id;
        this.repositoryName = repositoryName;
    }

    public long getId() {
        return id;
    }

    public String getRepositoryName() {
        return repositoryName;
    }
}