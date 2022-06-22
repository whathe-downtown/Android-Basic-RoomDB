package com.example.roomdb.Dao

import androidx.room.*
import com.example.roomdb.model.Word
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    //트워크 요청이나 데이터베이스 호출, 기타 비동기 코드 등의 비동기 작업에서 값을 생성할 수 있는 값을
    // 한 번에 모두가 아니라 한 번에 하나씩 생성합니다
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): Flow<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}