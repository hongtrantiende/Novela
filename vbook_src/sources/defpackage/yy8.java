package defpackage;

import android.util.SparseBooleanArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yy8  reason: default package */
/* loaded from: classes.dex */
public final class yy8 {
    public final ci4 a;

    static {
        new SparseBooleanArray();
        wq9.D(!false);
        a2d.K(0);
    }

    public yy8(ci4 ci4Var) {
        this.a = ci4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy8)) {
            return false;
        }
        return this.a.equals(((yy8) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
