/**
 * 
 */
package com.sj.stack.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sj.model.Articles;

/**
 * @author SJ
 *
 */
public class IArticleImpl implements IArticle {

    @Autowired
    MongoTemplate mongoTemplate;
    
    /* (non-Javadoc)
     * @see com.sj.stack.core.IArticle#getArticle(java.lang.String)
     */
    public Articles getArticle(String id) {
	// TODO Auto-generated method stub
	Query searchArticleQuery = new Query(Criteria.where("id").is(id));
	Articles searchedArticle = mongoTemplate.findOne(searchArticleQuery, Articles.class);
	return searchedArticle;
    }

    /* (non-Javadoc)
     * @see com.sj.stack.core.IArticle#findAllArticles()
     */
    public List<Articles> findAllArticles() {
	// TODO Auto-generated method stub
	List<Articles> listArticles = mongoTemplate.findAll(Articles.class);
	return listArticles;
    }

    /* (non-Javadoc)
     * @see com.sj.stack.core.IArticle#saveArticle(com.sj.model.Articles)
     */
    public void saveArticle(Articles articles) {
	// TODO Auto-generated method stub
	mongoTemplate.save(articles);

    }

    /* (non-Javadoc)
     * @see com.sj.stack.core.IArticle#removeArticle(com.sj.model.Articles)
     */
    public void removeArticle(String id) {
	// TODO Auto-generated method stub
	Query searchArticleQuery = new Query(Criteria.where("id").is(id));
	Articles searchedArticle = mongoTemplate.findOne(searchArticleQuery, Articles.class);
	mongoTemplate.remove(searchedArticle);
    }

}
