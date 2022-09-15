package com.example.gigs.di;

import com.example.gigs.data.local.UserDataDao;
import com.example.gigs.data.repository.UserDataRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideRepositoryFactory implements Factory<UserDataRepository> {
  private final Provider<UserDataDao> localDataSourceProvider;

  public AppModule_ProvideRepositoryFactory(Provider<UserDataDao> localDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public UserDataRepository get() {
    return provideRepository(localDataSourceProvider.get());
  }

  public static AppModule_ProvideRepositoryFactory create(
      Provider<UserDataDao> localDataSourceProvider) {
    return new AppModule_ProvideRepositoryFactory(localDataSourceProvider);
  }

  public static UserDataRepository provideRepository(UserDataDao localDataSource) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRepository(localDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
