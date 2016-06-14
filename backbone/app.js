// backbone has oops structure 
// every variable is an object 

WebsiteModel = Backbone.Model.extend({
	// these are default tags 
	// this is how backbone js is built 
	initialize:function(){
		alert("Hello MOMMY... ");
		// we can get and set the attributes 
	}

});



$(document).ready(function(){
	console.log("hello doggy ...");
	// we are initialize the object 
	var page_1 = new WebsiteModel();
});