import { createRouter,createWebHistory } from 'vue-router'
import homePage from '../views/home/homePage.vue'
import aboutPage from '../views/home/aboutPage.vue'

const routes = [
    {
        path: '/',
        redirect:'/home'
    },
    {
        path: '/home',
        component:homePage
    },
    {
        path: '/about',
        component:aboutPage
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router;

