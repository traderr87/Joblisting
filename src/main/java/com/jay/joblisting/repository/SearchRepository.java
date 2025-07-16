package com.jay.joblisting.repository;

import com.jay.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
