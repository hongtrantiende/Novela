package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pg5  reason: default package */
/* loaded from: classes3.dex */
public final class pg5 {
    public static final pg5 b;
    public static final pg5 c;
    public static final pg5 d;
    public static final pg5 e;
    public static final pg5 f;
    public static final pg5 g;
    public static final pg5 h;
    public static final pg5 i;
    public static final pg5 j;
    public static final List k;
    public final String a;

    static {
        pg5 pg5Var = new pg5("GET");
        b = pg5Var;
        pg5 pg5Var2 = new pg5("POST");
        c = pg5Var2;
        pg5 pg5Var3 = new pg5("PUT");
        d = pg5Var3;
        pg5 pg5Var4 = new pg5("PATCH");
        e = pg5Var4;
        pg5 pg5Var5 = new pg5("DELETE");
        f = pg5Var5;
        pg5 pg5Var6 = new pg5("HEAD");
        g = pg5Var6;
        pg5 pg5Var7 = new pg5("OPTIONS");
        h = pg5Var7;
        i = new pg5("TRACE");
        j = new pg5("QUERY");
        k = tl1.B(pg5Var, pg5Var2, pg5Var3, pg5Var4, pg5Var5, pg5Var6, pg5Var7);
    }

    public pg5(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pg5) && c16.i(this.a, ((pg5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
