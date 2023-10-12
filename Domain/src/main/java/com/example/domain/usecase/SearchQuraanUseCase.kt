package com.example.domain.usecase

import com.example.domain.repository.QuraanRepository

class SearchInQuraanUseCase(private val repository:QuraanRepository){
    suspend  operator fun invoke(searchKey:String)=repository.searchQuraan(searchKey)

}