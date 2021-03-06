//购物车服务层
app.service('cartService', function ($http) {
    //购物车列表
    this.findCartList = function () {
        return $http.get('/tbItem/select');
    }

    //求合计数
    this.sum = function (cartList) {
        var totalValue = {totalNum: 0, totalMoney: 0};

        for (var i = 0, len = cartList.length; i < len; i++) {
            var cart = cartList[i];//购物车对象
            for (var j = 0; j < cart.orderItemList.length; j++) {
                var orderItem = cart.orderItemList[j];//购物车明细
                totalValue.totalNum += orderItem.num;//累加数量
                totalValue.totalMoney += orderItem.totalFee;//累加金额
            }
        }
        return totalValue;

    }

});