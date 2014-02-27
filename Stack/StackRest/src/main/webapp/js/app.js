window.Router = Backbone.Router.extend({

	routes : {
		"home" : "home",
		"users" : "users",
		"articles" : "articles",
		"articles/new" : "newArticle",
		"articles/:id" : "articleDetails",
	},

	home : function() {
		if (!this.homeView) {
			this.homeView = new HomeView();
			this.homeView.render();
		} else {
			this.homeView.delegateEvents();
		}
		$("#content").html(this.homeView.el);
	},

	users : function() {
		var userList = new UserCollection();
		userList.fetch({
			success : function() {
				$("#content").html(new UsersListView({
					model : userList
				}).el);
			}
		});
	},

	articles : function() {
		var articleList = new ArticleCollection();
		articleList.fetch({
			success : function() {
				$("#content").html(new ArticleListView({
					model : articleList
				}).el);
			}
		});
	},

	newArticle : function() {
		var article = new Articles();
		$('#content').html(new ArticleView({
			model : article
		}).el);
	},

	articleDetails : function(id) {
		var article = new Articles({
			id : id
		});
		article.fetch({
			success : function() {
				$("#content").html(new ArticleView({
					model : article
				}).el);
			}
		});
	},

});

templateLoader.load([ "HomeView", "UsersView", "ArticlesView", "ArticleView" ],
		function() {
			app = new Router();
			Backbone.history.start();
		});