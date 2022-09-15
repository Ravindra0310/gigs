package com.example.gigs.ui;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.gigs.data.repository.UserDataRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class UserDataViewModel_AssistedFactory implements ViewModelAssistedFactory<UserDataViewModel> {
  private final Provider<UserDataRepository> repository;

  @Inject
  UserDataViewModel_AssistedFactory(Provider<UserDataRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public UserDataViewModel create(SavedStateHandle arg0) {
    return new UserDataViewModel(repository.get());
  }
}
