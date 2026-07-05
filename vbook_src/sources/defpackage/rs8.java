package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rs8  reason: default package */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class rs8 {
    public static int a(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    public static gt1 b(int i, rv4 rv4Var, boolean z) {
        rv4Var.e0(i);
        rv4Var.q(z);
        return new gt1(7);
    }

    public static hi5 c(gh5 gh5Var, pg5 pg5Var, gh5 gh5Var2, re5 re5Var) {
        gh5Var.d(pg5Var);
        return new hi5(gh5Var2, re5Var);
    }

    public static we6 d(kq7 kq7Var, float f, rv4 rv4Var, float f2, boolean z) {
        xbe.i(rv4Var, pna.s(kq7Var, f));
        return new we6(f2, z);
    }

    public static nq7 e(float f, nq7 nq7Var, boolean z) {
        return nq7Var.a0(new we6(f, z));
    }

    public static ClassCastException f(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String g(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String h(g7b g7bVar, StringBuilder sb, char c) {
        sb.append(g7bVar.a());
        sb.append(c);
        return sb.toString();
    }

    public static String i(Object obj, String str) {
        return str + obj;
    }

    public static String j(String str, char c, char c2) {
        return r4b.O(k4b.N0(str).toString(), c, c2);
    }

    public static String k(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(String str, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String n(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder o(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, boolean z, String str2, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static void q(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void r(ij1 ij1Var, long j) {
        ij1Var.w().q();
        ij1Var.Y(j);
    }

    public static void s(rv4 rv4Var, int i, kq7 kq7Var, float f, rv4 rv4Var2) {
        rv4Var.e0(i);
        xbe.i(rv4Var2, pna.s(kq7Var, f));
    }

    public static void t(rv4 rv4Var, Integer num, rv4 rv4Var2, rv4 rv4Var3, nq7 nq7Var) {
        jce.F(qw1.g, rv4Var, num);
        jce.C(qw1.h, rv4Var2);
        jce.F(qw1.d, rv4Var3, nq7Var);
    }

    public static void u(rv4 rv4Var, boolean z, kq7 kq7Var, float f, rv4 rv4Var2) {
        rv4Var.q(z);
        xbe.i(rv4Var2, pna.h(kq7Var, f));
    }

    public static void v(kq7 kq7Var, float f, rv4 rv4Var, boolean z) {
        xbe.i(rv4Var, pna.s(kq7Var, f));
        rv4Var.q(z);
    }

    public static void w(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void x(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void y(StringBuilder sb, String str, String str2, boolean z, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void z(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }
}
