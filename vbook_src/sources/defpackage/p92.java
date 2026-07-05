package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p92  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p92 implements fz2, fw9, lfb {
    public final /* synthetic */ Object a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p92(Object obj, long j, Object obj2) {
        this.a = obj;
        this.c = obj2;
        this.b = j;
    }

    @Override // defpackage.fw9
    public Object apply(Object obj) {
        boolean z;
        String str = (String) this.a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((cw6) this.c).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            if (rawQuery.getCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            rawQuery.close();
            long j = this.b;
            if (!z) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(nk2.t(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.fz2
    public void f(l99 l99Var) {
        ((q92) l99Var.get()).d((String) this.a, this.b, (gd0) this.c);
    }

    @Override // defpackage.lfb
    public Object h() {
        tc0 tc0Var = (tc0) this.a;
        hw9 hw9Var = (hw9) tc0Var.c;
        long h = ((xj1) tc0Var.g).h() + this.b;
        hw9Var.getClass();
        hw9Var.C(new ew9(h, (ld0) this.c));
        return null;
    }

    public /* synthetic */ p92(String str, long j, gd0 gd0Var) {
        this.a = str;
        this.b = j;
        this.c = gd0Var;
    }
}
