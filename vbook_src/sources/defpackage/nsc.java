package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nsc  reason: default package */
/* loaded from: classes3.dex */
public final class nsc implements t76 {
    public final w66 a;
    public final List b;
    public final int c;

    public nsc(w66 w66Var, List list, int i) {
        w66Var.getClass();
        list.getClass();
        this.a = w66Var;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.t76
    public final boolean a() {
        if ((this.c & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.t76
    public final List b() {
        return this.b;
    }

    public final String c(boolean z) {
        gi1 gi1Var;
        String name;
        String i0;
        w66 w66Var = this.a;
        Class cls = null;
        if (w66Var instanceof gi1) {
            gi1Var = (gi1) w66Var;
        } else {
            gi1Var = null;
        }
        if (gi1Var != null) {
            cls = nmd.B(gi1Var);
        }
        if (cls == null) {
            name = w66Var.toString();
        } else if ((this.c & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (cls.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (cls.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (cls.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (cls.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (cls.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (cls.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (cls.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else if (cls.equals(double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else if (z && cls.isPrimitive()) {
            name = nmd.C((gi1) w66Var).getName();
        } else {
            name = cls.getName();
        }
        String str = "";
        if (this.b.isEmpty()) {
            i0 = "";
        } else {
            i0 = sl1.i0(this.b, ", ", "<", ">", new txb(this), 24);
        }
        if (a()) {
            str = "?";
        }
        return eub.o(name, i0, str);
    }

    @Override // defpackage.t76
    public final w66 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nsc) {
            nsc nscVar = (nsc) obj;
            if (c16.i(this.a, nscVar.a) && c16.i(this.b, nscVar.b) && this.c == nscVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + eub.l(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return c(false).concat(" (Kotlin reflection is not available)");
    }
}
