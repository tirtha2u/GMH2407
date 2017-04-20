app.factory( 'userservice', [ '$resource', function( $resource ){
	return new User( $resource );
}] );

function User( resource ) {
	
	this.resource = resource; 

	this.getUsers = function( scope ) {
		
		var Users = resource('/heros');
		Users.query(function(users){
			scope.users = users;
			console.log(scope.users);
		});
	}
}