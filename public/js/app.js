var app = angular.module('myApp', [
  'ngRoute',
  'app.controllers'
]);
app.config(function($routeProvider, $locationProvider) {
    $locationProvider.hashPrefix('');
    $routeProvider
    .when("/add", {
        templateUrl : "./views/inserirUser.html",
        controller: 'insertUserController'
    })
    .when("/lista", {
        templateUrl : "./views/listUsers.html",
        controller: 'listUserController'
    })
	 .when("/", {
        templateUrl : "./views/listUsers.html",
        controller: 'listUserController'
    })
    .otherwise({redirectTo :'/'});
});

app.run(['$rootScope',function($rootScope){
   // $rootScope.path = "C://Users//usuario//Desktop//nomes.txt";
}]);