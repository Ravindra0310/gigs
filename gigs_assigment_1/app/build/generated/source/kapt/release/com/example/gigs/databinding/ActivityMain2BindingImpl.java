package com.example.gigs.databinding;
import com.example.gigs.R;
import com.example.gigs.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityMain2BindingImpl extends ActivityMain2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textview_update, 4);
        sViewsWithIds.put(R.id.edittext_name, 5);
        sViewsWithIds.put(R.id.edittext_number, 6);
        sViewsWithIds.put(R.id.textInputLayout, 7);
        sViewsWithIds.put(R.id.button_save, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMain2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityMain2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.AutoCompleteTextView) bindings[3]
            , (android.widget.Button) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.autoCompleteTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textNumber.setTag(null);
        this.textname.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.userDataViewModel == variableId) {
            setUserDataViewModel((com.example.gigs.ui.ViewModel.UserDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserDataViewModel(@Nullable com.example.gigs.ui.ViewModel.UserDataViewModel UserDataViewModel) {
        this.mUserDataViewModel = UserDataViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.userDataViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserDataViewModelBook((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeUserDataViewModelPhoneNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeUserDataViewModelName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserDataViewModelBook(androidx.lifecycle.MutableLiveData<java.lang.String> UserDataViewModelBook, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserDataViewModelPhoneNumber(androidx.lifecycle.MutableLiveData<java.lang.String> UserDataViewModelPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserDataViewModelName(androidx.lifecycle.MutableLiveData<java.lang.String> UserDataViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.gigs.ui.ViewModel.UserDataViewModel userDataViewModel = mUserDataViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> userDataViewModelBook = null;
        java.lang.String userDataViewModelNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> userDataViewModelPhoneNumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> userDataViewModelName = null;
        java.lang.String userDataViewModelBookGetValue = null;
        java.lang.String userDataViewModelPhoneNumberGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (userDataViewModel != null) {
                        // read userDataViewModel.book
                        userDataViewModelBook = userDataViewModel.getBook();
                    }
                    updateLiveDataRegistration(0, userDataViewModelBook);


                    if (userDataViewModelBook != null) {
                        // read userDataViewModel.book.getValue()
                        userDataViewModelBookGetValue = userDataViewModelBook.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (userDataViewModel != null) {
                        // read userDataViewModel.phoneNumber
                        userDataViewModelPhoneNumber = userDataViewModel.getPhoneNumber();
                    }
                    updateLiveDataRegistration(1, userDataViewModelPhoneNumber);


                    if (userDataViewModelPhoneNumber != null) {
                        // read userDataViewModel.phoneNumber.getValue()
                        userDataViewModelPhoneNumberGetValue = userDataViewModelPhoneNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (userDataViewModel != null) {
                        // read userDataViewModel.name
                        userDataViewModelName = userDataViewModel.getName();
                    }
                    updateLiveDataRegistration(2, userDataViewModelName);


                    if (userDataViewModelName != null) {
                        // read userDataViewModel.name.getValue()
                        userDataViewModelNameGetValue = userDataViewModelName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.autoCompleteTextView, userDataViewModelBookGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNumber, userDataViewModelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textname, userDataViewModelNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userDataViewModel.book
        flag 1 (0x2L): userDataViewModel.phoneNumber
        flag 2 (0x3L): userDataViewModel.name
        flag 3 (0x4L): userDataViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}