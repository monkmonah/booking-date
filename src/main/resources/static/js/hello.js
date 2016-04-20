angular.module('hello', ['calendarDemoApp'])
  .controller('home', function($scope) {
    $scope.greeting = {id: 'xxx', content: 'Hello World!'}
})