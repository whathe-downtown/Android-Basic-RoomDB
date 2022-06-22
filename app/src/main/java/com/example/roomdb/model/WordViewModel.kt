package com.example.roomdb.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.roomdb.repository.roomdb.WordRepository
import kotlinx.coroutines.launch

class WordViewModel(private val repository: WordRepository): ViewModel() {

    val allWords: LiveData<List<Word>> = repository.allWords.asLiveData()


    fun insert(word: Word) = viewModelScope.launch {
        repository.insert(word)
    }

}

