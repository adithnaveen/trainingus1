// creating html elements using backbone js 

TheView = Backbone.View.extend({
	// <span class="prettyCake" id="span1"></span>
	tagName :"span", 
	className:"prettyCake", 
	id:"span1", 

	initialize:function(){

		console.log(this.el);
		console.log(this.$el);

// look at the output in console under elemnts, a new tag called span would have been created.
		$("#unique").append(this.el);
	}
});

$(document).ready(function(){
	var aView  = new TheView();
});