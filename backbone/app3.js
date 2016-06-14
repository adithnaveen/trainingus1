// view working 
// they organize ur page into logical views where the data is taken from the model 
// model can activate the view, to change the data 

// instead of updating HTML by hand you can have function, to change the contetns 
// of the website, so the website will always be upto date 


TheView = Backbone.View.extend({
	defaults: {
		myval: 'testing'
	}, 
	initialize:function(){
		alert("i'm from view initialize ")
  	    this.options = _.extend(this.defaults, this.options);

		console.log(this.el);
		console.log(this.$el);

		// we can append with $el not with el it will give an error 
		// you are appending the div with id called unique 
		this.$el.append("<h2>hello testing 123</h2>")
	}, 
	render: function(){
		console.log("initialize value -> "+this.options.myval);
	}

});


$(document).ready(function(){
	var aView = new TheView({el:$("#unique")});
	console.log(aView);
	aView.render();
})


// el -> references the dom object 
// $el -> it is a jquery object, that still references the same dom object as el 