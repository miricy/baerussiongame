<%@ page language="java" import="java.util.*,java.net.URL" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<html><!-- manifest="app.manifest">-->
<head>
  <title>HTML5俄罗斯方块在线游戏</title>
  <meta name="description" content="A free puzzle game for mobile devices.">
  <meta name="keywords" content="game, games, puzzle, falling blocks, high score, iphone, android">
  <meta http-equiv="X-UA-Compatible" content="chrome=1">
  <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=no;">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">

  <link rel="stylesheet" href="static/style.css" type="text/css">
  <link rel="apple-touch-icon-precomposed" href="static/icon.png">
  <link rel="apple-touch-startup-image" href="static/splash.png">
</head>
<body>
  <!--[if IE]>
    <script src="http://ajax.googleapis.com/ajax/libs/chrome-frame/1/CFInstall.min.js"></script>
    <script>CFInstall.check()</script>
  <![endif]-->
  <div id="hydra-stage"></div>
  <div id="hydra-fps"></div>
  <script src="static/launcher.js"></script>

  <noscript>Turn on Javascript to play!</noscript>

  <!--[if IE]>
    <script src="http://ajax.googleapis.com/ajax/libs/chrome-frame/1/CFInstall.min.js"></script>
    <script>CFInstall.check()</script>
  <![endif]-->
  <div id="Div1"></div>
  <div id="Div2"></div>
  <script src="static/launcher.js"></script>

  <noscript>Turn on Javascript to play!</noscript>
</body>
</html>
