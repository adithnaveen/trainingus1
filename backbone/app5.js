// introduction to template 

TheView = Backbone.View.extend({
	initialize: function(){
		this.render();
	}, 
	render: function(){
		// {} to pass optional parameters 
		var template = _.template($("#ourTemplate").html(), {});
		// append it with el tag 
		this.$el.html(template);
	}, 


	/// this should be second program after other are done 
	// events is the implicit tag available 
	// to show something like click, mouseover 

	events :{
		"click":"clicked",
		// to mouse over on hello span, which has the class hello 
		"mouseover .hello":"mouseover"
	}, 
	clicked:function(){
		alert("You clicked it....");
	},
	mouseover:function(){
		alert("You mouse overed... ");
	}
});

$(document).ready(function(){
	var aView = new TheView({el: $("#unique")})
});
