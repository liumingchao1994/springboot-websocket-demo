// 加载外部js文件
function loadJs(url, success){
var domScript = document.createElement('script');
domScript.src = url;
success = success || function () {
    
};
domScript.onload = domScript.onreadystatechange = function () {
    
}
document.getElementsByTagName('head')[0].appendChild(domScript);

}
function getCallingList(msg) {
    console.log("coming in getCallin--gList.---.." + msg);
    $('#myId').html(msg);
}


//socket = new WebSocket("ws://localhost:9094/starManager/websocket/张三");
var socket;
if (typeof(WebSocket) == "undefined") {
    console.log("您的浏览器不支持WebSocket");
} else {
    console.log("您的浏览器支持WebSocket");

//实现化WebSocket对象，指定要连接的服务器地址与端口  建立连接
    socket = new WebSocket("ws://localhost:8080/websocket");
    //打开事件
    socket.onopen = function () {
        console.log("Socket 已打开");
        //socket.send("这是来自客户端的消息" + location.href + new Date());
    };
    //获得消息事件
    socket.onmessage = function (msg) {
        console.log(msg.data);
        //发现消息进入    调后台获取
        getCallingList(msg.data);
    };
    //关闭事件
    socket.onclose = function () {
        console.log("Socket已关闭");
    };
    //发生了错误事件
    socket.onerror = function () {
        alert("Socket发生了错误");
    }
    $(window).unload(function () {
        socket.close();
    });
}
