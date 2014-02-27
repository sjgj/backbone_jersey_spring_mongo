window.Articles = Backbone.Model.extend({
	urlRoot : "rest/articles",
	defaults : {
		id : null,
		title : "",
		remarks : "",
		description : ""
	},
	initialize : function() {
		this.articles = new ArticleCollection();
	}

});

window.ArticleCollection = Backbone.Collection.extend({
	model : Articles,
	url : "rest/articles"
});