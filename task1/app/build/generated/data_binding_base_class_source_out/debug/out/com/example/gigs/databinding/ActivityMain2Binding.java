// Generated by data binding compiler. Do not edit!
package com.example.gigs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.gigs.R;
import com.example.gigs.ui.UserDataViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMain2Binding extends ViewDataBinding {
  @NonNull
  public final AutoCompleteTextView autoCompleteTextView;

  @NonNull
  public final Button buttonSave;

  @NonNull
  public final TextInputLayout edittextName;

  @NonNull
  public final TextInputLayout edittextNumber;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputEditText textNumber;

  @NonNull
  public final TextInputEditText textname;

  @NonNull
  public final TextView textviewUpdate;

  @Bindable
  protected UserDataViewModel mViewModel;

  protected ActivityMain2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      AutoCompleteTextView autoCompleteTextView, Button buttonSave, TextInputLayout edittextName,
      TextInputLayout edittextNumber, TextInputLayout textInputLayout, TextInputEditText textNumber,
      TextInputEditText textname, TextView textviewUpdate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.autoCompleteTextView = autoCompleteTextView;
    this.buttonSave = buttonSave;
    this.edittextName = edittextName;
    this.edittextNumber = edittextNumber;
    this.textInputLayout = textInputLayout;
    this.textNumber = textNumber;
    this.textname = textname;
    this.textviewUpdate = textviewUpdate;
  }

  public abstract void setViewModel(@Nullable UserDataViewModel viewModel);

  @Nullable
  public UserDataViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMain2Binding>inflateInternal(inflater, R.layout.activity_main2, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMain2Binding>inflateInternal(inflater, R.layout.activity_main2, null, false, component);
  }

  public static ActivityMain2Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMain2Binding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMain2Binding)bind(component, view, R.layout.activity_main2);
  }
}
