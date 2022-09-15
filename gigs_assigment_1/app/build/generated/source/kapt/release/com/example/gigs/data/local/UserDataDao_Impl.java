package com.example.gigs.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.gigs.data.entities.UserData;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDataDao_Impl implements UserDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserData> __insertionAdapterOfUserData;

  private final EntityDeletionOrUpdateAdapter<UserData> __deletionAdapterOfUserData;

  private final EntityDeletionOrUpdateAdapter<UserData> __updateAdapterOfUserData;

  public UserDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserData = new EntityInsertionAdapter<UserData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `userData` (`name`,`number`,`book`,`id`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserData value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNumber());
        }
        if (value.getBook() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBook());
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getId());
        }
      }
    };
    this.__deletionAdapterOfUserData = new EntityDeletionOrUpdateAdapter<UserData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `userData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfUserData = new EntityDeletionOrUpdateAdapter<UserData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `userData` SET `name` = ?,`number` = ?,`book` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserData value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNumber());
        }
        if (value.getBook() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBook());
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertAll(final List<UserData> userData,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserData.insert(userData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insert(final UserData userData, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserData.insert(userData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteData(final UserData userData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserData.handle(userData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(final UserData userData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUserData.handle(userData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<UserData>> getAllUserData() {
    final String _sql = "SELECT * FROM userData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"userData"}, false, new Callable<List<UserData>>() {
      @Override
      public List<UserData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfBook = CursorUtil.getColumnIndexOrThrow(_cursor, "book");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<UserData> _result = new ArrayList<UserData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserData _item;
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpNumber;
            if (_cursor.isNull(_cursorIndexOfNumber)) {
              _tmpNumber = null;
            } else {
              _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
            }
            final String _tmpBook;
            if (_cursor.isNull(_cursorIndexOfBook)) {
              _tmpBook = null;
            } else {
              _tmpBook = _cursor.getString(_cursorIndexOfBook);
            }
            _item = new UserData(_tmpName,_tmpNumber,_tmpBook);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<UserData> getUserdata(final int id) {
    final String _sql = "SELECT * FROM userData WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"userData"}, false, new Callable<UserData>() {
      @Override
      public UserData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfBook = CursorUtil.getColumnIndexOrThrow(_cursor, "book");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final UserData _result;
          if(_cursor.moveToFirst()) {
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpNumber;
            if (_cursor.isNull(_cursorIndexOfNumber)) {
              _tmpNumber = null;
            } else {
              _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
            }
            final String _tmpBook;
            if (_cursor.isNull(_cursorIndexOfBook)) {
              _tmpBook = null;
            } else {
              _tmpBook = _cursor.getString(_cursorIndexOfBook);
            }
            _result = new UserData(_tmpName,_tmpNumber,_tmpBook);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
