<template>
  <div v-for="(form, i) in forms"
       :key="i"
       :value="form">

    <v-card
      :title="form['todoTitle']"
      :subtitle="form['todoSubtitle']"
      :text="form['todoContent']"
      variant="outlined"
      class="mt-5"
    >
      <v-card-actions class="justify-end">
        <v-btn>수정</v-btn>
        <v-btn @click="del(form['id'])">삭제</v-btn>
      </v-card-actions>
    </v-card>


  </div>
  <v-col class="text-center">
    <router-link to="/write">
      <v-btn icon="mdi-plus" size="small">
      </v-btn>
    </router-link>
  </v-col>

</template>

<script setup>
import {reactive, ref} from "vue";
import axios from "axios";
import router from "@/router";

const forms = ref([])


axios.get("/api/list").then(({data}) => {

  forms.value = data

})

const del = (id)=> {

  axios.get("/api/delete", {
    params:{
      id : id
    }
  }).then(
    () => {
      router.go(0)
    }
  ).catch(
    () => {
      router.go(0)
    }
  );

}

</script>

<style scoped>

</style>
