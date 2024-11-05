
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import VihiclemanagementVehicleManager from "./components/listers/VihiclemanagementVehicleCards"
import VihiclemanagementVehicleDetail from "./components/listers/VihiclemanagementVehicleDetail"

import UsermgmtUserManager from "./components/listers/UsermgmtUserCards"
import UsermgmtUserDetail from "./components/listers/UsermgmtUserDetail"

import PointPointAccumulationManager from "./components/listers/PointPointAccumulationCards"
import PointPointAccumulationDetail from "./components/listers/PointPointAccumulationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/vihiclemanagements/vehicles',
                name: 'VihiclemanagementVehicleManager',
                component: VihiclemanagementVehicleManager
            },
            {
                path: '/vihiclemanagements/vehicles/:id',
                name: 'VihiclemanagementVehicleDetail',
                component: VihiclemanagementVehicleDetail
            },

            {
                path: '/usermgmts/users',
                name: 'UsermgmtUserManager',
                component: UsermgmtUserManager
            },
            {
                path: '/usermgmts/users/:id',
                name: 'UsermgmtUserDetail',
                component: UsermgmtUserDetail
            },

            {
                path: '/points/pointAccumulations',
                name: 'PointPointAccumulationManager',
                component: PointPointAccumulationManager
            },
            {
                path: '/points/pointAccumulations/:id',
                name: 'PointPointAccumulationDetail',
                component: PointPointAccumulationDetail
            },



    ]
})
