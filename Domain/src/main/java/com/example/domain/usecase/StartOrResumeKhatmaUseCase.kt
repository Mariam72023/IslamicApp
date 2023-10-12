package com.example.domain.usecase

import com.example.domain.repository.QuraanRepository

class StartOrResumeKhatmaUseCase(val repository: QuraanRepository){
suspend  operator fun invoke(pageNumber:String)=repository.getQuraanPage(pageNumber)}