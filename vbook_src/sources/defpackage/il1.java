package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: il1  reason: default package */
/* loaded from: classes.dex */
public final class il1 implements zp5 {
    public final Context a;
    public final io5 b;
    public final jp5 c;
    public final String d;
    public final String e;

    public il1(Context context, io5 io5Var, jp5 jp5Var) {
        context.getClass();
        io5Var.getClass();
        jp5Var.getClass();
        this.a = context;
        this.b = io5Var;
        this.c = jp5Var;
        Object obj = jp5Var.b;
        this.d = obj.toString();
        this.e = obj.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // defpackage.zp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.m42 r19) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il1.a(m42):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || il1.class != obj.getClass()) {
            return false;
        }
        il1 il1Var = (il1) obj;
        if (c16.i(this.b, il1Var.b) && c16.i(this.c, il1Var.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zp5
    public final String getKey() {
        return this.e;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CoilHttpImageSource.Factory(" + this.c.b + ')';
    }
}
