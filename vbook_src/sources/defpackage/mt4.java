package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mt4  reason: default package */
/* loaded from: classes.dex */
public final class mt4 extends SQLiteOpenHelper {
    public static final /* synthetic */ int D = 0;
    public boolean C;
    public final Context a;
    public final mu9 b;
    public final ny0 c;
    public final boolean d;
    public boolean e;
    public final s69 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt4(Context context, String str, final mu9 mu9Var, final ny0 ny0Var, boolean z) {
        super(context, str, null, ny0Var.b, new DatabaseErrorHandler() { // from class: jt4
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = mt4.D;
                sQLiteDatabase.getClass();
                mu9 mu9Var2 = mu9Var;
                it4 it4Var = (it4) mu9Var2.a;
                if (it4Var == null || !it4Var.a.equals(sQLiteDatabase)) {
                    it4Var = new it4(sQLiteDatabase);
                    mu9Var2.a = it4Var;
                }
                SQLiteDatabase sQLiteDatabase2 = it4Var.a;
                ny0.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + it4Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        ny0.d(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                ny0.d((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                ny0.d(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    it4Var.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        context.getClass();
        ny0Var.getClass();
        this.a = context;
        this.b = mu9Var;
        this.c = ny0Var;
        this.d = z;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.f = new s69(str2, context.getCacheDir(), false);
    }

    public final SQLiteDatabase C(boolean z) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.C;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            readableDatabase.getClass();
            return readableDatabase;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    SQLiteDatabase writableDatabase2 = getWritableDatabase();
                    writableDatabase2.getClass();
                    return writableDatabase2;
                }
                SQLiteDatabase readableDatabase2 = getReadableDatabase();
                readableDatabase2.getClass();
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof kt4) {
                    kt4 kt4Var = (kt4) th;
                    int ordinal = kt4Var.a.ordinal();
                    th = kt4Var.b;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            xk5.o();
                            return null;
                        }
                    } else {
                        throw th;
                    }
                }
                if ((th instanceof SQLiteException) && databaseName != null && this.d) {
                    context.deleteDatabase(databaseName);
                    try {
                        if (z) {
                            SQLiteDatabase writableDatabase3 = getWritableDatabase();
                            writableDatabase3.getClass();
                            return writableDatabase3;
                        }
                        SQLiteDatabase readableDatabase3 = getReadableDatabase();
                        readableDatabase3.getClass();
                        return readableDatabase3;
                    } catch (kt4 e) {
                        throw e.b;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        s69 s69Var = this.f;
        try {
            s69Var.a(s69Var.a);
            super.close();
            this.b.a = null;
            this.C = false;
        } finally {
            s69Var.b();
        }
    }

    public final it4 o(boolean z) {
        boolean z2;
        s69 s69Var = this.f;
        try {
            if (!this.C && getDatabaseName() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            s69Var.a(z2);
            this.e = false;
            SQLiteDatabase C = C(z);
            if (this.e) {
                close();
                it4 o = o(z);
                s69Var.b();
                return o;
            }
            it4 q = q(C);
            s69Var.b();
            return q;
        } catch (Throwable th) {
            s69Var.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.e;
        ny0 ny0Var = this.c;
        if (!z && ny0Var.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            q(sQLiteDatabase);
            ny0Var.getClass();
        } catch (Throwable th) {
            throw new kt4(lt4.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.j(q(sQLiteDatabase));
        } catch (Throwable th) {
            throw new kt4(lt4.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.k(q(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new kt4(lt4.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                this.c.l(q(sQLiteDatabase));
            } catch (Throwable th) {
                throw new kt4(lt4.e, th);
            }
        }
        this.C = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.m(q(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new kt4(lt4.c, th);
        }
    }

    public final it4 q(SQLiteDatabase sQLiteDatabase) {
        mu9 mu9Var = this.b;
        mu9Var.getClass();
        it4 it4Var = (it4) mu9Var.a;
        if (it4Var != null && it4Var.a.equals(sQLiteDatabase)) {
            return it4Var;
        }
        it4 it4Var2 = new it4(sQLiteDatabase);
        mu9Var.a = it4Var2;
        return it4Var2;
    }
}
