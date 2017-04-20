/*app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});*/

app.controller("usersController", [ '$scope','userservice', function($scope, userservice) {	
	$scope.headingTitle = "User List";
	userservice.getUsers( $scope );		
} ]);

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});
