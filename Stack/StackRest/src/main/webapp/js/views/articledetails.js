window.ArticleView = Backbone.View.extend({

	initialize : function() {
		this.render();
	},

	render : function() {
		$(this.el).html(this.template(this.model.toJSON()));
		return this;
	},

	events : {
		"click .save" : "saveArticle"
	},

	saveArticle : function() {
		this.model.set({
			title : $('#title').val(),
			description : $('#description').val(),
			remarks : $('#remarks').val()
		});
		var self = this;
		this.model.save(null, {
			success : function(model) {
				self.render();
				app.navigate('articles', false);
				alert('Article saved successfully');
				window.location.reload(true);// Work around still needs to
				// Investigate.
			},
			error : function() {
				alert('Error while saving');
			}
		});
	}	

});