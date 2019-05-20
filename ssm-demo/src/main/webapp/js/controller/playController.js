//购物车控制层
app.controller('playController',function($scope,playService){

	$scope.findItemList = function() {
		playService.findItemList().success(
			function (response) {
				$scope.itemList = response;
				//alert("itemList："+$scope.itemList);
			}
		)
	}

});