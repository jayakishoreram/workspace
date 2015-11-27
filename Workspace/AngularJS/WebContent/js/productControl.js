/**
 * This is control file for AJUserForm.html
 */
var app = angular.module("productForm",[]);

app.config(['$httpProvider', function($httpProvider) {
	
	$httpProvider.defaults.useXDomain = true;
	$httpProvider.defaults.withCredentials = true;
	delete $httpProvider.defaults.headers.common["X-Requested-With"];
	$httpProvider.defaults.headers.common["Accept"] = "application/json";
	$httpProvider.defaults.headers.common["Content-Type"] = "application/json";
	$httpProvider.defaults.headers.common['Access-Control-Allow-Origin'] = '*';
	}
]);

app.controller("productController", ['$scope','productService', function($scope, productService){
	//$scope.error = true;
	$scope.isEdit = false;
	$scope.isAdd = false;
	$scope.showProduct = false;
	
	$scope.products = productService.getProducts();
	
	$scope.editProduct = function(id){
		//alert("ID: "+id);
		$scope.isEdit = true;
		$scope.isAdd = false;
		$scope.product = (JSON.parse(JSON.stringify($scope.products[id - 1])));
		//$scope.user = $scope.users[id - 1];
		$scope.showProduct = true;
	};
	
	$scope.addProduct = function(){
		$scope.isAdd = true;
		//var usr = {id:$scope.users.length+1, firstName:"", lastName:"", email:""};
		var prod = {"id":0,"name":"Name","description":"Description","rating":5,"price":0.00,"quantity":0};
		$scope.product = prod;
		$scope.showProduct = true;
	};
	
	$scope.cancel = function(){
		var prod = {"id":0,"name":"Name","description":"Description","rating":5,"price":0.00,"quantity":0};
		$scope.product = prod;
		$scope.showProduct = false;
	};
	
	$scope.saveProduct = function(){
		if($scope.isAdd){
			//$scope.users.push($scope.user);
			productService.createProduct($scope.product);
		}else{
			//$scope.users[$scope.user.id - 1] = (JSON.parse(JSON.stringify($scope.user)));
			 //$scope.users[$scope.user.id - 1] = $scope.user;
			productService.updateProduct($scope.product);
		}
		var prod = {"id":0,"name":"Name","description":"Description","rating":5,"price":0.00,"quantity":0};
		$scope.product = prod;
		$scope.showProduct = false;
	};
	
/*	$scope.$watch('user.firstName',function() {$scope.watch();});
	$scope.$watch('user.lastName',function() {$scope.watch();});
	$scope.$watch('user.email',function() {$scope.watch();});
	
	$scope.watch = function(){
		if($scope.user.firstName == "" || $scope.user.lastName == "" || $scope.user.email == "" || $scope.user.email.$invalid){
			//alert("User first name: "+ $scope.user.firstName);
			$scope.error = true;
		}else{
			$scope.error = false;
		}
		
	};*/
}]);

app.factory('productService', ['$http', function($http) {

	var productService = {};

	productService.getProducts = function() {
		
		var products;
		$http.get("http://localhost:7001/Store/JerseyRest/Products")
	    .success(function(response) {
	    	console.log("Success REST");
	    	products = response.product;
	    	}).error(function(data, status, headers, config) {
                console.log("Failed REST! Status: "+status);
            });
		
		return products;
	};
	
	productService.createProduct = function(product){
		alert("Save Product Called!!");
		products.push(product);
	};
	
	productService.updateProduct = function(product){
		products[product.id - 1] = (JSON.parse(JSON.stringify(product)));
	};
	return productService;
}]);
