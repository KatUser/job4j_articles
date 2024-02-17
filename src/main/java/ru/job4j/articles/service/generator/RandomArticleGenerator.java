package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomArticleGenerator implements ArticleGenerator {
    @Override
    public Article generate(List<Word> words) {
        var wordsCopy = new ArrayList<>(words);
        Collections.shuffle(wordsCopy);
        var content = String.join(" ");
        return new Article(content);
    }
}
