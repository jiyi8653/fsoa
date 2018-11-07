app.controller('addProjectCtrl', function($scope, $http) {
    var form = layui.form;
	//重新渲染表单
	function renderForm(){
		form.render();
	}
	//渲染日历控件
	function renderDate(){
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
	}
	//添加
	$scope.addInfo = function(){
		var temp = {
				did:"",
				uid:""
		}
		$scope.proInfo.proUserItem.push(temp);
		renderForm();
	}

	//删除
	$scope.removeInfo = function(index){
		$scope.proInfo.proUserItem.splice(index,1);
		renderForm();
	}

	//所有端
	function allItems(){
		var serviceUrl = javaURL+"/backend/item/list";
		var requestData = {};

		console.log("requestData--",requestData);
		postFormHttp($http, serviceUrl, requestData, function (res) {
			$scope.items = res.data;
		}, function (rep) {
		});
	}
	//所有开发人员
	function allDevelops(){
		var serviceUrl = javaURL+"/list";
		var requestData = {
				type:1	
		};

		console.log("requestData--",requestData);
		postFormHttp($http, serviceUrl, requestData, function (res) {
			$scope.develops = res.data;
		}, function (rep) {
		});
	}
	//提交
	$scope.submitProject = function(){
		console.log("$scope.proInfo---",$scope.proInfo);
	}
	
	form.on('select(business)', function(data){

	    console.log(data)

	})
	$scope.changeDevice = function(item,did){
		console.log("item--",item);
		console.log("did--",did);
	}
	function init(){
		$scope.proInfo = {
			proUserItem:[],
			project:{}
		};
		renderDate();
		
		allItems();
		allDevelops();
	}

	init();


}); 