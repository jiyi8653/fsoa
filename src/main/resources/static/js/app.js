var app = angular.module('app', []);

var javaURL = "http://localhost:8080/";

function getHttp($http,serviceUrl,requestData,success,error){
    $http({
        url: serviceUrl,
        method: "get",
        data: requestData
    }).then(function successCallback(res) {
        success(res);
    }, function errorCallback(rep) {
        error(rep);
    });
}
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
function postFormHttp($http,serviceUrl,requestData,success,error){
    $http({
        url: serviceUrl,
        method: "post",
        data: $.param(requestData),
        headers : { 'Content-Type': 'application/x-www-form-urlencoded' }
    }).then(function successCallback(res) {
        success(res);
    }, function errorCallback(rep) {
        error(rep);
    });
}