package com.example.gigs.ui;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = UserDataViewModel.class
)
public interface UserDataViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.gigs.ui.UserDataViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(UserDataViewModel_AssistedFactory factory);
}
