/**
 * This is control file for AJUserForm.html
 */
var app = angular.module("productForm",[]);

app.controller("productController", ['$scope','productService', function($scope, productService){
	$scope.isEdit = false;
	$scope.isAdd = false;
	$scope.showProduct = false;
	
	var promise = productService.getProducts();
	promise.then(function (items) {
        $scope.products = items;
    }, function (status) {
        console.log(status);
    });
	
	console.log("$scope.products:  "+$scope.products);
	$scope.editProduct = function(product){
		$scope.isEdit = true;
		$scope.isAdd = false;
		$scope.product = (JSON.parse(JSON.stringify(product)));
		$scope.showProduct = true;
	};
	
	$scope.addProduct = function(){
		$scope.isAdd = true;
		var prod = {"id":null,"name":"Name","description":"Description","rating":5,"price":0.00,"quantity":0};
		$scope.product = prod;
		$scope.showProduct = true;
	};
	
	$scope.deleteProduct = function(id){
		$scope.isAdd = false;
		$scope.isEdit = false;
		$scope.showProduct = false;
		var deletePromise = productService.deleteProduct(id);
		deletePromise.then(function () {
			var promise = productService.getProducts();
			promise.then(function (items) {
		        $scope.products = items;
		    }, function (status) {
		        console.log(status);
		    });
	    }, function (status) {
	        console.log(status);
	    });
		
	};
	
	$scope.cancel = function(){
		var prod = {"id":null,"name":"Name","description":"Description","rating":5,"price":0.00,"quantity":0};
		$scope.product = prod;
		$scope.showProduct = false;
	};
	
	$scope.saveProduct = function(){
		if($scope.isAdd){
		var savePromise = productService.createProduct($scope.product);
		savePromise.then(function () {
			var promise = productService.getProducts();
			promise.then(function (items) {
		        $scope.products = items;
		    }, function (status) {
		        console.log(status);
		    });
	    }, function (status) {
	        console.log(status);
	    });
		}else{
			var savePromise = productService.updateProduct($scope.product);
			savePromise.then(function () {
				var promise = productService.getProducts();
				promise.then(function (items) {
			        $scope.products = items;
			    }, function (status) {
			        console.log(status);
			    });
		    }, function (status) {
		        console.log(status);
		    });
			
		}
		var prod = {"id":null,"name":"Name","description":"Description","rating":5,"price":0.00,"quantity":0};
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

app.factory('productService', ['$http','$q', function($http, $q) {

	var prdService = {};
	prdService.getProducts = function() {
		var deferred = $q.defer();
		$http.get("http://localhost:7001/Store/JerseyRest/Products")
	    .success(function(response) {
	    	deferred.resolve(response.product);
	    	}).error(function(data, status, headers, config) {
                console.log("Failed REST! Status: "+status);
                deferred.reject(status);
            });
		return deferred.promise;
	};
	
	prdService.createProduct = function(product){
		var deferred = $q.defer();
		$http.post("http://localhost:7001/Store/JerseyRest/Products", product)
	    .success(function(response) {
	    	deferred.resolve(response);
	    	}).error(function(data, status, headers, config) {
                console.log("Failed REST! Status: "+status);
                deferred.reject(status);
            });
		return deferred.promise;
	};
	
	prdService.updateProduct = function(product){
		var deferred = $q.defer();
		$http.put("http://localhost:7001/Store/JerseyRest/Products", product)
	    .success(function(response) {
	    	deferred.resolve(response);
	    	}).error(function(data, status, headers, config) {
                deferred.reject(status);
            });
		return deferred.promise;
	};
	
	
	prdService.deleteProduct = function(id){
		var deferred = $q.defer();
		var uri = "http://localhost:7001/Store/JerseyRest/Products/"+id;
		$http.delete(uri)
	    .success(function(response) {
	    	deferred.resolve(response);
	    	}).error(function(data, status, headers, config) {
                console.log("Failed REST! Status: "+status);
                deferred.reject(status);
            });
		return deferred.promise;
	};
	return prdService;
}]);
