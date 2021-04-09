package bg.dihanov.navigation

sealed class NavigationFlow<T>(
    val data: T? = null
) {
    class HomeFlow(value: Int) : NavigationFlow<Int>(data = value)
    class DashboardFlow : NavigationFlow<Any>(data = null)
}