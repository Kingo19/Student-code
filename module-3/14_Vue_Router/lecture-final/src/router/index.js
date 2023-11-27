import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';
import AboutView from '../views/AboutView.vue';
import ProductsView from '../views/ProductsView.vue';
import ProductDetailView from '../views/ProductDetailView.vue';
import AddReviewView from '../views/AddReviewView.vue';

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    component: AboutView
  },
  {
    path: '/products',
    name: 'products',
    component: ProductsView
  },  
  {
    path: '/products/:id',
    name: 'product-detail',
    component: ProductDetailView
  },
  {
    path: '/product/:id/add-review',
    name: 'add-review',
    component: AddReviewView
  },      

];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
