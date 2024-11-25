package com.example.littlelemon

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.littlelemon.data.AppDatabase
import com.example.littlelemon.data.MenuItemRoom
import com.example.littlelemon.helper.fetchMenu
import com.example.littlelemon.helper.saveMenuToDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewModel(application: Application) : AndroidViewModel(application) {
    private val database: AppDatabase = Room.databaseBuilder(
        application,
        AppDatabase::class.java,
        "database"
    ).build()

    fun getAllDatabaseMenuItems(): LiveData<List<MenuItemRoom>> {
        return database.menuItemDao().getAll()
    }

    fun fetchMenuDataIfNeeded() {
        viewModelScope.launch(Dispatchers.IO) {
            if (database.menuItemDao().isEmpty()) {
                saveMenuToDatabase(
                    database,
                    fetchMenu("https://raw.githubusercontent.com/Meta-Mobile-Developer-PC/Working-With-Data-API/main/menu.json")
                )
            }
        }
    }
}
