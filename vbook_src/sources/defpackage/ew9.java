package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ew9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ew9 implements fw9 {
    public final /* synthetic */ long a;
    public final /* synthetic */ ld0 b;

    public /* synthetic */ ew9(long j, ld0 ld0Var) {
        this.a = j;
        this.b = ld0Var;
    }

    @Override // defpackage.fw9
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        ld0 ld0Var = this.b;
        String str = ld0Var.a;
        c69 c69Var = ld0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(d69.a(c69Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(d69.a(c69Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
