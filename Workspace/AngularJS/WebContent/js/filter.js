angular.module("myApp", []).controller("ctrl", function($scope) {

	$scope.firstName="Jayakishore";
	$scope.lastName="Ramachandrareddygari";
	$scope.quantity=20;
	$scope.cost=100;
	$scope.persons=[{name:"Jaya",age:32},{name:"Rekha",age:30},{name:"Vedu",age:1}];
});