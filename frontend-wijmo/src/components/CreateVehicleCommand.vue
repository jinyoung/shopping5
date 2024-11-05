<template>

    <v-card outlined>
        <v-card-title>
            CreateVehicle
        </v-card-title>

        <v-card-text>
            <String label="차량번호" v-model="value.차량번호" :editMode="editMode"/>
            <String label="차종" v-model="value.차종" :editMode="editMode"/>
            <String label="연식" v-model="value.연식" :editMode="editMode"/>
            <String label="배기량" v-model="value.배기량" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createVehicle"
            >
                CreateVehicle
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateVehicleCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.차량번호 = '';
            this.value.차종 = '';
            this.value.연식 = '';
            this.value.배기량 = '';
        },
        watch: {
        },
        methods: {
            createVehicle() {
                this.$emit('createVehicle', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

