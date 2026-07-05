package defpackage;

import android.content.res.Resources;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cr5  reason: default package */
/* loaded from: classes.dex */
public final class cr5 {
    public final Resources.Theme a;
    public final int b;

    public cr5(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr5)) {
            return false;
        }
        cr5 cr5Var = (cr5) obj;
        if (c16.i(this.a, cr5Var.a) && this.b == cr5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ")";
    }
}
