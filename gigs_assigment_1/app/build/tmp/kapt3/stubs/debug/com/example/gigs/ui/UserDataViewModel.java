package com.example.gigs.ui;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.gigs.data.entities.UserData;
import com.example.gigs.data.repository.UserDataRepository;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2 = {"Lcom/example/gigs/ui/UserDataViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/gigs/data/repository/UserDataRepository;", "(Lcom/example/gigs/data/repository/UserDataRepository;)V", "book", "Landroidx/lifecycle/MutableLiveData;", "", "getBook", "()Landroidx/lifecycle/MutableLiveData;", "setBook", "(Landroidx/lifecycle/MutableLiveData;)V", "name", "getName", "setName", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "userData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/gigs/data/entities/UserData;", "getUserData", "()Landroidx/lifecycle/LiveData;", "insertUserData", "", "updateData", "app_debug"})
public final class UserDataViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.gigs.data.repository.UserDataRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.gigs.data.entities.UserData>> userData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> name;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumber;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> book;
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public UserDataViewModel(@org.jetbrains.annotations.NotNull()
    com.example.gigs.data.repository.UserDataRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.gigs.data.entities.UserData>> getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getBook() {
        return null;
    }
    
    public final void setBook(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void insertUserData(@org.jetbrains.annotations.NotNull()
    com.example.gigs.data.entities.UserData userData) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    com.example.gigs.data.entities.UserData userData) {
    }
}