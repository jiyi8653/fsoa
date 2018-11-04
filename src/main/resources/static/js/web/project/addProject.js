app.controller('addProjectCtrl', function($scope, $http) {

	function init(){
		$scope.proInfo = [];
	}
	layui.use('laydate', function(){
		var laydate = layui.laydate;
		//常规用法
		laydate.render({
			elem: '#starttime'
		});
		var laydate = layui.laydate;
		//常规用法
		laydate.render({
			elem: '#testtime'
		});
		var laydate = layui.laydate;
		//常规用法
		laydate.render({
			elem: '#finishtime'
		});
	}); 

	$scope.addInfo = function(){
		var end = {
			did:""	
		}
		var deve;
		var temp = {
			end:[],
			develper:[]
		}
		$scope.proInfo.push(temp);
	}
	
	
	init();
}); 