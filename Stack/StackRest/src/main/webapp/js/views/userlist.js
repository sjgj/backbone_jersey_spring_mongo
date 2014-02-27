window.UsersListView = Backbone.View.extend({

	tagName : 'ul',

	className : 'nav nav-list',

	initialize : function() {
		this.render();
	},

	render : function() {
		var users = this.model.models;
		// console.log(users[0].id);
		if (users.length > 0) {
			$(this.el).html('<ul class="thumbnails"></ul>');
			for ( var i = 0; i < users.length; i++) {
				$('.thumbnails', this.el).append(new UsersView({
					model : users[i]
				}).render().el);
			}
			return this;
		}
	}
});

window.UsersView = Backbone.View.extend({

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
