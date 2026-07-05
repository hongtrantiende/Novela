package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tb7  reason: default package */
/* loaded from: classes.dex */
public final class tb7 {
    public final rb7[] a;
    public final long b;

    public tb7(List list) {
        this((rb7[]) list.toArray(new rb7[0]));
    }

    public final tb7 a(rb7... rb7VarArr) {
        if (rb7VarArr.length == 0) {
            return this;
        }
        String str = a2d.a;
        rb7[] rb7VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(rb7VarArr2, rb7VarArr2.length + rb7VarArr.length);
        System.arraycopy(rb7VarArr, 0, copyOf, rb7VarArr2.length, rb7VarArr.length);
        return new tb7(this.b, (rb7[]) copyOf);
    }

    public final tb7 b(tb7 tb7Var) {
        if (tb7Var == null) {
            return this;
        }
        return a(tb7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tb7.class == obj.getClass()) {
            tb7 tb7Var = (tb7) obj;
            if (Arrays.equals(this.a, tb7Var.a) && this.b == tb7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return axe.m(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public tb7(long j, rb7... rb7VarArr) {
        this.b = j;
        this.a = rb7VarArr;
    }

    public tb7(rb7... rb7VarArr) {
        this(-9223372036854775807L, rb7VarArr);
    }
}
