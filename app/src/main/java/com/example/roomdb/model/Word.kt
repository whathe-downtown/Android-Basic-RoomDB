package com.example.roomdb.model


import androidx.room.*

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)
