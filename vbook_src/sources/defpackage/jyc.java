package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jyc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jyc implements lfb {
    public final /* synthetic */ int a;
    public final /* synthetic */ hw9 b;

    public /* synthetic */ jyc(hw9 hw9Var, int i) {
        this.a = i;
        this.b = hw9Var;
    }

    @Override // defpackage.lfb
    public final Object h() {
        SQLiteDatabase o;
        int i = this.a;
        hw9 hw9Var = this.b;
        switch (i) {
            case 0:
                hw9Var.getClass();
                int i2 = gj1.e;
                oaa oaaVar = new oaa(6);
                oaaVar.c = null;
                oaaVar.d = new ArrayList();
                oaaVar.e = null;
                oaaVar.b = "";
                HashMap hashMap = new HashMap();
                o = hw9Var.o();
                o.beginTransaction();
                try {
                    gj1 gj1Var = (gj1) hw9.g0(o.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ua2(8, hw9Var, hashMap, oaaVar));
                    o.setTransactionSuccessful();
                    return gj1Var;
                } finally {
                }
            default:
                long h = hw9Var.b.h() - hw9Var.d.d;
                o = hw9Var.o();
                o.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(h)};
                    Cursor rawQuery = o.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i3 = rawQuery.getInt(0);
                        hw9Var.Q(i3, cw6.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = o.delete("events", "timestamp_ms < ?", strArr);
                    o.setTransactionSuccessful();
                    o.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
