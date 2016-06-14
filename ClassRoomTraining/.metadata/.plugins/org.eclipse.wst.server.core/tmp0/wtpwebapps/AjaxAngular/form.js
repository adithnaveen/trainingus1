
function UserController($scope, $http)
{
  $scope.user = {};
 
  $scope.createUser = function() 
  {
    $http({
      method: 'POST',
      url: 'UserServlet',
      headers: {'Content-Type': 'application/json'},
      data:  $scope.user
    }).success(function (data) 
      {
    	$scope.status=data;
      });
  };
}
