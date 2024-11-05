
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import VehicleManager from "./components/ui/VehicleGrid"

import UserManager from "./components/ui/UserGrid"

import PointAccumulationManager from "./components/ui/PointAccumulationGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/vehicles',
                name: 'VehicleManager',
                component: VehicleManager
            },

            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },

            {
                path: '/pointAccumulations',
                name: 'PointAccumulationManager',
                component: PointAccumulationManager
            },



    ]
})
