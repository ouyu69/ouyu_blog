<template>
  <div class="page">
    <div class="articles">
      <article v-for="article in articles" :key="article.id" class="article-item">
        <h2>{{ article.title }}</h2>
        <p>{{ article.text }}</p>
        <span>{{ article.datetime }}</span>
      </article>
    </div>
  </div>
</template>

<script setup>
  import axios from 'axios';
  import { reactive, ref,onMounted } from 'vue';
  let articles = ref([]) ;
  const getAllArticle = async () =>{
      try{
        const response = await axios.get('/api/getAllArticle') ;
        if(response.data.code === 200){
          articles.value = response.data.data.map(item => reactive({
            id: item.id,
            title: item.title,
            text: item.text,
            datetime: item.datetime
          }));
        }else{
          console.error(response.data.message);
        }
      }catch(error){
        handleError(error);
      }
    
  }
  const handleError = (error) => {
    console.error("请求错误:", error);
    if (error.response) {
      console.error("错误状态:", error.response.status);
      console.error("错误数据:", error.response.data);
    } else {
      console.error("错误信息:", error.message);
    }
  };
  onMounted(() => {
    getAllArticle();
  });
</script>

<style scoped>
.page {
  position: relative;
  margin-top: 100vh;          
  width: 100%;
  background-color: rgba(255, 255, 255,0.8);;
}

.articles {
  width: 50%;
  margin: 0 auto;
}
.articles article{
  text-align: center;
}

</style>
