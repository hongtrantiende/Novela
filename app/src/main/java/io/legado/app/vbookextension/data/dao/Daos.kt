package io.legado.app.vbookextension.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.vbookextension.data.entity.RepositoryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExtensionDao {
    @Query("SELECT * FROM extensions WHERE isInstalled = 1 ORDER BY name ASC")
    fun getInstalledExtensions(): Flow<List<ExtensionEntity>>

    @Query("SELECT * FROM extensions WHERE isInstalled = 1 AND isEnabled = 1")
    suspend fun getEnabledExtensions(): List<ExtensionEntity>

    @Query("SELECT * FROM extensions WHERE isInstalled = 1 AND isEnabled = 1")
    fun getEnabledExtensionsSync(): List<ExtensionEntity>

    @Query("SELECT * FROM extensions WHERE id = :id")
    suspend fun getExtensionById(id: String): ExtensionEntity?

    @Query("SELECT * FROM extensions WHERE id = :id")
    fun getExtensionByIdSync(id: String): ExtensionEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(extension: ExtensionEntity)

    @Delete
    suspend fun delete(extension: ExtensionEntity)

    @Query("UPDATE extensions SET isEnabled = :enabled WHERE id = :id")
    suspend fun setEnabled(id: String, enabled: Boolean)

    @Query("UPDATE extensions SET version = :version WHERE id = :id")
    suspend fun updateVersion(id: String, version: Int)
}

@Dao
interface RepositoryDao {
    @Query("SELECT * FROM repositories ORDER BY addedAt ASC")
    fun getRepositories(): Flow<List<RepositoryEntity>>

    @Query("SELECT * FROM repositories WHERE isEnabled = 1")
    suspend fun getEnabledRepositories(): List<RepositoryEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(repository: RepositoryEntity)

    @Delete
    suspend fun delete(repository: RepositoryEntity)
}
