<template>
  <v-app>

    <TopBar/>

    <v-main>
      <router-view />
    </v-main>


    <Footer/>


  </v-app>


</template>

<script lang="ts" setup>
//
import TopBar from "@/components/TopBar.vue";
import Footer from "@/components/Footer.vue";
</script>
