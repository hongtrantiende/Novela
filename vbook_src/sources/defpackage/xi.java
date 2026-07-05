package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xi  reason: default package */
/* loaded from: classes.dex */
public final class xi {
    public final Context a;
    public final r13 b;
    public final long c;
    public final rh8 d;

    public xi(Context context, r13 r13Var, long j, rh8 rh8Var) {
        this.a = context;
        this.b = r13Var;
        this.c = j;
        this.d = rh8Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!xi.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        xi xiVar = (xi) obj;
        if (c16.i(this.a, xiVar.a) && c16.i(this.b, xiVar.b) && zl1.c(this.c, xiVar.c) && c16.i(this.d, xiVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int i = zl1.j;
        return this.d.hashCode() + hl5.c((hashCode + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }
}
