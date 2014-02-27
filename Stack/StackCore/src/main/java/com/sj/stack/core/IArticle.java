/**
 * 
 */
package com.sj.stack.core;

import java.util.List;

import com.sj.model.Articles;

/**
 * @author SJ
 *
 */
public interface IArticle {
    
    public Articles getArticle(String id);
    public List<Articles>findAllArticles();
    public void saveArticle(Articles articles);
    public void removeArticle(String id);    
    
}
