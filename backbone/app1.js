// we can set the attributes

WebsiteModel = Backbone.Model.extend({

	defaults:{
		name:"unknown webstite", 
		comments:"some comments"

	},


	// these are default tags 
	// this is how backbone js is built 
	initialize:function(){
		alert("Hello MOMMY... ");
		// we can get and set the attributes 
	}

});

$(document).ready(function(){
	//  we are initialize the object 
	 var page_1 = new WebsiteModel({name:"This is my first website", comments:"this is for testing"});

	//  one  more way to set attribute is 
	// do this first and goto defaults 
	 // page_1.set({name:"This is cool website"});
	 // page_1.set({comments:"this page is for large site"});
	// var page_1 = new WebsiteModel();
	 alert("Page 1 Name is " + page_1.get("name") +", " + page_1.get("comments"));
});