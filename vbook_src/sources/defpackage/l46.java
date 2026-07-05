package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l46  reason: default package */
/* loaded from: classes3.dex */
public abstract class l46 {
    public static final hv5 a = tye.c(c4b.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final i56 a(String str) {
        if (str == null) {
            return a56.INSTANCE;
        }
        return new w46(str, true);
    }

    public static final void b(k46 k46Var, String str) {
        throw new IllegalArgumentException("Element " + cm9.a(k46Var.getClass()) + " is not a " + str);
    }

    public static final boolean c(i56 i56Var) {
        Boolean b = w3b.b(i56Var.a());
        if (b != null) {
            return b.booleanValue();
        }
        throw new IllegalStateException(i56Var + " does not represent a Boolean");
    }

    public static final int d(i56 i56Var) {
        try {
            long i = i(i56Var);
            if (-2147483648L <= i && i <= 2147483647L) {
                return (int) i;
            }
            String a2 = i56Var.a();
            throw new NumberFormatException(a2 + " is not an Int");
        } catch (i46 e) {
            throw new NumberFormatException(e.a);
        }
    }

    public static final Integer e(i56 i56Var) {
        Long l;
        try {
            l = Long.valueOf(i(i56Var));
        } catch (i46 unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final t36 f(k46 k46Var) {
        t36 t36Var;
        k46Var.getClass();
        if (k46Var instanceof t36) {
            t36Var = (t36) k46Var;
        } else {
            t36Var = null;
        }
        if (t36Var != null) {
            return t36Var;
        }
        b(k46Var, "JsonArray");
        throw null;
    }

    public static final d56 g(k46 k46Var) {
        d56 d56Var;
        k46Var.getClass();
        if (k46Var instanceof d56) {
            d56Var = (d56) k46Var;
        } else {
            d56Var = null;
        }
        if (d56Var != null) {
            return d56Var;
        }
        b(k46Var, "JsonObject");
        throw null;
    }

    public static final i56 h(k46 k46Var) {
        i56 i56Var;
        k46Var.getClass();
        if (k46Var instanceof i56) {
            i56Var = (i56) k46Var;
        } else {
            i56Var = null;
        }
        if (i56Var != null) {
            return i56Var;
        }
        b(k46Var, "JsonPrimitive");
        throw null;
    }

    public static final long i(i56 i56Var) {
        int i;
        String str;
        v3b q = nqe.q(r36.d, i56Var.a());
        String str2 = q.C;
        long j = q.j();
        if (q.g() != 10) {
            int i2 = q.b;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            if (i2 != str2.length() && i >= 0) {
                str = String.valueOf(str2.charAt(i));
            } else {
                str = "EOF";
            }
            z1.r(q, hl5.n("Expected input to contain a single valid number, but got '", str, "' after it"), i, null, 4);
            throw null;
        }
        return j;
    }
}
