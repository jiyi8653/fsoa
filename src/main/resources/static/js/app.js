var app = angular.module('app', []);

var javaURL = "http://localhost:8080/";

function postHttp($http,serviceUrl,requestData,success,error){
    $http({
        url: serviceUrl,
        method: "post",
        data: angular.toJson(requestData)
    }).then(function successCallback(res) {
        success(res);
    }, function errorCallback(rep) {
        error(rep);
    });
}