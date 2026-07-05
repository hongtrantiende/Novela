package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pn  reason: default package */
/* loaded from: classes.dex */
public final class pn extends TextPaint {
    public ljc a;
    public gpb b;
    public int c;
    public nea d;
    public zl1 e;
    public hy0 f;
    public h23 g;
    public dna h;
    public bk3 i;

    public final ljc a() {
        ljc ljcVar = this.a;
        if (ljcVar != null) {
            return ljcVar;
        }
        ljc ljcVar2 = new ljc(this);
        this.a = ljcVar2;
        return ljcVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().o(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r1 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.hy0 r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.esa
            if (r1 == 0) goto L1d
            esa r6 = (defpackage.esa) r6
            long r6 = r6.a
            long r6 = defpackage.twe.p(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.jea
            if (r1 == 0) goto L6e
            hy0 r1 = r5.f
            boolean r1 = defpackage.c16.i(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            dna r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.dna.a(r3, r7)
        L36:
            if (r1 != 0) goto L55
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            r5.f = r6
            dna r1 = new dna
            r1.<init>(r7)
            r5.h = r1
            on r1 = new on
            r1.<init>(r6, r7, r2)
            h23 r6 = defpackage.yae.q(r1)
            r5.g = r6
        L55:
            ljc r6 = r5.a()
            h23 r7 = r5.g
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L65
        L64:
            r7 = r0
        L65:
            r6.t(r7)
            r5.e = r0
            defpackage.rse.j(r5, r9)
            return
        L6e:
            defpackage.xk5.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn.c(hy0, long, float):void");
    }

    public final void d(long j) {
        boolean c;
        zl1 zl1Var = this.e;
        if (zl1Var == null) {
            c = false;
        } else {
            c = zl1.c(zl1Var.a, j);
        }
        if (!c && j != 16) {
            this.e = new zl1(j);
            setColor(sve.x(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(bk3 bk3Var) {
        if (bk3Var != null && !c16.i(this.i, bk3Var)) {
            this.i = bk3Var;
            if (bk3Var.equals(ye4.a)) {
                setStyle(Paint.Style.FILL);
            } else if (bk3Var instanceof s4b) {
                a().x(1);
                s4b s4bVar = (s4b) bk3Var;
                a().w(s4bVar.a);
                ljc a = a();
                ((Paint) a.b).setStrokeMiter(s4bVar.b);
                a().v(s4bVar.d);
                a().u(s4bVar.c);
                a().s(s4bVar.e);
            } else {
                xk5.o();
            }
        }
    }

    public final void f(nea neaVar) {
        if (neaVar != null && !c16.i(this.d, neaVar)) {
            this.d = neaVar;
            if (neaVar.equals(nea.d)) {
                clearShadowLayer();
                return;
            }
            nea neaVar2 = this.d;
            float f = neaVar2.c;
            if (f == nae.e) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, Float.intBitsToFloat((int) (neaVar2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), sve.x(this.d.a));
        }
    }

    public final void g(gpb gpbVar) {
        boolean z;
        if (gpbVar != null && !c16.i(this.b, gpbVar)) {
            this.b = gpbVar;
            int i = gpbVar.a;
            boolean z2 = false;
            if ((i | 1) == i) {
                z = true;
            } else {
                z = false;
            }
            setUnderlineText(z);
            int i2 = this.b.a;
            if ((i2 | 2) == i2) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}
