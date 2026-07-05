package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r36  reason: default package */
/* loaded from: classes3.dex */
public abstract class r36 {
    public static final q36 d = new r36(new a46(false, false, false, false, true, "    ", false, "type", false, true, false, yh1.c, true), baa.a);
    public final a46 a;
    public final wf2 b;
    public final j23 c = new j23(0);

    public r36(a46 a46Var, wf2 wf2Var) {
        this.a = a46Var;
        this.b = wf2Var;
    }

    public final Object a(s76 s76Var, String str) {
        s76Var.getClass();
        str.getClass();
        v3b q = nqe.q(this, str);
        Object d2 = new m1b(this, znd.c, q, s76Var.e(), null).d(s76Var);
        q.p();
        return d2;
    }

    public final String b(s76 s76Var, Object obj) {
        s76Var.getClass();
        jt1 jt1Var = new jt1((char) 0, 2);
        wb1 wb1Var = wb1.d;
        jt1Var.c = wb1Var.H(Token.CASE);
        try {
            jsc.D(this, jt1Var, s76Var, obj);
            String jt1Var2 = jt1Var.toString();
            char[] cArr = (char[]) jt1Var.c;
            wb1Var.getClass();
            cArr.getClass();
            wb1Var.E(cArr);
            return jt1Var2;
        } catch (Throwable th) {
            wb1 wb1Var2 = wb1.d;
            char[] cArr2 = (char[]) jt1Var.c;
            wb1Var2.getClass();
            cArr2.getClass();
            wb1Var2.E(cArr2);
            throw th;
        }
    }

    public final k46 c(String str) {
        str.getClass();
        return (k46) a(n46.a, str);
    }
}
