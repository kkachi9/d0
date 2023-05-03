// Composables
import { createRouter, createWebHistory } from 'vue-router'

import Test from "@/views/Test.vue";
import Login from "@/views/Login.vue";
import SignUp from "@/views/SignUp.vue";
import List from "@/views/List.vue";
import Write from "@/views/Write.vue";

const routes = [
  {
    path: '/',
    component: Login
  },
  {
    path: '/test',
    component: Test
  },
  {
    path: '/list',
    component: List
  },
  {
    path: '/signUp',
    component: SignUp
  },
  {
    path: '/write',
    component: Write
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router
