package com.example.gigs.data.repository;

import com.example.gigs.data.entities.UserData;
import com.example.gigs.data.local.UserDataDao;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/gigs/data/repository/UserDataRepository;", "", "localDataSource", "Lcom/example/gigs/data/local/UserDataDao;", "(Lcom/example/gigs/data/local/UserDataDao;)V", "getUserData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/gigs/data/entities/UserData;", "insertUserData", "", "userData", "(Lcom/example/gigs/data/entities/UserData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserData", "app_release"})
public final class UserDataRepository {
    private final com.example.gigs.data.local.UserDataDao localDataSource = null;
    
    @javax.inject.Inject()
    public UserDataRepository(@org.jetbrains.annotations.NotNull()
    com.example.gigs.data.local.UserDataDao localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.gigs.data.entities.UserData>> getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertUserData(@org.jetbrains.annotations.NotNull()
    com.example.gigs.data.entities.UserData userData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void updateUserData(@org.jetbrains.annotations.NotNull()
    com.example.gigs.data.entities.UserData userData) {
    }
}