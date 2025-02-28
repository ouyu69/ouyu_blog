<template>
  <div class="app-container">
    <!-- 导航栏 -->
    <nav class="viewport">
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
        <li class="site-user">
          <div @mouseenter="site_user_menu_over()" @mouseleave="site_user_menu_leave()">
            <img src="https://weavatar.com/avatar/953ac6e231c8e1bc421592c137cfc3a6?s=96&d=mm&r=g" width="30" height="30" alt="header_user_avatar" >
            <transition name="slide">
              <div class="site-user-menu" v-show="isMenuVisible" >
                <div class="site-user-name">ouyu</div>
                <div class="user-menu-option">
                  <a href="">管理后台</a>
                  <a href="">撰写文章</a>
                  <a href="">个人资料</a>
                  <a href="" target="_top" data-no-pjax="">退出登录</a>
                </div>
              </div>
            </transition>
          </div>
          
          
        </li>
      </ul>
    </nav>
    <div style="width: 100%;">
      <router-view></router-view>
    </div>
    <footer class="site-footer" role="contentinfo">
      <div class="site-info">
        <p style="color: #666666;">Copyright © by OUYU All Rights Reserved | <a href="https://wap.miit.gov.cn/">豫ICP备2024080810号-1</a></p>
      </div>
    </footer>
  </div>
</template>
<script setup>
import { ref } from 'vue';

  let isMenuVisible = ref(false) ;
  const site_user_menu_over = () =>{
    isMenuVisible.value = true;
  }
  const site_user_menu_leave = () =>{
    setTimeout(() => {
      isMenuVisible.value = false;
    }, 2000); // 300ms 延迟
  }
</script>
<style scoped>
.app-container {
  font-family: 'NotoSerifSC', serif;
  display: flex;
  flex-direction:column;
  align-items: center;
  width: 100%;
  min-height: 100vh;
  background-image: url("D://学习//图/back.png");
  background-position: center;
  background-attachment: fixed;
  background-size: cover;
  background-repeat: no-repeat; 
  margin: 0 auto;
}

.viewport {
  top: 0;
  height: 60px;
  position: fixed;
  width: 95%;
  margin: 5px auto;
  padding: 0 5px;
  background-color: rgba(255, 255, 255,0.8);
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
.site-footer{
  width: 100%;
  padding: 45px;
  background-color: rgba(255, 255, 255,0.8);
}
.site-info{
  text-align: center;
}
.site-info a{
  color: #333;
  text-align: center;
}
.site-info a:hover{ 
  color: #5175b9;
}
.site-user img{
  border-radius: 100%;
  cursor: pointer;  
}
.site-user-menu{
  position: absolute;
  width: 110px;
  right: -20px;
  background: 0 0;
  top: 60px;
  pad: 10px 0 ;
  background-color: #fff;
  box-shadow: 0 1px 40px -8px rgba(0, 0, 0, .2);
  border-radius: 15px;
  text-align: center;
}
.site-user-menu a{
  display: block;
  padding: 5px 10px;
  margin: 5px 0;
  width: 110px;
  text-align: center;
  color: var(--theme-skin, #505050);
  font-size: 13px;
  font-weight: var(--global-font-weight);
}
.site-user-name{
  display: block;
  padding: 5px 10px;
  margin: 5px 0;
  width: 110px;
  text-align: center;
  color: var(--theme-skin, #505050);
  
}
.slide-enter-active, .slide-leave-active {
  transition: transform 0.5s, opacity 0.5s;
}
.slide-leave-to {
  transform: translateY(-20px);
  opacity: 1; /* 完全可见 */
}
.slide-enter-to{
  /* transform: translateY(20px); */
  opacity: 0; /* 完全透明 */
}
</style>

<style>
/* import "./css/global.scss"; */
@font-face {
  font-family: 'NotoSerifSC';
  src: url("./assets/font/NotoSerifSC-VariableFont_wght.ttf");
}
a{
  text-decoration: none;
}
</style>