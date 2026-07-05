package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o03  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o03 implements u03, lfb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o03(tc0 tc0Var, Iterable iterable, ld0 ld0Var, long j) {
        this.a = 2;
        this.b = tc0Var;
        this.e = iterable;
        this.d = ld0Var;
        this.c = j;
    }

    @Override // defpackage.u03
    public ScheduledFuture a(mce mceVar) {
        int i = this.a;
        Object obj = this.d;
        long j = this.c;
        Object obj2 = this.e;
        t03 t03Var = (t03) this.b;
        switch (i) {
            case 0:
                return t03Var.b.schedule(new r03(t03Var, (Runnable) obj2, mceVar, 1), j, (TimeUnit) obj);
            default:
                return t03Var.b.schedule(new s03(0, t03Var, (Callable) obj2, mceVar), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.lfb
    public Object h() {
        tc0 tc0Var = (tc0) this.b;
        Iterable iterable = (Iterable) this.e;
        ld0 ld0Var = (ld0) this.d;
        hw9 hw9Var = (hw9) tc0Var.c;
        hw9Var.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(hw9.V(iterable));
            SQLiteDatabase o = hw9Var.o();
            o.beginTransaction();
            try {
                o.compileStatement(concat).execute();
                Cursor rawQuery = o.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    int i = rawQuery.getInt(0);
                    hw9Var.Q(i, cw6.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                o.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                o.setTransactionSuccessful();
            } finally {
                o.endTransaction();
            }
        }
        hw9Var.C(new ew9(((xj1) tc0Var.g).h() + this.c, ld0Var));
        return null;
    }

    public /* synthetic */ o03(t03 t03Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = t03Var;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }
}
