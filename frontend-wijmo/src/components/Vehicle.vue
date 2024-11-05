<template>
    <div>
        <Value Object Type offline label="차종" v-model="value.차종" :editMode="editMode" @change="change"/>
        <Value Object Type offline label="연식" v-model="value.연식" :editMode="editMode" @change="change"/>
        <Value Object Type offline label="배기량" v-model="value.배기량" :editMode="editMode" @change="change"/>
        <DetailGrid label="MaintenanceHistories" offline v-model="value.maintenanceHistories" :editMode="editMode" @change="change"/>

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
    name: 'Vehicle',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "vehicles"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

