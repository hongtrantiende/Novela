package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hn4 */
/* loaded from: classes.dex */
public final class hn4 extends mq7 implements wx1, r78, sq7, f03 {
    public final boolean K;
    public final lu4 L;
    public boolean M;
    public boolean N;
    public final int O;
    public wx9 P;

    public hn4(int i, lu4 lu4Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        lu4Var = (i2 & 4) != 0 ? null : lu4Var;
        this.K = z;
        this.L = lu4Var;
        this.O = i;
    }

    public static /* synthetic */ boolean P1(hn4 hn4Var) {
        return hn4Var.O1(7);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x005d  */
    @Override // defpackage.mq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1() {
        /*
            r4 = this;
            dn4 r0 = r4.M1()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 == r2) goto L39
            r1 = 3
            if (r0 != r1) goto L14
            goto L59
        L14:
            defpackage.xk5.o()
            return
        L18:
            wg8 r0 = defpackage.voe.w(r4)
            rg r0 = (defpackage.rg) r0
            pm4 r0 = r0.getFocusOwner()
            hn4 r2 = defpackage.dae.j(r4)
            if (r2 == 0) goto L59
            boolean r2 = r2.K
            if (r2 != r1) goto L59
            rm4 r0 = (defpackage.rm4) r0
            rg r1 = r0.a
            r1.I()
            mm4 r0 = r0.d
            r0.a()
            goto L59
        L39:
            wg8 r0 = defpackage.voe.w(r4)
            rg r0 = (defpackage.rg) r0
            pm4 r0 = r0.getFocusOwner()
            rm4 r0 = (defpackage.rm4) r0
            r2 = 8
            r3 = 0
            r0.b(r2, r1, r3)
            boolean r1 = r4.K
            if (r1 == 0) goto L54
            rg r1 = r0.a
            r1.I()
        L54:
            mm4 r0 = r0.d
            r0.a()
        L59:
            wx9 r0 = r4.P
            if (r0 == 0) goto L62
            yx9 r0 = (defpackage.yx9) r0
            r0.o()
        L62:
            r0 = 0
            r4.P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn4.A1():void");
    }

    @Override // defpackage.mq7
    public final void B1() {
        if (M1().b()) {
            ((rm4) ((rg) voe.w(this)).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean H1(int i) {
        int ordinal = cae.x(this, i).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                if (ordinal != 3) {
                    xk5.o();
                    return false;
                }
                return false;
            }
            return false;
        }
        return cae.y(this);
    }

    public final void I1(dn4 dn4Var, dn4 dn4Var2) {
        kn knVar;
        lu4 lu4Var;
        rm4 rm4Var = (rm4) ((rg) voe.w(this)).getFocusOwner();
        hn4 f = rm4Var.f();
        if (!dn4Var.equals(dn4Var2) && (lu4Var = this.L) != null) {
            lu4Var.invoke(dn4Var, dn4Var2);
        }
        mq7 mq7Var = this.a;
        if (!mq7Var.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var2 = this.a;
        od6 v = voe.v(this);
        while (v != null) {
            if ((((mq7) v.c0.C).d & 5120) != 0) {
                while (mq7Var2 != null) {
                    int i = mq7Var2.c;
                    if ((i & 5120) != 0) {
                        if (mq7Var2 == mq7Var || (i & 1024) == 0) {
                            if ((i & 4096) != 0) {
                                mq7 mq7Var3 = mq7Var2;
                                gw7 gw7Var = null;
                                while (mq7Var3 != null) {
                                    if (mq7Var3 instanceof fm4) {
                                        fm4 fm4Var = (fm4) mq7Var3;
                                        if (f == rm4Var.f()) {
                                            fm4Var.h0(dn4Var2);
                                        }
                                    } else if ((mq7Var3.c & 4096) != 0 && (mq7Var3 instanceof m03)) {
                                        int i2 = 0;
                                        for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                            if ((mq7Var4.c & 4096) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    mq7Var3 = mq7Var4;
                                                } else {
                                                    if (gw7Var == null) {
                                                        gw7Var = new gw7(new mq7[16], 0);
                                                    }
                                                    if (mq7Var3 != null) {
                                                        gw7Var.b(mq7Var3);
                                                        mq7Var3 = null;
                                                    }
                                                    gw7Var.b(mq7Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    mq7Var3 = voe.h(gw7Var);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    mq7Var2 = mq7Var2.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var2 = (hkb) knVar.f;
            } else {
                mq7Var2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tm4, vm4] */
    public final vm4 J1() {
        boolean z;
        boolean z2;
        kn knVar;
        ?? obj = new Object();
        obj.a = true;
        zm4 zm4Var = zm4.b;
        obj.b = zm4Var;
        obj.c = zm4Var;
        obj.d = zm4Var;
        obj.e = zm4Var;
        obj.f = zm4Var;
        obj.g = zm4Var;
        obj.h = zm4Var;
        obj.i = zm4Var;
        obj.j = vt3.f;
        obj.k = vt3.C;
        obj.l = j55.f;
        int i = this.O;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            if (((mw5) ((ow5) ((nw5) nye.q(this, dy1.m))).a.getValue()).a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = !z2;
        } else if (i == 2) {
            z = false;
        } else {
            vs.k("Unknown Focusability");
            return null;
        }
        obj.a = z;
        mq7 mq7Var = this.a;
        if (!mq7Var.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var2 = this.a;
        od6 v = voe.v(this);
        loop0: while (v != null) {
            if ((((mq7) v.c0.C).d & 3072) != 0) {
                while (mq7Var2 != null) {
                    int i2 = mq7Var2.c;
                    if ((i2 & 3072) != 0) {
                        if (mq7Var2 != mq7Var && (i2 & 1024) != 0) {
                            break loop0;
                        } else if ((i2 & 2048) != 0) {
                            gw7 gw7Var = null;
                            mq7 mq7Var3 = mq7Var2;
                            while (mq7Var3 != null) {
                                if (mq7Var3 instanceof xm4) {
                                    ((xm4) mq7Var3).e0(obj);
                                } else if ((mq7Var3.c & 2048) != 0 && (mq7Var3 instanceof m03)) {
                                    int i3 = 0;
                                    for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                        if ((mq7Var4.c & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                mq7Var3 = mq7Var4;
                                            } else {
                                                if (gw7Var == null) {
                                                    gw7Var = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var3 != null) {
                                                    gw7Var.b(mq7Var3);
                                                    mq7Var3 = null;
                                                }
                                                gw7Var.b(mq7Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                mq7Var3 = voe.h(gw7Var);
                            }
                        }
                    }
                    mq7Var2 = mq7Var2.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var2 = (hkb) knVar.f;
            } else {
                mq7Var2 = null;
            }
        }
        return obj;
    }

    public final rk9 K1(sc6 sc6Var) {
        rk9 rk9Var = J1().l;
        if (rk9Var != j55.f) {
            if (sc6Var == null) {
                return rk9Var;
            }
            return rk9Var.o(sc6.o(sc6Var, voe.u(this), 6));
        } else if (sc6Var != null) {
            return sc6Var.g0(voe.u(this), false);
        } else {
            return npe.n(0L, eg0.A(voe.u(this).c));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x009f, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eh6 L1() {
        /*
            r6 = this;
            mq7 r0 = r6.a
            boolean r0 = r0.J
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.lv5.c(r0)
        Lb:
            mq7 r0 = r6.a
            mq7 r0 = r0.e
            od6 r6 = defpackage.voe.v(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto L9f
            kn r2 = r6.c0
            java.lang.Object r2 = r2.C
            mq7 r2 = (defpackage.mq7) r2
            int r2 = r2.d
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8c
        L24:
            if (r0 == 0) goto L8c
            int r2 = r0.c
            r4 = r2 & r3
            if (r4 == 0) goto L89
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4f
            boolean r6 = r0 instanceof defpackage.eh6
            if (r6 == 0) goto L36
            goto L4a
        L36:
            boolean r6 = r0 instanceof defpackage.m03
            if (r6 == 0) goto L49
            m03 r0 = (defpackage.m03) r0
            mq7 r6 = r0.L
            r0 = r1
        L3f:
            if (r6 == 0) goto L4a
            boolean r2 = r6 instanceof defpackage.eh6
            if (r2 == 0) goto L46
            r0 = r6
        L46:
            mq7 r6 = r6.f
            goto L3f
        L49:
            r0 = r1
        L4a:
            eh6 r0 = (defpackage.eh6) r0
            if (r0 == 0) goto L9f
            return r0
        L4f:
            r2 = r2 & 32
            if (r2 == 0) goto L89
            boolean r2 = r0 instanceof defpackage.sq7
            if (r2 == 0) goto L59
            r4 = r0
            goto L6e
        L59:
            boolean r2 = r0 instanceof defpackage.m03
            if (r2 == 0) goto L6d
            r2 = r0
            m03 r2 = (defpackage.m03) r2
            mq7 r2 = r2.L
            r4 = r1
        L63:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof defpackage.sq7
            if (r5 == 0) goto L6a
            r4 = r2
        L6a:
            mq7 r2 = r2.f
            goto L63
        L6d:
            r4 = r1
        L6e:
            sq7 r4 = (defpackage.sq7) r4
            if (r4 == 0) goto L89
            xpe r2 = r4.E0()
            g99 r5 = defpackage.jk0.a
            boolean r2 = r2.e(r5)
            if (r2 == 0) goto L89
            xpe r6 = r4.E0()
            java.lang.Object r6 = r6.g(r5)
            eh6 r6 = (defpackage.eh6) r6
            return r6
        L89:
            mq7 r0 = r0.e
            goto L24
        L8c:
            od6 r6 = r6.v()
            if (r6 == 0) goto L9c
            kn r0 = r6.c0
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r0.f
            hkb r0 = (defpackage.hkb) r0
            goto L13
        L9c:
            r0 = r1
            goto L13
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn4.L1():eh6");
    }

    public final dn4 M1() {
        kn knVar;
        boolean z = this.J;
        dn4 dn4Var = dn4.c;
        if (!z) {
            return dn4Var;
        }
        hn4 f = ((rm4) ((rg) voe.w(this)).getFocusOwner()).f();
        if (f == null) {
            return dn4Var;
        }
        if (this == f) {
            return dn4.a;
        }
        if (f.J) {
            if (!f.a.J) {
                lv5.c("visitAncestors called on an unattached node");
            }
            mq7 mq7Var = f.a.e;
            od6 v = voe.v(f);
            while (v != null) {
                if ((((mq7) v.c0.C).d & 1024) != 0) {
                    while (mq7Var != null) {
                        if ((mq7Var.c & 1024) != 0) {
                            mq7 mq7Var2 = mq7Var;
                            gw7 gw7Var = null;
                            while (mq7Var2 != null) {
                                if (mq7Var2 instanceof hn4) {
                                    if (this == ((hn4) mq7Var2)) {
                                        return dn4.b;
                                    }
                                } else if ((mq7Var2.c & 1024) != 0 && (mq7Var2 instanceof m03)) {
                                    int i = 0;
                                    for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                        if ((mq7Var3.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                mq7Var2 = mq7Var3;
                                            } else {
                                                if (gw7Var == null) {
                                                    gw7Var = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var2 != null) {
                                                    gw7Var.b(mq7Var2);
                                                    mq7Var2 = null;
                                                }
                                                gw7Var.b(mq7Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                mq7Var2 = voe.h(gw7Var);
                            }
                            continue;
                        }
                        mq7Var = mq7Var.e;
                    }
                }
                v = v.v();
                if (v != null && (knVar = v.c0) != null) {
                    mq7Var = (hkb) knVar.f;
                } else {
                    mq7Var = null;
                }
            }
        }
        return dn4Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [zl9, java.lang.Object] */
    public final void N1() {
        int ordinal = M1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        xk5.o();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        ?? obj = new Object();
        iue.R(this, new hg(16, obj, this));
        Object obj2 = obj.a;
        if (obj2 != null) {
            if (!((tm4) obj2).b()) {
                ((rm4) ((rg) voe.w(this)).getFocusOwner()).b(8, true, true);
                return;
            }
            return;
        }
        c16.w("focusProperties");
        throw null;
    }

    public final boolean O1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (J1().a) {
                return H1(i);
            }
            return yae.t(this, i, new ng(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.r78
    public final void S0() {
        N1();
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
    }
}
