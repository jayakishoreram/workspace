/**
 * This is control file for AJUserForm.html
 */
var app = angular.module("userForm",[]);
app.controller("userController", function($scope){
	$scope.error = true;
	$scope.isEdit = false;
	$scope.isAdd = false;
	$scope.showUser = false;
	$scope.users = [
	                {id:1, firstName:"John", lastName:"Deo", email:"johndeo@gmail.com"},
	                {id:2, firstName:"Sam", lastName:"Geroge", email:"samgeorge@gmail.com"},
	                {id:3, firstName:"Mathew", lastName:"Bradely", email:"mathewebradely@gmail.com"},
	                {id:4, firstName:"Marc", lastName:"Charls", email:"marccharls@gmail.com"},
	                {id:5, firstName:"Jaya", lastName:"Krishan", email:"jk@gmail.com"},
	                ];
	
	$scope.editUser = function(id){
		//alert("ID: "+id);
		$scope.isEdit = true;
		$scope.isAdd = false;
		$scope.user = (JSON.parse(JSON.stringify($scope.users[id - 1])));
		//$scope.user = $scope.users[id - 1];
		$scope.showUser = true;
	};
	
	$scope.addUser = function(){
		$scope.isAdd = true;
		var usr = {id:$scope.users.length+1, firstName:"", lastName:"", email:""};
		$scope.user = usr;
		$scope.showUser = true;
	};
	
	$scope.cancel = function(){
		var usr = {id:0, firstName:"", lastName:"", email:""};
		$scope.user = usr;
		$scope.showUser = false;
	};
	
	$scope.saveUser = function(){
		if($scope.isAdd){
			$scope.users.push($scope.user);
		}else{
			$scope.users[$scope.user.id - 1] = (JSON.parse(JSON.stringify($scope.user)));
			 //$scope.users[$scope.user.id - 1] = $scope.user;
		}
		var usr = {id:$scope.users.length+1, firstName:"", lastName:"", email:""};
		$scope.user = usr;
		
		$scope.showUser = false;
	};
	
	$scope.$watch('user.firstName',function() {$scope.watch();});
	$scope.$watch('user.lastName',function() {$scope.watch();});
	$scope.$watch('user.email',function() {$scope.watch();});
	
	$scope.watch = function(){
		if($scope.user.firstName == "" || $scope.user.lastName == "" || $scope.user.email == "" || $scope.user.email.$invalid){
			//alert("User first name: "+ $scope.user.firstName);
			$scope.error = true;
		}else{
			$scope.error = false;
		}
		
	};
});