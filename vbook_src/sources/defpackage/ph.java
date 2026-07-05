package defpackage;

import android.database.Cursor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ph  reason: default package */
/* loaded from: classes.dex */
public final class ph {
    public final Cursor a;

    public ph(Cursor cursor) {
        cursor.getClass();
        this.a = cursor;
    }

    public final Boolean a(int i) {
        boolean z;
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        if (cursor.getLong(i) == 1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Double b() {
        Cursor cursor = this.a;
        if (cursor.isNull(19)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(19));
    }

    public final Long c(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    public final String d(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    public final tf9 e() {
        return new tf9(Boolean.valueOf(this.a.moveToNext()));
    }
}
