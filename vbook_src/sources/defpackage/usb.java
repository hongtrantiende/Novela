package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: usb  reason: default package */
/* loaded from: classes.dex */
public final class usb {
    public final ps a;
    public final long b;
    public final fvb c;
    public final j88 d;
    public final rwb e;
    public long f;
    public final ps g;
    public final jub h;
    public final gvb i;

    public usb(jub jubVar, j88 j88Var, gvb gvbVar, rwb rwbVar) {
        fvb fvbVar;
        ps psVar = jubVar.a;
        long j = jubVar.b;
        if (gvbVar != null) {
            fvbVar = gvbVar.a;
        } else {
            fvbVar = null;
        }
        this.a = psVar;
        this.b = j;
        this.c = fvbVar;
        this.d = j88Var;
        this.e = rwbVar;
        this.f = j;
        this.g = psVar;
        this.h = jubVar;
        this.i = gvbVar;
    }

    public final List a(xt4 xt4Var) {
        if (fxb.d(this.f)) {
            un3 un3Var = (un3) xt4Var.invoke(this);
            if (un3Var != null) {
                return tl1.A(un3Var);
            }
            return null;
        }
        return tl1.B(new mq1("", 0), new aca(fxb.g(this.f), fxb.g(this.f)));
    }

    public final Integer b() {
        fvb fvbVar = this.c;
        if (fvbVar != null) {
            it7 it7Var = fvbVar.b;
            int f = fxb.f(this.f);
            j88 j88Var = this.d;
            return Integer.valueOf(j88Var.d(it7Var.c(it7Var.d(j88Var.w(f)), true)));
        }
        return null;
    }

    public final Integer c() {
        fvb fvbVar = this.c;
        if (fvbVar != null) {
            int g = fxb.g(this.f);
            j88 j88Var = this.d;
            return Integer.valueOf(j88Var.d(fvbVar.i(fvbVar.b.d(j88Var.w(g)))));
        }
        return null;
    }

    public final Integer d() {
        int length;
        fvb fvbVar = this.c;
        if (fvbVar != null) {
            int r = r();
            while (true) {
                ps psVar = this.a;
                if (r >= psVar.b.length()) {
                    length = psVar.b.length();
                    break;
                }
                int length2 = this.g.b.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long k = fvbVar.k(length2);
                int i = fxb.c;
                int i2 = (int) (k & 4294967295L);
                if (i2 <= r) {
                    r++;
                } else {
                    length = this.d.d(i2);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer e() {
        int i;
        fvb fvbVar = this.c;
        if (fvbVar != null) {
            int r = r();
            while (true) {
                if (r <= 0) {
                    i = 0;
                    break;
                }
                int length = this.g.b.length() - 1;
                if (r <= length) {
                    length = r;
                }
                long k = fvbVar.k(length);
                int i2 = fxb.c;
                int i3 = (int) (k >> 32);
                if (i3 >= r) {
                    r--;
                } else {
                    i = this.d.d(i3);
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean f() {
        oq9 oq9Var;
        fvb fvbVar = this.c;
        if (fvbVar != null) {
            oq9Var = fvbVar.b.h(r());
        } else {
            oq9Var = null;
        }
        if (oq9Var != oq9.b) {
            return true;
        }
        return false;
    }

    public final int g(fvb fvbVar, int i) {
        int r = r();
        rwb rwbVar = this.e;
        if (rwbVar.a == null) {
            rwbVar.a = Float.valueOf(fvbVar.c(r).a);
        }
        it7 it7Var = fvbVar.b;
        int d = it7Var.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= it7Var.f) {
            return this.g.b.length();
        }
        float b = it7Var.b(d) - 1.0f;
        Float f = rwbVar.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= fvbVar.h(d)) || (!f() && floatValue <= fvbVar.g(d))) {
            return it7Var.c(d, true);
        }
        return this.d.d(it7Var.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r9 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.gvb r9, int r10) {
        /*
            r8 = this;
            sc6 r0 = r9.b
            fvb r1 = r9.a
            if (r0 == 0) goto L13
            sc6 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            rk9 r9 = r9.g0(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            rk9 r9 = defpackage.rk9.e
        L15:
            jub r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.fxb.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            j88 r8 = r8.d
            int r0 = r8.w(r0)
            rk9 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.h()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            it7 r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.d(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usb.h(gvb, int):int");
    }

    public final void i() {
        rwb rwbVar = this.e;
        rwbVar.a = null;
        ps psVar = this.g;
        if (psVar.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            rwbVar.a = null;
            if (psVar.b.length() > 0) {
                String str = psVar.b;
                long j = this.f;
                int i = fxb.c;
                int j2 = kqe.j((int) (j & 4294967295L), str);
                if (j2 != -1) {
                    q(j2, j2);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        ps psVar = this.g;
        String str = psVar.b;
        String str2 = psVar.b;
        if (str.length() > 0) {
            int l = jqe.l(str2, fxb.f(this.f));
            if (l == fxb.f(this.f) && l != str2.length()) {
                l = jqe.l(str2, l + 1);
            }
            q(l, l);
        }
    }

    public final void k() {
        this.e.a = null;
        ps psVar = this.g;
        if (psVar.b.length() > 0) {
            String str = psVar.b;
            long j = this.f;
            int i = fxb.c;
            int k = kqe.k((int) (j & 4294967295L), str);
            if (k != -1) {
                q(k, k);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        ps psVar = this.g;
        String str = psVar.b;
        String str2 = psVar.b;
        if (str.length() > 0) {
            int m = jqe.m(str2, fxb.g(this.f));
            if (m == fxb.g(this.f) && m != 0) {
                m = jqe.m(str2, m - 1);
            }
            q(m, m);
        }
    }

    public final void m() {
        rwb rwbVar = this.e;
        rwbVar.a = null;
        ps psVar = this.g;
        if (psVar.b.length() > 0) {
            if (f()) {
                rwbVar.a = null;
                if (psVar.b.length() > 0) {
                    String str = psVar.b;
                    long j = this.f;
                    int i = fxb.c;
                    int j2 = kqe.j((int) (j & 4294967295L), str);
                    if (j2 != -1) {
                        q(j2, j2);
                        return;
                    }
                    return;
                }
                return;
            }
            k();
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.b.length() > 0 && (b = b()) != null) {
            int intValue = b.intValue();
            q(intValue, intValue);
        }
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.b.length() > 0 && (c = c()) != null) {
            int intValue = c.intValue();
            q(intValue, intValue);
        }
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = fxb.c;
            this.f = sze.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = sze.a(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = fxb.c;
        return this.d.w((int) (j & 4294967295L));
    }
}
