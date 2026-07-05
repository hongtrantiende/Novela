package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p17  reason: default package */
/* loaded from: classes.dex */
public abstract class p17 {
    public static final tu1 a = new tu1(new iv1(21), false, -1407432349);
    public static final tu1 b = new tu1(new iv1(22), false, -1804403584);
    public static final tu1 c = new tu1(new jv1(12), false, 835901820);
    public static final tu1 d = new tu1(new jv1(13), false, -964333400);

    public static final void a(dm5 dm5Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean d2;
        dm5Var.getClass();
        int i3 = dm5Var.d;
        rv4Var.g0(288432512);
        if (rv4Var.f(dm5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        boolean z2 = true;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            om3 om3Var = (om3) rv4Var.j(nm3.a);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                long c2 = om3Var.c();
                dl8 dl8Var = (dl8) om3Var.k.getValue();
                boolean g = om3Var.g();
                boolean e = om3Var.e();
                boolean booleanValue = ((Boolean) om3Var.d.getValue()).booleanValue();
                boolean f = om3Var.f();
                if (i3 != 0) {
                    if (i3 != 2) {
                        d2 = false;
                    } else {
                        d2 = true;
                    }
                } else {
                    d2 = om3Var.d();
                }
                om3 om3Var2 = new om3(c2, d2, booleanValue, e, g, f, dl8Var, om3Var.b(), om3Var.a(), (eo4) om3Var.h.getValue());
                rv4Var.o0(om3Var2);
                P = om3Var2;
            }
            om3 om3Var3 = (om3) P;
            if (i3 != 0) {
                if (i3 != 2) {
                    z2 = false;
                }
            } else {
                z2 = om3Var.d();
            }
            om3Var3.c.setValue(Boolean.valueOf(z2));
            nm3.a(om3Var3, ((h27) rv4Var.j(j27.a)).c, false, null, jce.E(-1087738740, new x0a(tu1Var, 7), rv4Var), rv4Var, 24576, 12);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lq5(dm5Var, tu1Var, i, 0);
        }
    }

    public static final String b(CharsetDecoder charsetDecoder, psa psaVar) {
        charsetDecoder.getClass();
        psaVar.getClass();
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, psaVar.b().c));
        Charset charset = charsetDecoder.charset();
        charset.getClass();
        if (charset.equals(ed1.a)) {
            sb.append((CharSequence) zpe.i(psaVar));
        } else {
            long j = psaVar.b().c;
            byte[] n = pbe.n(psaVar, -1);
            Charset charset2 = charsetDecoder.charset();
            charset2.getClass();
            sb.append((CharSequence) new String(n, charset2));
        }
        return sb.toString();
    }

    public static final void c(CharsetEncoder charsetEncoder, ly0 ly0Var, CharSequence charSequence, int i, int i2) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (i < i2) {
            do {
                byte[] u = vqe.u(charsetEncoder, charSequence, i, i2);
                ly0Var.n(u, u.length);
                int length = u.length;
                if (length >= 0) {
                    i += length;
                } else {
                    vs.k("Check failed.");
                    return;
                }
            } while (i < i2);
        }
    }

    public static final f37 d(vh6 vh6Var, int i, long j, gj8 gj8Var, long j2, ff8 ff8Var, lk0 lk0Var, mk0 mk0Var, tc6 tc6Var, int i2, wu7 wu7Var) {
        ArrayList arrayList;
        Object b2 = gj8Var.b(i);
        List list = (List) wu7Var.b(i);
        if (list != null) {
            arrayList = list;
        } else {
            List a2 = vh6Var.a(i);
            int size = a2.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((w27) a2.get(i3)).M(j));
            }
            wu7Var.i(i, arrayList2);
            arrayList = arrayList2;
        }
        return new f37(i, i2, arrayList, j2, b2, ff8Var, lk0Var, mk0Var, tc6Var);
    }

    public static final int e(rv4 rv4Var) {
        rv4Var.getClass();
        return Long.hashCode(rv4Var.T);
    }

    public static final long f(rv4 rv4Var) {
        return rv4Var.T;
    }

    public static nq7 g(nq7 nq7Var, yu7 yu7Var) {
        return nq7Var.a0(new ia5(yu7Var));
    }

    public static final void h() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final boolean i(gtb gtbVar, boolean z) {
        sc6 c2;
        ol6 ol6Var = gtbVar.d;
        if (ol6Var != null && (c2 = ol6Var.c()) != null) {
            return yte.q(gtbVar.l(z), yte.w(c2));
        }
        return false;
    }

    public static final boolean j(oa6 oa6Var, String str) {
        if (oa6Var.hasNext()) {
            if ((oa6Var.G() != EventType.END_ELEMENT && oa6Var.G() != EventType.END_DOCUMENT) || !oa6Var.S().equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int k(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final boolean l(oa6 oa6Var) {
        EventType eventType = EventType.END_DOCUMENT;
        eventType.getClass();
        if (oa6Var.hasNext() && oa6Var.next() != eventType) {
            return true;
        }
        return false;
    }

    public static final pv4 m(rv4 rv4Var) {
        wv4 wv4Var;
        rv4 rv4Var2;
        rv4Var.a0(206, ex1.e);
        if (rv4Var.S) {
            eqa.z(rv4Var.I);
        }
        Object H = rv4Var.H();
        if (H instanceof wv4) {
            wv4Var = (wv4) H;
        } else {
            wv4Var = null;
        }
        if (wv4Var == null) {
            rv4Var2 = rv4Var;
            wv4Var = new wv4(new ov4(new pv4(rv4Var2, rv4Var.T, rv4Var.q, rv4Var.C, rv4Var.h.P)), -1);
            rv4Var2.p0(wv4Var);
        } else {
            rv4Var2 = rv4Var;
        }
        bn9 bn9Var = wv4Var.a;
        bn9Var.getClass();
        pv4 pv4Var = ((ov4) bn9Var).a;
        pv4Var.f.setValue(rv4Var2.l());
        rv4Var2.q(false);
        return pv4Var;
    }

    public static final o3a n(x2a x2aVar, vt4 vt4Var, rv4 rv4Var, int i) {
        boolean z;
        x2aVar.getClass();
        vt4Var.getClass();
        rv4Var.e0(996643712);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            Object ey1Var = new ey1(yte.s(rv4Var));
            rv4Var.o0(ey1Var);
            P = ey1Var;
        }
        m82 m82Var = ((ey1) P).a;
        aw7 D = yae.D(vt4Var, rv4Var);
        aw7 D2 = yae.D(100L, rv4Var);
        rv4Var.e0(1852585201);
        boolean f = rv4Var.f(x2aVar) | rv4Var.f(m82Var);
        if ((((i & 896) ^ 384) > 256 && rv4Var.e(100L)) || (i & 384) == 256) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z | f;
        Object P2 = rv4Var.P();
        if (z2 || P2 == obj) {
            P2 = new o3a(x2aVar, m82Var, new hg(23, D, D2));
            rv4Var.o0(P2);
        }
        o3a o3aVar = (o3a) P2;
        rv4Var.q(false);
        rv4Var.q(false);
        return o3aVar;
    }

    public static final nq7 o(nq7 nq7Var, String str) {
        return nq7Var.a0(new olb(str));
    }
}
