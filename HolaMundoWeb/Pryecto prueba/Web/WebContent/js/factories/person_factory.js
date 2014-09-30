app.factory('PersonFactory',  function($scope,$http){

	var factory = {};
 	
 	//var persons ={};

 	var persons = $http.post('/Web/PersonServle').
 		success(function(data, status, headers, config) {
      		$this = data;
    });
    // METHOD GETPRODUCTS
	factory.getPersons = function () {
		return persons;
	};

	return factory;

/*

	app.controller("PostsCtrl", function($scope, $http) {

  $scope.buscarClientes = $http.post('/HolaMundoWeb/Servlet', {hola: "hola"}).
    success(function(data, status, headers, config) {
      $scope.clientes = data;
    }).
    error(function(data, status, headers, config) {
      // log error
    });
	});
			*/	
});