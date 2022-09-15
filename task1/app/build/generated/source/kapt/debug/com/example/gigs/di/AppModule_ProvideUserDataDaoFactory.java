package com.example.gigs.di;

import com.example.gigs.data.local.AppDatabase;
import com.example.gigs.data.local.UserDataDao;
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
public final class AppModule_ProvideUserDataDaoFactory implements Factory<UserDataDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideUserDataDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public UserDataDao get() {
    return provideUserDataDao(dbProvider.get());
  }

  public static AppModule_ProvideUserDataDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideUserDataDaoFactory(dbProvider);
  }

  public static UserDataDao provideUserDataDao(AppDatabase db) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideUserDataDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
