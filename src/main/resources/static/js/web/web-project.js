app.controller('projectCtrl', function($scope, $http) {
	function init(){
		$scope.pro = {};
		$scope.search();
		
	}
    $scope.search=function(){
        var serviceUrl = javaURL+"/backend/project/list";
        var requestData = $scope.pro;
        
        console.log("requestData--",requestData);
        postFormHttp($http, serviceUrl, requestData, function (res) {
        	$scope.projects = res.rows;
            console.log("response:",res);
        }, function (rep) {
        });
    };
    
    $scope.addProject = function(){
    	layer.open({
    		type : 2,
    		title : '增加',
    		maxmin : true,
    		shadeClose : false, // 点击遮罩关闭层
    		area : [ '80%', '90%' ],
    		content : javaURL + '/backend/project/add' // iframe的url
    	});
    }
    
    init();
}); 