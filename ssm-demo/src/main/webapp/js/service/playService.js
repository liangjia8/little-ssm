//购物车服务层
app.service('playService', function ($http) {

    this.findItemList = function(){
        return $http.post('tbItem/select.do')
    }

});