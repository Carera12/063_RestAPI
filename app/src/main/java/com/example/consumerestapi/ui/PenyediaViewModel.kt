package com.example.consumerestapi.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.consumerestapi.KontakAplikation
import com.example.consumerestapi.ui.home.viewmode.HomeViewModel
import com.example.consumerestapi.ui.kontak.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiMars().container.kontakRepository)
        }

        initializer {
            InsertViewModel(aplikasiMars().container.kontakRepository)
        }
    }
}

 fun CreationExtras.aplikasiMars(): KontakAplikation =
     (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplikation)