package com.example.gigs.ui.ViewModel;

import com.example.gigs.data.repository.UserDataRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserDataViewModel_AssistedFactory_Factory implements Factory<UserDataViewModel_AssistedFactory> {
  private final Provider<UserDataRepository> repositoryProvider;

  public UserDataViewModel_AssistedFactory_Factory(
      Provider<UserDataRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UserDataViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static UserDataViewModel_AssistedFactory_Factory create(
      Provider<UserDataRepository> repositoryProvider) {
    return new UserDataViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static UserDataViewModel_AssistedFactory newInstance(
      Provider<UserDataRepository> repository) {
    return new UserDataViewModel_AssistedFactory(repository);
  }
}
