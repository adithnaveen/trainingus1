// this is to modify models within the collections 
// take the code from app6.js 
StudentModel = Backbone.Model.extend({
	default:{
		name:"unknown"
	}
});	

// we create a collection 
StudentCollection = Backbone.Collection.extend({
	// we can hold the model
	model:StudentModel, 
	// you can also have, hide this as of now... 
	initialize:function(){
		this.bindEvents();
	}, 
	bindEvents: function(){
		this.on("change:name", function(model){
			alert("hey Name changed :  " + model.get("name"));
		});

		this.on("add", function(model){
			alert("Added Name :  " + model.get("name"));
		});

		this.on("remove", function(model){
			alert("Removed Name : " + model.get("name"));
		});
	}
});

$(document).ready(function(){
	var jony = new StudentModel({name:"jony", id:100});
	var vicky = new StudentModel({name:"vicky", id:101});

	var emp_group = new StudentCollection([ vicky]);
/*
	displayCollectionContent("before", emp_group);
	var emp = emp_group.get(100);

	emp.set({name:"JOHNY"});
	displayCollectionContent("after", emp_group);
	vicky.set({name:"VIKRAM"});
	displayCollectionContent("after", emp_group);
*/

	emp_group.add([jony]);
	emp_group.remove([vicky]);
	jony.set({name:"New Name"});
	displayCollectionContent("after", emp_group);

})

function displayCollectionContent(string, collection){
	console.log(string, ", " + JSON.stringify(collection.toJSON()));
}