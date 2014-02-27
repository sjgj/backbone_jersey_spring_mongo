window.Users = Backbone.Model.extend({
	url : "rest/users/list",
	initialize : function() {
		this.users = new UserCollection();
	}

});

window.UserCollection = Backbone.Collection.extend({
	model : Users,
	url : "rest/users/list"
});