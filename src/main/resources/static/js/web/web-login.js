app.controller('GlobalCtrl', function($scope, $http) {

    $scope.login=function(){
        var serviceUrl = javaURL+"/ajaxLogin";
        var requestData = {
    		username:$("#username").val(),
			password:$("#password").val()
        }
        console.log("requestData--",requestData);
        postFormHttp($http, serviceUrl, requestData, function (res) {
            if (res.data.code == 0) {
            	location.href="/index.html";
            }else{
                console.log(res);
            }
        }, function (rep) {
        });
        
    };
}); 