package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o38  reason: default package */
/* loaded from: classes.dex */
public abstract class o38 {
    public static final gv7 a;

    static {
        gv7 gv7Var = h78.a;
        a = new gv7();
    }

    public static final void a(mq7 mq7Var, int i, int i2) {
        if (mq7Var instanceof m03) {
            m03 m03Var = (m03) mq7Var;
            int i3 = m03Var.K;
            b(mq7Var, i3 & i, i2);
            int i4 = (~i3) & i;
            for (mq7 mq7Var2 = m03Var.L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                a(mq7Var2, i4, i2);
            }
            return;
        }
        b(mq7Var, i & mq7Var.c, i2);
    }

    public static final void b(mq7 mq7Var, int i, int i2) {
        od6 v;
        if (i2 != 0 || mq7Var.w1()) {
            if ((i & 2) != 0 && (mq7Var instanceof fd6)) {
                ube.y((fd6) mq7Var);
                if (i2 == 2) {
                    voe.s(mq7Var, 2).Q1();
                }
            }
            if ((i & Token.CASE) != 0 && i2 != 2) {
                voe.v(mq7Var).G();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                voe.v(mq7Var).Z(false);
            }
            if ((i & 256) != 0 && (mq7Var instanceof hz4)) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        voe.v(mq7Var).f0(v.m0 - 1);
                    }
                } else {
                    od6 v2 = voe.v(mq7Var);
                    v2.f0(v2.m0 + 1);
                }
                if (i2 != 2) {
                    od6 v3 = voe.v(mq7Var);
                    if (v3.m0 != 0 && !v3.q() && !v3.r() && !v3.l0) {
                        rg rgVar = (rg) rd6.a(v3);
                        eb5 eb5Var = rgVar.o0.e;
                        eb5Var.getClass();
                        if (v3.m0 > 0) {
                            ((gw7) eb5Var.b).b(v3);
                            v3.l0 = true;
                        }
                        rgVar.K(null);
                    }
                }
            }
            if ((i & 4) != 0 && (mq7Var instanceof zj3)) {
                hud.o((zj3) mq7Var);
            }
            if ((i & 8) != 0 && (mq7Var instanceof z7a)) {
                voe.v(mq7Var).O = true;
            }
            if ((i & 64) != 0 && (mq7Var instanceof jm8)) {
                sd6 sd6Var = voe.v((jm8) mq7Var).d0;
                sd6Var.p.N = true;
                xy6 xy6Var = sd6Var.q;
                if (xy6Var != null) {
                    xy6Var.T = true;
                }
            }
            if ((i & 2048) != 0 && (mq7Var instanceof xm4)) {
                xm4 xm4Var = (xm4) mq7Var;
                x51.b = null;
                xm4Var.e0(x51.a);
                if (x51.b != null) {
                    mq7 mq7Var2 = (mq7) xm4Var;
                    if (!mq7Var2.a.J) {
                        lv5.c("visitChildren called on an unattached node");
                    }
                    gw7 gw7Var = new gw7(new mq7[16], 0);
                    mq7 mq7Var3 = mq7Var2.a;
                    mq7 mq7Var4 = mq7Var3.f;
                    if (mq7Var4 == null) {
                        voe.g(gw7Var, mq7Var3);
                    } else {
                        gw7Var.b(mq7Var4);
                    }
                    while (true) {
                        int i3 = gw7Var.c;
                        if (i3 == 0) {
                            break;
                        }
                        mq7 mq7Var5 = (mq7) gw7Var.k(i3 - 1);
                        if ((mq7Var5.d & 1024) == 0) {
                            voe.g(gw7Var, mq7Var5);
                        } else {
                            while (true) {
                                if (mq7Var5 == null) {
                                    break;
                                } else if ((mq7Var5.c & 1024) != 0) {
                                    gw7 gw7Var2 = null;
                                    while (mq7Var5 != null) {
                                        if (mq7Var5 instanceof hn4) {
                                            hn4 hn4Var = (hn4) mq7Var5;
                                            mm4 mm4Var = ((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).d;
                                            if (mm4Var.c.a(hn4Var)) {
                                                mm4Var.a();
                                            }
                                        } else if ((mq7Var5.c & 1024) != 0 && (mq7Var5 instanceof m03)) {
                                            int i4 = 0;
                                            for (mq7 mq7Var6 = ((m03) mq7Var5).L; mq7Var6 != null; mq7Var6 = mq7Var6.f) {
                                                if ((mq7Var6.c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        mq7Var5 = mq7Var6;
                                                    } else {
                                                        if (gw7Var2 == null) {
                                                            gw7Var2 = new gw7(new mq7[16], 0);
                                                        }
                                                        if (mq7Var5 != null) {
                                                            gw7Var2.b(mq7Var5);
                                                            mq7Var5 = null;
                                                        }
                                                        gw7Var2.b(mq7Var6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        mq7Var5 = voe.h(gw7Var2);
                                    }
                                } else {
                                    mq7Var5 = mq7Var5.f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (mq7Var instanceof fm4)) {
                fm4 fm4Var = (fm4) mq7Var;
                mm4 mm4Var2 = ((rm4) ((rg) voe.w(fm4Var)).getFocusOwner()).d;
                if (mm4Var2.d.a(fm4Var)) {
                    mm4Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (mq7Var instanceof su5) && i2 == 2) {
                ((su5) mq7Var).O0();
            }
        }
    }

    public static final void c(mq7 mq7Var) {
        if (!mq7Var.J) {
            lv5.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(mq7Var, -1, 0);
    }

    public static final int d(lq7 lq7Var) {
        int i;
        if (lq7Var instanceof dd6) {
            i = 3;
        } else {
            i = 1;
        }
        if (lq7Var instanceof gka) {
            i |= 4;
        }
        if (lq7Var instanceof x7a) {
            i |= 8;
        }
        if (lq7Var instanceof g19) {
            i |= 16;
        }
        if (lq7Var instanceof xb8) {
            i |= 256;
        }
        if (lq7Var instanceof im8) {
            i |= 64;
        }
        if (lq7Var instanceof vu0) {
            return 524288 | i;
        }
        return i;
    }

    public static final int e(mq7 mq7Var) {
        int i;
        int i2 = mq7Var.c;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = mq7Var.getClass();
        gv7 gv7Var = a;
        int d = gv7Var.d(cls);
        if (d >= 0) {
            return gv7Var.c[d];
        }
        if (mq7Var instanceof fd6) {
            i = 3;
        } else {
            i = 1;
        }
        if (mq7Var instanceof zj3) {
            i |= 4;
        }
        if (mq7Var instanceof z7a) {
            i |= 8;
        }
        if (mq7Var instanceof c19) {
            i |= 16;
        }
        if (mq7Var instanceof sq7) {
            i |= 32;
        }
        if (mq7Var instanceof jm8) {
            i |= 64;
        }
        if (mq7Var instanceof oc6) {
            i |= 4194432;
        } else if (mq7Var instanceof i37) {
            i |= Token.CASE;
        }
        if (mq7Var instanceof hz4) {
            i |= 256;
        }
        if (mq7Var instanceof cga) {
            i |= 512;
        }
        boolean z = mq7Var instanceof hn4;
        if (z) {
            i |= 1024;
        }
        if (mq7Var instanceof xm4) {
            i |= 2048;
        }
        if (mq7Var instanceof fm4) {
            i |= 4096;
        }
        if (mq7Var instanceof l86) {
            i |= 8192;
        }
        if (mq7Var instanceof eg) {
            i |= 16384;
        }
        if (mq7Var instanceof wx1) {
            i |= 32768;
        }
        if (mq7Var instanceof rnc) {
            i |= 262144;
        }
        if (mq7Var instanceof vu0) {
            i |= 524288;
        }
        if (z) {
            i |= 1048576;
        }
        if (mq7Var instanceof su5) {
            i |= 2097152;
        }
        if (mq7Var instanceof eh6) {
            i |= 8388608;
        }
        gv7Var.g(i, cls);
        return i;
    }

    public static final int f(mq7 mq7Var) {
        if (mq7Var instanceof m03) {
            m03 m03Var = (m03) mq7Var;
            int i = m03Var.K;
            for (mq7 mq7Var2 = m03Var.L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                i |= f(mq7Var2);
            }
            return i;
        }
        return e(mq7Var);
    }

    public static final boolean g(int i) {
        boolean z;
        boolean z2 = false;
        if ((i & Token.CASE) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4194304) != 0) {
            z2 = true;
        }
        return z | z2;
    }
}
