$(document).ready(function(){
    $.ajax({url:"/tbItem/select.do",type:"post",success:function(result){
            alert("result:"+result)
        }});
});