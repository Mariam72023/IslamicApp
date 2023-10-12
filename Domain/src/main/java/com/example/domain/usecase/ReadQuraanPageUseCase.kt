package com.example.domain.usecase

import com.example.domain.repository.QuraanRepository
import javax.management.loading.ClassLoaderRepository

class ReadQuraanPageUseCase(val repository: QuraanRepository) {
   suspend operator fun invoke(pageNumber:Int)=repository.getQuraanPage(pageNumber)
}