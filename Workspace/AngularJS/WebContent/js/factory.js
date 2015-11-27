var app = angular.module('factoryApp',[]);

app.controller('factoryController', ['$scope', 'loginService', 'userService', function($scope, loginService, userService){
	
	$scope.login = function(){
		loginService.login($scope.userName, $scope.password);
	};
	
	$scope.users = userService.getUsers();
	
}]);

app.factory('loginService', function(){
	
	var loginService = {};
	
	loginService.login = function(userName, password){
		console.log("User Name: "+ userName);
		console.log("Password: "+ password);
	};
	
	return loginService;
});


app.factory('userService', function(){
	
	var userService = {};
	
	var users = 	[{id:1, firstName:"John", lastName:"Deo", email:"johndeo@gmail.com"},
		                {id:2, firstName:"Sam", lastName:"Geroge", email:"samgeorge@gmail.com"},
		                {id:3, firstName:"Mathew", lastName:"Bradely", email:"mathewebradely@gmail.com"},
		                {id:4, firstName:"Marc", lastName:"Charls", email:"marccharls@gmail.com"},
		                {id:5, firstName:"Jaya", lastName:"Krishan", email:"jk@gmail.com"},
		                ];
	
	userService.getUsers = function(){
		return users;
		
	};
	
	
	
	return userService;
});