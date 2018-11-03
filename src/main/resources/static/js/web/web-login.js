app.controller('GlobalCtrl', function($scope, $http) {

    $scope.login=function(){
        var serviceUrl = javaURL+"/user/ajaxLogin";
        var requestData = {
    		username:$("#username").val(),
			password:$("#password").val()
        }
        console.log("requestData--",requestData);
        postHttp($http, serviceUrl, requestData, function (res) {
            if (res.data.code == 200) {
            	location.href="index.html";
            }else{
                console.log(res);
            }
        }, function (rep) {
        });
    };
}); 