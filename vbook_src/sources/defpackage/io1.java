package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: io1  reason: default package */
/* loaded from: classes.dex */
public final class io1 extends t0 {
    public vt4 g0;
    public vt4 h0;
    public boolean i0;
    public final cv7 j0;
    public final cv7 k0;
    public z09 l0;
    public iya m0;
    public iya n0;
    public boolean o0;
    public boolean p0;
    public long q0;
    public boolean r0;
    public ku5 s0;
    public iya t0;
    public iya u0;
    public boolean v0;
    public boolean w0;
    public long x0;
    public boolean y0;

    public io1(vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, yu7 yu7Var, boolean z, boolean z2) {
        super(yu7Var, null, z, z2, null, null, vt4Var);
        this.g0 = vt4Var2;
        this.h0 = vt4Var3;
        this.i0 = true;
        cv7 cv7Var = zx6.a;
        this.j0 = new cv7();
        this.k0 = new cv7();
        this.q0 = -1L;
        this.x0 = -1L;
    }

    @Override // defpackage.mq7
    public final void B1() {
        c2();
    }

    @Override // defpackage.t0
    public final void K1(l8a l8aVar) {
        if (this.g0 != null) {
            ve veVar = new ve(this, 24);
            r76[] r76VarArr = j8a.a;
            l8aVar.a(s7a.c, new g4(null, veVar));
        }
    }

    @Override // defpackage.su5
    public final void O0() {
        Z1(true);
    }

    @Override // defpackage.t0
    public final void T1() {
        c2();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    @Override // defpackage.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U1(android.view.KeyEvent r8) {
        /*
            r7 = this;
            long r0 = defpackage.gae.i(r8)
            vt4 r8 = r7.g0
            r2 = 0
            if (r8 == 0) goto L25
            cv7 r8 = r7.j0
            java.lang.Object r3 = r8.e(r0)
            if (r3 != 0) goto L25
            m82 r3 = r7.v1()
            go1 r4 = new go1
            r5 = 4
            r4.<init>(r7, r2, r5)
            r5 = 3
            iya r3 = defpackage.z87.v(r3, r2, r2, r4, r5)
            r8.i(r3, r0)
            r8 = 1
            goto L26
        L25:
            r8 = 0
        L26:
            cv7 r3 = r7.k0
            java.lang.Object r4 = r3.e(r0)
            fo1 r4 = (defpackage.fo1) r4
            if (r4 == 0) goto L4b
            iya r5 = r4.a
            boolean r6 = r5.isActive()
            if (r6 == 0) goto L48
            r5.cancel(r2)
            boolean r2 = r4.b
            if (r2 != 0) goto L4b
            vt4 r7 = r7.S
            r7.invoke()
            r3.g(r0)
            return r8
        L48:
            r3.g(r0)
        L4b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io1.U1(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.t0
    public final void V1(KeyEvent keyEvent) {
        vt4 vt4Var;
        long i = gae.i(keyEvent);
        cv7 cv7Var = this.j0;
        boolean z = false;
        if (cv7Var.e(i) != null) {
            w26 w26Var = (w26) cv7Var.e(i);
            if (w26Var != null) {
                if (w26Var.isActive()) {
                    w26Var.cancel(null);
                } else {
                    z = true;
                }
            }
            cv7Var.g(i);
        }
        if (this.h0 != null) {
            cv7 cv7Var2 = this.k0;
            if (cv7Var2.e(i) == null) {
                if (!z) {
                    X1();
                    cv7Var2.i(new fo1(z87.v(v1(), null, null, new ho1(this, i, null), 3)), i);
                    return;
                }
                return;
            }
            if (!z && (vt4Var = this.h0) != null) {
                vt4Var.invoke();
            }
            cv7Var2.g(i);
        } else if (!z) {
            W1();
        }
    }

    @Override // defpackage.su5
    public final void Z(kj kjVar, s09 s09Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) kjVar.b;
        S1();
        if (this.R && this.V == null) {
            cx4 cx4Var = new cx4(this);
            H1(cx4Var);
            this.V = cx4Var;
        }
        int i = 0;
        if (s09Var == s09.b) {
            if (this.s0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (nye.o((ku5) arrayList.get(i2))) {
                        ku5 ku5Var = (ku5) arrayList.get(0);
                        ku5Var.i = true;
                        this.s0 = ku5Var;
                        if (this.R) {
                            iya iyaVar = this.u0;
                            if (iyaVar != null && iyaVar.isActive()) {
                                ((ucd) nye.q(this, dy1.t)).getClass();
                                if (ku5Var.b - this.x0 < 40) {
                                    this.y0 = true;
                                    return;
                                }
                                this.v0 = true;
                                iya iyaVar2 = this.u0;
                                if (iyaVar2 != null) {
                                    iyaVar2.cancel(null);
                                }
                                this.u0 = null;
                            }
                            this.w0 = false;
                            Q1(ku5Var);
                            if (this.g0 != null) {
                                this.t0 = z87.v(v1(), null, null, new go1(this, null, 1), 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            } else if (this.w0) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ku5 ku5Var2 = (ku5) arrayList.get(i3);
                    if (!ku5Var2.h || ku5Var2.d) {
                        int size3 = arrayList.size();
                        while (i < size3) {
                            ((ku5) arrayList.get(i)).i = true;
                            i++;
                        }
                        return;
                    }
                }
                ku5 ku5Var3 = (ku5) arrayList.get(0);
                ku5Var3.i = true;
                long j = ku5Var3.b;
                ku5 ku5Var4 = this.s0;
                ku5Var4.getClass();
                a2(j, ku5Var4);
            } else {
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ku5 ku5Var5 = (ku5) arrayList.get(i4);
                    if (ku5Var5.i || !ku5Var5.h || ku5Var5.d) {
                        float f = ((ucd) nye.q(this, dy1.t)).f();
                        int size5 = arrayList.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            ku5 ku5Var6 = (ku5) arrayList.get(i5);
                            long j2 = ku5Var6.c;
                            ku5 ku5Var7 = this.s0;
                            ku5Var7.getClass();
                            if (Math.abs(y78.e(y78.i(j2, ku5Var7.c))) > f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (ku5Var6.i || z) {
                                Z1(true);
                                return;
                            }
                        }
                        return;
                    }
                }
                ku5 ku5Var8 = (ku5) arrayList.get(0);
                ku5Var8.i = true;
                long j3 = ku5Var8.b;
                ku5 ku5Var9 = this.s0;
                ku5Var9.getClass();
                a2(j3, ku5Var9);
            }
        } else if (s09Var == s09.c && this.s0 != null && !this.w0) {
            int size6 = arrayList.size();
            while (i < size6) {
                ku5 ku5Var10 = (ku5) arrayList.get(i);
                if (ku5Var10.i && ku5Var10 != this.s0) {
                    Z1(true);
                    return;
                }
                i++;
            }
        }
    }

    public final void Z1(boolean z) {
        if (z) {
            this.s0 = null;
            iya iyaVar = this.t0;
            if (iyaVar != null) {
                iyaVar.cancel(null);
            }
            this.t0 = null;
            iya iyaVar2 = this.u0;
            if (iyaVar2 != null) {
                iyaVar2.cancel(null);
            }
            this.u0 = null;
            this.v0 = false;
            this.w0 = false;
            this.x0 = -1L;
            this.y0 = false;
        } else {
            this.l0 = null;
            iya iyaVar3 = this.m0;
            if (iyaVar3 != null) {
                iyaVar3.cancel(null);
            }
            this.m0 = null;
            iya iyaVar4 = this.n0;
            if (iyaVar4 != null) {
                iyaVar4.cancel(null);
            }
            this.n0 = null;
            this.o0 = false;
            this.p0 = false;
            this.q0 = -1L;
            this.r0 = false;
        }
        O1(z);
    }

    public final void a2(long j, ku5 ku5Var) {
        if (this.R && !this.y0) {
            P1(true, ku5Var.c);
            this.x0 = j;
            if (!this.w0) {
                boolean z = this.v0;
                vt4 vt4Var = this.h0;
                if (z) {
                    if (vt4Var != null) {
                        vt4Var.invoke();
                    }
                } else if (vt4Var != null) {
                    X1();
                    this.u0 = z87.v(v1(), null, null, new go1(this, null, 3), 3);
                } else {
                    W1();
                }
            }
        }
        this.s0 = null;
        this.y0 = false;
        this.v0 = false;
        iya iyaVar = this.t0;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.t0 = null;
        this.w0 = false;
    }

    @Override // defpackage.t0, defpackage.c19
    public final void b0(r09 r09Var, s09 s09Var, long j) {
        boolean z;
        super.b0(r09Var, s09Var, j);
        if (s09Var == s09.b) {
            if (this.l0 == null) {
                if (ukb.f(r09Var, true, false)) {
                    z09 z09Var = (z09) r09Var.a.get(0);
                    z09Var.a();
                    this.l0 = z09Var;
                    if (this.R) {
                        iya iyaVar = this.n0;
                        if (iyaVar != null && iyaVar.isActive()) {
                            ((ucd) nye.q(this, dy1.t)).getClass();
                            if (z09Var.b - this.q0 < 40) {
                                this.r0 = true;
                                return;
                            }
                            this.o0 = true;
                            iya iyaVar2 = this.n0;
                            if (iyaVar2 != null) {
                                iyaVar2.cancel(null);
                            }
                            this.n0 = null;
                        }
                        this.p0 = false;
                        R1(z09Var);
                        if (this.g0 != null) {
                            this.m0 = z87.v(v1(), null, null, new go1(this, null, 0), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (r09Var.c == 2) {
                z = true;
            } else {
                z = false;
            }
            List list = r09Var.a;
            if (z && !this.p0 && this.R && this.g0 != null) {
                iya iyaVar3 = this.m0;
                if (iyaVar3 != null) {
                    iyaVar3.cancel(null);
                }
                this.m0 = null;
                vt4 vt4Var = this.g0;
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                if (this.i0) {
                    ((dx8) ((s35) nye.q(this, dy1.l))).a(0);
                }
                this.p0 = true;
            }
            if (this.p0) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!ie2.m((z09) list.get(i))) {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((z09) list.get(i2)).a();
                        }
                        return;
                    }
                }
                z09 z09Var2 = (z09) list.get(0);
                z09Var2.a();
                long j2 = z09Var2.b;
                z09 z09Var3 = this.l0;
                z09Var3.getClass();
                b2(j2, z09Var3);
                return;
            }
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (!ie2.l((z09) list.get(i3))) {
                    long N1 = N1(j);
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        z09 z09Var4 = (z09) list.get(i4);
                        if (z09Var4.c() || ie2.w(z09Var4, j, N1)) {
                            Z1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            z09 z09Var5 = (z09) list.get(0);
            z09Var5.a();
            long j3 = z09Var5.b;
            z09 z09Var6 = this.l0;
            z09Var6.getClass();
            b2(j3, z09Var6);
        } else if (s09Var == s09.c && this.l0 != null && !this.p0) {
            List list2 = r09Var.a;
            int size5 = list2.size();
            for (int i5 = 0; i5 < size5; i5++) {
                z09 z09Var7 = (z09) list2.get(i5);
                if (z09Var7.c() && z09Var7 != this.l0) {
                    Z1(false);
                    return;
                }
            }
        }
    }

    public final void b2(long j, z09 z09Var) {
        if (this.R && !this.r0) {
            P1(false, z09Var.c);
            this.q0 = j;
            if (!this.p0) {
                boolean z = this.o0;
                vt4 vt4Var = this.h0;
                if (z) {
                    if (vt4Var != null) {
                        vt4Var.invoke();
                    }
                } else if (vt4Var != null) {
                    X1();
                    this.n0 = z87.v(v1(), null, null, new go1(this, null, 2), 3);
                } else {
                    W1();
                }
            }
        }
        this.l0 = null;
        this.r0 = false;
        this.o0 = false;
        iya iyaVar = this.m0;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.m0 = null;
        this.p0 = false;
    }

    public final void c2() {
        char c;
        long j;
        long j2;
        char c2;
        cv7 cv7Var = this.j0;
        Object[] objArr = cv7Var.c;
        long[] jArr = cv7Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((w26) objArr[(i << 3) + i3]).cancel(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        cv7Var.a();
        cv7 cv7Var2 = this.k0;
        Object[] objArr2 = cv7Var2.c;
        long[] jArr2 = cv7Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((fo1) objArr2[(i4 << 3) + i6]).a.cancel(null);
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                }
                i4++;
            }
        }
        cv7Var2.a();
    }

    @Override // defpackage.c19
    public final void n0() {
        ga5 ga5Var;
        yu7 yu7Var = this.M;
        if (yu7Var != null && (ga5Var = this.Z) != null) {
            yu7Var.c(new ha5(ga5Var));
        }
        this.Z = null;
        Z1(false);
    }
}
