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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.gigs.ui.UserDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.gigs.ui.UserDataViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelBook((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelPhoneNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelBook(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelBook, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoneNumber(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelName, int fieldId) {
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
        java.lang.String viewModelBookGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelBook = null;
        java.lang.String viewModelPhoneNumberGetValue = null;
        java.lang.String viewModelNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelName = null;
        com.example.gigs.ui.UserDataViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.book
                        viewModelBook = viewModel.getBook();
                    }
                    updateLiveDataRegistration(0, viewModelBook);


                    if (viewModelBook != null) {
                        // read viewModel.book.getValue()
                        viewModelBookGetValue = viewModelBook.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phoneNumber
                        viewModelPhoneNumber = viewModel.getPhoneNumber();
                    }
                    updateLiveDataRegistration(1, viewModelPhoneNumber);


                    if (viewModelPhoneNumber != null) {
                        // read viewModel.phoneNumber.getValue()
                        viewModelPhoneNumberGetValue = viewModelPhoneNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.name
                        viewModelName = viewModel.getName();
                    }
                    updateLiveDataRegistration(2, viewModelName);


                    if (viewModelName != null) {
                        // read viewModel.name.getValue()
                        viewModelNameGetValue = viewModelName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.autoCompleteTextView, viewModelBookGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNumber, viewModelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textname, viewModelNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.book
        flag 1 (0x2L): viewModel.phoneNumber
        flag 2 (0x3L): viewModel.name
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}