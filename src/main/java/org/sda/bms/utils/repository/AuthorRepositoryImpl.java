package org.sda.bms.utils.repository;

import org.sda.bms.model.Author;

public class AuthorRepositoryImpl extends BaseRepositoryImpl<Author> implements AuthorRepository {
    public AuthorRepositoryImpl() {
        super(Author.class);
    }
}