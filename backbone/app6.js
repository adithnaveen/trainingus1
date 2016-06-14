// this program is to add and remove the items to the collections 

StudentModel = Backbone.Model.extend({
	default:{
		name:"unknown"
	}

});


// we create a collection 
StudentCollection = Backbone.Collection.extend({
	// we can hold the model
	model:StudentModel
});

$(document).ready(function(){
	var jony = new StudentModel({name:"jony", id:100});
	var vicky = new StudentModel({name:"vicky", id:101});

	var class_1 = new StudentCollection([jony, vicky]);
	console.log("size is " + class_1.size());

	displayCollectionContent("two elements", class_1);

	// to add another student 
	var harsha = new StudentModel({name:"harsha", id:103});


// you can all multiple object and remove multiple objects 
// 	class_1.add([harsha, vicky]);
// 	class_1.remove([harsha, vicky]);

	class_1.add([harsha]);
		displayCollectionContent("two elements", class_1);
		//  to remove 
	class_1.remove([vicky]);

		displayCollectionContent("two elements", class_1);
})

function displayCollectionContent(string, collection){
	console.log(string, ", " + JSON.stringify(collection.toJSON()));
}