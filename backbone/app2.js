// attribute change events 

AccountModel = Backbone.Model.extend({
	defaults:{
		account: "Savings"
	}, 
	initialize: function(){
		this.bindEvents();
	},

	// this function can be anything of ur choice 
	bindEvents: function(){
		// model refers to this, and this is whole thing 
		this.on("change:account", function(model){
			var new_account = model.get("account");
			alert("hey! the account change to :  " + new_account);
		});
	}
});

$(document).ready(function(){
	var my_account =  new AccountModel();

	// by default it will show savings 
	console.log(my_account.get("account"));

	// when ever u call set on the account it invokes change event 
	my_account.set({account:"Current Account"});
	my_account.set({account:"Demat Account"});
});



