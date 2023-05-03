<template>

  <v-container class="d-flex justify-center">
    <v-row class="justify-center">
      <v-col
        cols="7"
        md="4"
      >

        <v-text-field
          v-model="form.id"
          :counter="10"
          label="ID"
          required
        ></v-text-field>
      </v-col>

      <v-col
        cols="7"
        md="4"
      >
        <v-text-field
          v-model="form.pw"
          :counter="10"
          label="PW"
          required
        ></v-text-field>
      </v-col>


    </v-row>
  </v-container>

  <div class="text-center">
    <v-btn class="mr-3" @click="submit">로그인</v-btn>
    <router-link to="/signUp">
    <v-btn>회원가입</v-btn>
    </router-link>
  </div>


</template>

<script setup>

import {reactive, ref} from "vue";
import axios from "axios";
import router from "@/router";

const form = reactive({
  id : "",
  pw : ""
})

const submit = () => {

  axios.post("/api/login", form).then(
    () => {
      router.push("/list")
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
