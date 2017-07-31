angular.module('app.controllers', [])

//Constrola a inserção dos usuarios na lista nomes.txt feitas na pagina insertUsers.html
.controller('insertUserController', function($scope,$rootScope, $http,SETTINGS_SYSTEM){
	
	$scope.nome = "";
	$scope.msg = "";
	$scope.addName = function(){
		var body = $scope.nome;
		

		//console.log("salvando");
		$http.post(apiNames, body ).then(function(result) {

          if (result.data.status) {
          	console.log("salvo");
			$scope.msg = "Nome inserido na lista com sucesso!";
			$scope.nome = "";
          } else {
            $scope.msg = "Ops!";
          }
        });
	}
	
}) 

//Constrola a lista de usuarios mostrado na pagina listUsers.html
.controller('listUserController', function($scope, $http, $rootScope,SETTINGS_SYSTEM){
	
	$scope.usuarios = [{
		nome : ''
	}];
	
	 $http({
         method: 'GET',
         url: apiNames
       }).then(function(retorno){
	 	  console.log( retorno);
	 	  $scope.usuarios = retorno.data;
	   },function(error){
         console.log("erro ao buscar lista de nomes [err]: "+error);
       })
	
});