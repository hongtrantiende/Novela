package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hw9  reason: default package */
/* loaded from: classes.dex */
public final class hw9 implements Closeable {
    public static final bt3 f = new bt3("proto");
    public final l0a a;
    public final xj1 b;
    public final xj1 c;
    public final kc0 d;
    public final k99 e;

    public hw9(xj1 xj1Var, xj1 xj1Var2, kc0 kc0Var, l0a l0aVar, k99 k99Var) {
        this.a = l0aVar;
        this.b = xj1Var;
        this.c = xj1Var2;
        this.d = kc0Var;
        this.e = k99Var;
    }

    public static String V(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((yc0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object g0(Cursor cursor, fw9 fw9Var) {
        try {
            return fw9Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long q(SQLiteDatabase sQLiteDatabase, ld0 ld0Var) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ld0Var.a, String.valueOf(d69.a(ld0Var.c))));
        byte[] bArr = ld0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public final Object C(fw9 fw9Var) {
        SQLiteDatabase o = o();
        o.beginTransaction();
        try {
            Object apply = fw9Var.apply(o);
            o.setTransactionSuccessful();
            return apply;
        } finally {
            o.endTransaction();
        }
    }

    public final ArrayList G(SQLiteDatabase sQLiteDatabase, ld0 ld0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long q = q(sQLiteDatabase, ld0Var);
        if (q == null) {
            return arrayList;
        }
        g0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{q.toString()}, null, null, null, String.valueOf(i)), new ua2(7, this, arrayList, ld0Var));
        return arrayList;
    }

    public final void Q(long j, cw6 cw6Var, String str) {
        C(new p92(str, j, cw6Var));
    }

    public final Object S(lfb lfbVar) {
        SQLiteDatabase o = o();
        xj1 xj1Var = this.c;
        long h = xj1Var.h();
        while (true) {
            try {
                o.beginTransaction();
                try {
                    Object h2 = lfbVar.h();
                    o.setTransactionSuccessful();
                    return h2;
                } finally {
                    o.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (xj1Var.h() < this.d.c + h) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final SQLiteDatabase o() {
        l0a l0aVar = this.a;
        Objects.requireNonNull(l0aVar);
        xj1 xj1Var = this.c;
        long h = xj1Var.h();
        while (true) {
            try {
                return l0aVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (xj1Var.h() < this.d.c + h) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }
}
