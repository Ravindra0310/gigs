package com.example.gigs.data.repository;

import com.example.gigs.data.local.UserDataDao;
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
public final class UserDataRepository_Factory implements Factory<UserDataRepository> {
  private final Provider<UserDataDao> localDataSourceProvider;

  public UserDataRepository_Factory(Provider<UserDataDao> localDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public UserDataRepository get() {
    return newInstance(localDataSourceProvider.get());
  }

  public static UserDataRepository_Factory create(Provider<UserDataDao> localDataSourceProvider) {
    return new UserDataRepository_Factory(localDataSourceProvider);
  }

  public static UserDataRepository newInstance(UserDataDao localDataSource) {
    return new UserDataRepository(localDataSource);
  }
}
