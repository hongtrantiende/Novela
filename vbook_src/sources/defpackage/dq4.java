package defpackage;

import java.util.List;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dq4  reason: default package */
/* loaded from: classes.dex */
public final class dq4 implements Comparable {
    public static final dq4 C;
    public static final dq4 D;
    public static final dq4 E;
    public static final List F;
    public static final dq4 b;
    public static final dq4 c;
    public static final dq4 d;
    public static final dq4 e;
    public static final dq4 f;
    public final int a;

    static {
        dq4 dq4Var = new dq4(100);
        dq4 dq4Var2 = new dq4(Context.VERSION_ES6);
        dq4 dq4Var3 = new dq4(300);
        dq4 dq4Var4 = new dq4(400);
        b = dq4Var4;
        dq4 dq4Var5 = new dq4(500);
        c = dq4Var5;
        dq4 dq4Var6 = new dq4(600);
        d = dq4Var6;
        dq4 dq4Var7 = new dq4(700);
        dq4 dq4Var8 = new dq4(800);
        dq4 dq4Var9 = new dq4(900);
        e = dq4Var4;
        f = dq4Var5;
        C = dq4Var6;
        D = dq4Var7;
        E = dq4Var9;
        F = tl1.B(dq4Var, dq4Var2, dq4Var3, dq4Var4, dq4Var5, dq4Var6, dq4Var7, dq4Var8, dq4Var9);
    }

    public dq4(int i) {
        this.a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            mv5.a("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(dq4 dq4Var) {
        return c16.l(this.a, dq4Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq4)) {
            return false;
        }
        if (this.a == ((dq4) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return hl5.l("FontWeight(weight=", ")", this.a);
    }
}
