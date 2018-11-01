app.controller('GlobalCtrl', function($scope, $http) {

    $scope.login=function(){
    	var requstData = {
			username:$("#username").val(),
			password:$("#password").val()
    	};
        $http({
            url: javaURL+"/user/ajaxLogin",
            method : "post",
            data : requstData,
        }).then(function successCallback(returnData) {
            if(returnData.data.success == true){
                /*if(returnData.data.message=='reset'){
                    location.href="reset.html";
                }else{
                    location.href="index.html";
                }*/
            }else{
                alert(returnData.data.message);
            }
        }, function errorCallback(response) {

        });
    };
}); 