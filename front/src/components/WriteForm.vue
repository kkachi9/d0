<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        md="4"
      >
        <v-text-field
          v-model="form.title"
          :counter="10"
          label="Title"
          required
        ></v-text-field>
      </v-col>

      <v-col
        cols="12"
        md="4"
      >
        <v-text-field
          v-model="form.subTitle"
          :counter="10"
          label="SubTitle"
          required
        ></v-text-field>
      </v-col>

      <v-col
        cols="12"
        md="4"
      >
        <v-text-field
          v-model="form.content"
          :counter="10"
          label="Content"
          required
        ></v-text-field>
      </v-col>

    </v-row>
  </v-container>

  <v-btn class="ml-10" @click="submit">등록</v-btn>

</template>

<script setup>
import {reactive} from "vue";
import axios from "axios";
import router from "@/router";

const form = reactive({
  title : "",
  subTitle : "",
  content : ""
})

const submit = () => {
  console.log("d")
  axios.post("/api/write", form).then(
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
