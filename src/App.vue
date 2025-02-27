<script setup>
</script>

<template>
  <div class="app-container">
    <!-- 导航栏 -->
    <nav class="viewport yaa">
      <div class="site-branding">
        <a href="">
          <span style="font-size:25px;font-weight: 600;">OUYU</span>
          <span style="font-size:20px;font-weight: 600;">の</span>
          <span style="font-size:25px;font-weight: 600;">Blog</span>
        </a>
      </div>
      <ul>
        <li><router-link to="/">首页</router-link></li>
        <li><router-link to="/about">关于</router-link></li>
      </ul>
    </nav>
    <div style="width: 100%;">
      <router-view></router-view>
    </div>
  </div>
</template>
<script setup>

</script>
<style scoped>
.app-container {
  display: flex;
  justify-content: center;
  width: 100%;
  min-height: 100vh;
  background-image: url("D://学习//图/back.png");
  background-position: center;
  background-attachment: fixed;
  background-size: cover;
  background-repeat: no-repeat; 
}

.viewport {
  height: 60px;
  position: fixed;
  width: 95%;
  margin: 5px;
  padding: 0 5px;
  background-color: rgba(241, 241, 241, 0.900);
  border-radius: 10px;
}

.viewport ul {
  float: right;
  list-style-type: none;
  display: flex;
  font-size: 16px;

}

.viewport ul li {
  margin: 0 10px

}
.viewport ul li a {
  padding: 0 10px;
  color: #333;
}

.viewport ul li a:hover {
  color: #5175b9;
  border-radius: 10px;
}

.site-branding {
  height: 100%; 
  display: flex;
  float: left;
  padding: 0 10px;
  align-items: center;
}
.site-branding a span{
  margin: 0 5px;
}
.site-branding a {
  color: #5175b9;
}
.site-branding a:hover{
  background-color: #5175b9;
  border-radius: 10px;
  color: #fff;
}
</style>

<style>
/* import "./css/global.scss"; */
@font-face {
  font-family: 'NotoSerifSC';
  src: url("./assets/font/NotoSerifSC-VariableFont_wght.ttf");
}

.yaa {
  font-family: 'NotoSerifSC', serif;
}
a{
  text-decoration: none;
}
</style>