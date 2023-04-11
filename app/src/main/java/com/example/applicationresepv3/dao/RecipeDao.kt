package com.example.applicationresepv3.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.applicationresepv3.entities.Recipies

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val allRecipes: List<Recipies>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies: Recipies)
}