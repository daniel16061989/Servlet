app.controller('PersonController', function($scope, PersonFactory){

	$scope.persons = PersonFactory.getPersons();


});