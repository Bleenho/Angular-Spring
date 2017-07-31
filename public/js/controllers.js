angular.module('app.controllers', [])

.controller('insertUserController', function($scope,$rootScope, $http){
	
	console.log("Inserir");
	$scope.nome = "";
	$scope.msg = "";
	$scope.addName = function(){
		var body = $scope.nome;
		var url = '/Api/names';    

		console.log("salvando");
		$http.post(url, body ).then(function(result) {

          if (result.data.status) {
          	console.log("salvo");
			$scope.msg = "nome add com sucesso";
			$scope.nome = "";
          } else {
            $scope.msg = "erro ao add nome";
          }
        });
	}
	
})
.controller('listUserController', function($scope, $http, $rootScope){
	
	$scope.usuarios = [{
		nome : ''
	}];
	
	 $http({
         method: 'GET',
         url: '/Api/names'
       }).then(function(retorno){
	 	  console.log( retorno);
	 	  $scope.usuarios = retorno.data;
	   },function(error){
         console.log("erro ao buscar lista de nomes [err]: "+error);
       })
	
});

//Para nao precisar ficar importando todos os controllers este encapsulo o controller usuarios e outros caso precise ser criado