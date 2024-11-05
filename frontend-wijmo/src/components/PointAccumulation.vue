<template>
    <div>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <Money offline label="포인트" v-model="value.points" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'PointAccumulation',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "pointAccumulations"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

