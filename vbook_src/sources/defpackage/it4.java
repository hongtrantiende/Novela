package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: it4  reason: default package */
/* loaded from: classes.dex */
public final class it4 implements Closeable {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final ye6 d;
    public static final ye6 e;
    public final SQLiteDatabase a;

    static {
        k24 k24Var = new k24(17);
        sk6 sk6Var = sk6.b;
        d = ipe.x(sk6Var, k24Var);
        e = ipe.x(sk6Var, new k24(18));
    }

    public it4(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public final pt4 C(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.a.compileStatement(str);
        compileStatement.getClass();
        return new pt4(compileStatement);
    }

    public final void G() {
        this.a.endTransaction();
    }

    public final void Q(String str) {
        this.a.execSQL(str);
    }

    public final void S(Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean V() {
        return this.a.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Cursor g0(p9b p9bVar) {
        final zd1 zd1Var = new zd1(p9bVar, 3);
        Cursor rawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ht4
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) zd1.this.h(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, p9bVar.m(), c, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    public final void j0() {
        this.a.setTransactionSuccessful();
    }

    public final void o() {
        this.a.beginTransaction();
    }

    public final void q() {
        this.a.beginTransactionNonExclusive();
    }
}
