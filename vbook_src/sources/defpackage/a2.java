package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a2  reason: default package */
/* loaded from: classes3.dex */
public abstract class a2 implements g46, yq2, fx1 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final r36 c;
    public final String d;
    public final a46 e;

    public a2(r36 r36Var, String str) {
        this.c = r36Var;
        this.d = str;
        this.e = r36Var.a;
    }

    @Override // defpackage.yq2
    public final byte A() {
        return I(U());
    }

    @Override // defpackage.yq2
    public final short B() {
        return P(U());
    }

    @Override // defpackage.yq2
    public final float C() {
        return L(U());
    }

    @Override // defpackage.fx1
    public final long D(o9a o9aVar, int i) {
        o9aVar.getClass();
        return O(S(o9aVar, i));
    }

    @Override // defpackage.yq2
    public final double E() {
        return K(U());
    }

    public abstract k46 F(String str);

    public final k46 G() {
        k46 F;
        String str = (String) sl1.k0(this.a);
        if (str != null && (F = F(str)) != null) {
            return F;
        }
        return T();
    }

    public final boolean H(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k46 F = F(str2);
        if (!(F instanceof i56)) {
            String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of boolean";
            String W = W(str2);
            if (this.c.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str3, -1, W, null, str));
        }
        i56 i56Var = (i56) F;
        try {
            hv5 hv5Var = l46.a;
            Boolean b = w3b.b(i56Var.a());
            if (b != null) {
                return b.booleanValue();
            }
            X(i56Var, "boolean", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(i56Var, "boolean", str2);
            throw null;
        }
    }

    public final byte I(Object obj) {
        Byte b;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k46 F = F(str2);
        if (!(F instanceof i56)) {
            String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of byte";
            String W = W(str2);
            if (this.c.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str3, -1, W, null, str));
        }
        i56 i56Var = (i56) F;
        try {
            long i = l46.i(i56Var);
            if (-128 <= i && i <= 127) {
                b = Byte.valueOf((byte) i);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            X(i56Var, "byte", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(i56Var, "byte", str2);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k46 F = F(str2);
        if (!(F instanceof i56)) {
            String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of char";
            String W = W(str2);
            if (this.c.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str3, -1, W, null, str));
        }
        i56 i56Var = (i56) F;
        try {
            String a = i56Var.a();
            a.getClass();
            int length = a.length();
            if (length != 0) {
                if (length == 1) {
                    return a.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            X(i56Var, "char", str2);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        k46 F = F(str3);
        boolean z = F instanceof i56;
        r36 r36Var = this.c;
        if (!z) {
            String str4 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of double";
            String W = W(str3);
            if (r36Var.a.m) {
                str2 = am8.C(F.toString(), -1).toString();
            } else {
                str2 = null;
            }
            throw new q46(am8.z(str4, -1, W, null, str2));
        }
        i56 i56Var = (i56) F;
        try {
            hv5 hv5Var = l46.a;
            double parseDouble = Double.parseDouble(i56Var.a());
            if (!r36Var.a.i && Math.abs(parseDouble) > Double.MAX_VALUE) {
                String D = am8.D(Double.valueOf(parseDouble), str3);
                if (r36Var.a.m) {
                    str = am8.C(G().toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new q46(am8.z(D, -1, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            X(i56Var, "double", str3);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        k46 F = F(str3);
        boolean z = F instanceof i56;
        r36 r36Var = this.c;
        if (!z) {
            String str4 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of float";
            String W = W(str3);
            if (r36Var.a.m) {
                str2 = am8.C(F.toString(), -1).toString();
            } else {
                str2 = null;
            }
            throw new q46(am8.z(str4, -1, W, null, str2));
        }
        i56 i56Var = (i56) F;
        try {
            hv5 hv5Var = l46.a;
            float parseFloat = Float.parseFloat(i56Var.a());
            if (!r36Var.a.i && Math.abs(parseFloat) > Float.MAX_VALUE) {
                String D = am8.D(Float.valueOf(parseFloat), str3);
                if (r36Var.a.m) {
                    str = am8.C(G().toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new q46(am8.z(D, -1, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            X(i56Var, "float", str3);
            throw null;
        }
    }

    public final yq2 M(Object obj, o9a o9aVar) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        o9aVar.getClass();
        if (o1b.a(o9aVar)) {
            k46 F = F(str2);
            String a = o9aVar.a();
            boolean z = F instanceof i56;
            r36 r36Var = this.c;
            if (!z) {
                String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of " + a;
                String W = W(str2);
                if (r36Var.a.m) {
                    str = am8.C(F.toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new q46(am8.z(str3, -1, W, null, str));
            }
            return new h46(nqe.q(r36Var, ((i56) F).a()), r36Var);
        }
        this.a.add(str2);
        return this;
    }

    public final int N(Object obj) {
        Integer num;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k46 F = F(str2);
        if (!(F instanceof i56)) {
            String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of int";
            String W = W(str2);
            if (this.c.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str3, -1, W, null, str));
        }
        i56 i56Var = (i56) F;
        try {
            long i = l46.i(i56Var);
            if (-2147483648L <= i && i <= 2147483647L) {
                num = Integer.valueOf((int) i);
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
            X(i56Var, "int", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(i56Var, "int", str2);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k46 F = F(str2);
        if (!(F instanceof i56)) {
            String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of long";
            String W = W(str2);
            if (this.c.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str3, -1, W, null, str));
        }
        i56 i56Var = (i56) F;
        try {
            return l46.i(i56Var);
        } catch (IllegalArgumentException unused) {
            this.X(i56Var, "long", str2);
            throw null;
        }
    }

    public final short P(Object obj) {
        Short sh;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k46 F = F(str2);
        if (!(F instanceof i56)) {
            String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of short";
            String W = W(str2);
            if (this.c.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str3, -1, W, null, str));
        }
        i56 i56Var = (i56) F;
        try {
            long i = l46.i(i56Var);
            if (-32768 <= i && i <= 32767) {
                sh = Short.valueOf((short) i);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            X(i56Var, "short", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(i56Var, "short", str2);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k46 F = F(str2);
        boolean z = F instanceof i56;
        r36 r36Var = this.c;
        String str3 = null;
        if (!z) {
            String str4 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of string";
            String W = W(str2);
            if (r36Var.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str4, -1, W, null, str));
        }
        i56 i56Var = (i56) F;
        if (!(i56Var instanceof w46)) {
            String n = hl5.n("Expected string value for a non-null key '", str2, "', got null literal instead");
            String W2 = W(str2);
            if (r36Var.a.m) {
                str3 = am8.C(G().toString(), -1).toString();
            }
            throw new q46(am8.z(n, -1, W2, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", str3));
        }
        w46 w46Var = (w46) i56Var;
        if (!w46Var.a && !r36Var.a.c) {
            String n2 = hl5.n("String literal for value of key '", str2, "' should be quoted");
            String W3 = W(str2);
            if (r36Var.a.m) {
                str3 = am8.C(G().toString(), -1).toString();
            }
            throw new q46(am8.z(n2, -1, W3, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", str3));
        }
        return w46Var.b;
    }

    public String R(o9a o9aVar, int i) {
        o9aVar.getClass();
        return o9aVar.g(i);
    }

    public final String S(o9a o9aVar, int i) {
        o9aVar.getClass();
        String R = R(o9aVar, i);
        R.getClass();
        String str = (String) sl1.k0(this.a);
        return R;
    }

    public abstract k46 T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(tl1.x(arrayList));
        this.b = true;
        return remove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return sl1.i0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(i56 i56Var, String str, String str2) {
        String str3;
        String str4;
        if (r4b.Q(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        String str5 = "Failed to parse literal '" + i56Var + "' as " + str3.concat(str) + " value";
        String W = W(str2);
        if (this.c.a.m) {
            str4 = am8.C(G().toString(), -1).toString();
        } else {
            str4 = null;
        }
        throw new q46(am8.z(str5, -1, W, null, str4));
    }

    @Override // defpackage.fx1
    public final yq2 a(u59 u59Var, int i) {
        u59Var.getClass();
        return M(S(u59Var, i), u59Var.i(i));
    }

    @Override // defpackage.yq2
    public final boolean b() {
        return H(U());
    }

    @Override // defpackage.yq2
    public final char c() {
        return J(U());
    }

    @Override // defpackage.yq2
    public final Object d(s76 s76Var) {
        String str;
        String str2;
        String str3;
        s76Var.getClass();
        if (s76Var instanceof f3) {
            r36 r36Var = this.c;
            a46 a46Var = r36Var.a;
            f3 f3Var = (f3) s76Var;
            String o = tc4.o(r36Var, f3Var.e());
            k46 G = G();
            String a = f3Var.e().a();
            if (!(G instanceof d56)) {
                String str4 = "Expected " + cm9.a(d56.class).g() + ", but had " + cm9.a(G.getClass()).g() + " as the serialized body of " + a;
                String V = V();
                if (r36Var.a.m) {
                    str3 = am8.C(G.toString(), -1).toString();
                } else {
                    str3 = null;
                }
                throw new q46(am8.z(str4, -1, V, null, str3));
            }
            d56 d56Var = (d56) G;
            k46 k46Var = (k46) d56Var.get(o);
            try {
                if (k46Var != null) {
                    i56 h = l46.h(k46Var);
                    if (!(h instanceof a56)) {
                        str = h.a();
                        return gae.o(r36Var, o, d56Var, b16.N((f3) s76Var, this, str));
                    }
                }
                return gae.o(r36Var, o, d56Var, b16.N((f3) s76Var, this, str));
            } catch (v9a e) {
                String message = e.getMessage();
                message.getClass();
                if (r36Var.a.m) {
                    str2 = am8.C(d56Var.toString(), -1).toString();
                } else {
                    str2 = null;
                }
                throw new q46(am8.z(message, -1, null, null, str2));
            }
            str = null;
        } else {
            return s76Var.c(this);
        }
    }

    @Override // defpackage.fx1
    public final float e(o9a o9aVar, int i) {
        o9aVar.getClass();
        return L(S(o9aVar, i));
    }

    @Override // defpackage.fx1
    public final double g(u59 u59Var, int i) {
        u59Var.getClass();
        return K(S(u59Var, i));
    }

    @Override // defpackage.fx1
    public final char h(u59 u59Var, int i) {
        u59Var.getClass();
        return J(S(u59Var, i));
    }

    @Override // defpackage.g46
    public final k46 i() {
        return G();
    }

    @Override // defpackage.fx1
    public final byte j(u59 u59Var, int i) {
        u59Var.getClass();
        return I(S(u59Var, i));
    }

    @Override // defpackage.fx1
    public final String k(o9a o9aVar, int i) {
        o9aVar.getClass();
        return Q(S(o9aVar, i));
    }

    @Override // defpackage.yq2
    public final int l() {
        return N(U());
    }

    @Override // defpackage.fx1
    public final short m(u59 u59Var, int i) {
        u59Var.getClass();
        return P(S(u59Var, i));
    }

    @Override // defpackage.fx1
    public void n(o9a o9aVar) {
        o9aVar.getClass();
    }

    @Override // defpackage.fx1
    public final wf2 o() {
        return this.c.b;
    }

    @Override // defpackage.yq2
    public final yq2 p(o9a o9aVar) {
        o9aVar.getClass();
        if (sl1.k0(this.a) != null) {
            return M(U(), o9aVar);
        }
        return new j56(this.c, T(), this.d).p(o9aVar);
    }

    @Override // defpackage.fx1
    public final Object q(o9a o9aVar, int i, s76 s76Var, Object obj) {
        o9aVar.getClass();
        s76Var.getClass();
        this.a.add(S(o9aVar, i));
        s76Var.getClass();
        Object d = d(s76Var);
        if (!this.b) {
            U();
        }
        this.b = false;
        return d;
    }

    @Override // defpackage.fx1
    public final int r(o9a o9aVar, int i) {
        o9aVar.getClass();
        return N(S(o9aVar, i));
    }

    @Override // defpackage.yq2
    public final String s() {
        return Q(U());
    }

    @Override // defpackage.yq2
    public fx1 t(o9a o9aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        o9aVar.getClass();
        k46 G = G();
        bze e = o9aVar.e();
        boolean i = c16.i(e, a5b.g);
        r36 r36Var = this.c;
        if (!i && !(e instanceof l19)) {
            if (c16.i(e, a5b.h)) {
                o9a g = hxe.g(o9aVar.i(0), r36Var.b);
                bze e2 = g.e();
                if (!(e2 instanceof w59) && !c16.i(e2, t9a.f)) {
                    if (r36Var.a.d) {
                        String a = o9aVar.a();
                        if (!(G instanceof t36)) {
                            String str5 = "Expected " + cm9.a(t36.class).g() + ", but had " + cm9.a(G.getClass()).g() + " as the serialized body of " + a;
                            String V = V();
                            if (r36Var.a.m) {
                                str4 = am8.C(G.toString(), -1).toString();
                            } else {
                                str4 = null;
                            }
                            throw new q46(am8.z(str5, -1, V, null, str4));
                        }
                        return new o56(r36Var, (t36) G);
                    }
                    throw am8.d(g);
                }
                String a2 = o9aVar.a();
                if (!(G instanceof d56)) {
                    String str6 = "Expected " + cm9.a(d56.class).g() + ", but had " + cm9.a(G.getClass()).g() + " as the serialized body of " + a2;
                    String V2 = V();
                    if (r36Var.a.m) {
                        str3 = am8.C(G.toString(), -1).toString();
                    } else {
                        str3 = null;
                    }
                    throw new q46(am8.z(str6, -1, V2, null, str3));
                }
                return new p56(r36Var, (d56) G);
            }
            String a3 = o9aVar.a();
            if (!(G instanceof d56)) {
                String str7 = "Expected " + cm9.a(d56.class).g() + ", but had " + cm9.a(G.getClass()).g() + " as the serialized body of " + a3;
                String V3 = V();
                if (r36Var.a.m) {
                    str2 = am8.C(G.toString(), -1).toString();
                } else {
                    str2 = null;
                }
                throw new q46(am8.z(str7, -1, V3, null, str2));
            }
            return new n56(r36Var, (d56) G, this.d, 8);
        }
        String a4 = o9aVar.a();
        if (!(G instanceof t36)) {
            String str8 = "Expected " + cm9.a(t36.class).g() + ", but had " + cm9.a(G.getClass()).g() + " as the serialized body of " + a4;
            String V4 = V();
            if (r36Var.a.m) {
                str = am8.C(G.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str8, -1, V4, null, str));
        }
        return new o56(r36Var, (t36) G);
    }

    @Override // defpackage.yq2
    public final int u(o9a o9aVar) {
        String str;
        o9aVar.getClass();
        String str2 = (String) U();
        str2.getClass();
        k46 F = F(str2);
        String a = o9aVar.a();
        boolean z = F instanceof i56;
        r36 r36Var = this.c;
        if (!z) {
            String str3 = "Expected " + cm9.a(i56.class).g() + ", but had " + cm9.a(F.getClass()).g() + " as the serialized body of " + a;
            String W = W(str2);
            if (r36Var.a.m) {
                str = am8.C(F.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str3, -1, W, null, str));
        }
        return z46.b(o9aVar, r36Var, ((i56) F).a(), "");
    }

    @Override // defpackage.yq2
    public final long v() {
        return O(U());
    }

    @Override // defpackage.yq2
    public boolean w() {
        return !(G() instanceof a56);
    }

    @Override // defpackage.fx1
    public final Object x(o9a o9aVar, int i, s76 s76Var, Object obj) {
        Object d;
        o9aVar.getClass();
        s76Var.getClass();
        this.a.add(S(o9aVar, i));
        if (!s76Var.e().c() && !w()) {
            d = null;
        } else {
            d = d(s76Var);
        }
        if (!this.b) {
            U();
        }
        this.b = false;
        return d;
    }

    @Override // defpackage.g46
    public final r36 y() {
        return this.c;
    }

    @Override // defpackage.fx1
    public final boolean z(o9a o9aVar, int i) {
        o9aVar.getClass();
        return H(S(o9aVar, i));
    }
}
