package bg.dihanov.navigation

import androidx.navigation.NavController
import bg.dihanov.navigation.NavigationFlow.*

class Navigator {
    lateinit var navController: NavController

    fun navigateToFlow(navigationFlow: NavigationFlow<*>) = when (navigationFlow) {
        is HomeFlow -> navController.navigate(MainNavGraphDirections.actionGlobalHomeFlow(navigationFlow.data ?: 0))
        is DashboardFlow -> navController.navigate(MainNavGraphDirections.actionGlobalDashboardFlow())
    }
}