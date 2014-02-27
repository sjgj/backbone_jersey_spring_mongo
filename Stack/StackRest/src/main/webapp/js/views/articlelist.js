window.ArticleListView = Backbone.View.extend({

	

	initialize : function() {
		this.render();
	},

	render : function() {
		var articles = this.model.models;
		// console.log(articles[0].id);
		if (articles.length > 0) {
			$(this.el).html('<ul class="thumbnails"></ul>');
			for ( var i = 0; i < articles.length; i++) {
				$('.thumbnails', this.el).append(new ArticlesView({
					model : articles[i]
				}).render().el);
			}
			$(this.el).append('<a href="#articles/new" class="btn btn-primary save">Add New Article</a> ');
			return this;
		} else {
			$(this.el).html('<div class="formContent"></div>');
			$('.formContent', this.el).append(new ArticleView({
				model : new Articles()
			}).render().el);
		}

	}
});

window.ArticlesView = Backbone.View.extend({

	tagName : "li",

	initialize : function() {
		this.model.bind("reset", this.render, this);
		this.model.bind("destroy", this.close, this);
	},

	render : function() {
		$(this.el).html(this.template(this.model.toJSON()));
		return this;
	}

});
