package database.relationships

import androidx.room.Embedded
import androidx.room.Relation
import database.entities.Category
import database.entities.Exercise

data class CategoryWithExercises(
    @Embedded val category: Category,
    @Relation(
        parentColumn = "id",
        entityColumn = "categoryId"
    )
    val exercises: List<Exercise>
)
