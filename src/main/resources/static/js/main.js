function callendarController($scope, $http) {
    var url = "/";
    
       $http.get(url).success( function(response) {
          $scope.students = response; 
       });
}