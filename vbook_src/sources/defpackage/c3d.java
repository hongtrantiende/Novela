package defpackage;

import java.io.EOFException;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c3d  reason: default package */
/* loaded from: classes3.dex */
public final class c3d implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs9 b;
    public final /* synthetic */ d3d c;
    public final /* synthetic */ wj9 d;
    public final /* synthetic */ d3d e;

    public /* synthetic */ c3d(cs9 cs9Var, d3d d3dVar, wj9 wj9Var, d3d d3dVar2, int i) {
        this.a = i;
        this.b = cs9Var;
        this.c = d3dVar;
        this.d = wj9Var;
        this.e = d3dVar2;
    }

    private final Object a(Object obj) {
        ((vjc) obj).getClass();
        cs9 cs9Var = this.b;
        cs9 cs9Var2 = cs9.a;
        d3d d3dVar = this.e;
        if (cs9Var == cs9Var2) {
            d3dVar.a.P.e0();
        }
        try {
            s46 s46Var = this.c.b;
            wj9 wj9Var = this.d;
            s46Var.getClass();
            Iterator it = ((k02) ie2.p(s46Var, wj9Var, mdb.Companion.serializer())).iterator();
            while (it.hasNext()) {
                try {
                    mdb mdbVar = (mdb) it.next();
                    lm2 lm2Var = d3dVar.a.P;
                    mdbVar.getClass();
                    lm2Var.t0(new ap2(mdbVar.c, mdbVar.d, mdbVar.a, mdbVar.b));
                } catch (Throwable unused) {
                }
            }
        } catch (EOFException | v9a unused2) {
        }
        return pvc.a;
    }

    private final Object b(Object obj) {
        Set set;
        boolean z;
        ((vjc) obj).getClass();
        cs9 cs9Var = cs9.a;
        d3d d3dVar = this.e;
        cs9 cs9Var2 = this.b;
        if (cs9Var2 == cs9Var) {
            d3dVar.a.Q.c0("general");
        }
        cs9 cs9Var3 = cs9.c;
        if (cs9Var2 == cs9Var3) {
            gk2 gk2Var = d3dVar.a.Q;
            gk2Var.getClass();
            set = sl1.A0(new ep2(gk2Var, new yo2(10)).c());
        } else {
            set = rs3.a;
        }
        try {
            s46 s46Var = this.c.b;
            wj9 wj9Var = this.d;
            s46Var.getClass();
            Iterator it = ((k02) ie2.p(s46Var, wj9Var, pdb.Companion.serializer())).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (cs9Var2 == cs9Var3) {
                    if (!set.isEmpty()) {
                        z = set.contains(((pdb) next).b);
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                try {
                    d3dVar.a.Q.E0(obe.w((pdb) next, "general"));
                } catch (Throwable unused) {
                }
            }
        } catch (EOFException | v9a unused2) {
        }
        return pvc.a;
    }

    private final Object e(Object obj) {
        ((vjc) obj).getClass();
        cs9 cs9Var = this.b;
        cs9 cs9Var2 = cs9.a;
        d3d d3dVar = this.e;
        if (cs9Var == cs9Var2) {
            lm2 lm2Var = d3dVar.a.R;
            ((mm) lm2Var.a).q(1207497385, "DELETE FROM DbReadHistory", null);
            lm2Var.C(1207497385, new yo2(12));
        }
        try {
            s46 s46Var = this.c.b;
            wj9 wj9Var = this.d;
            s46Var.getClass();
            Iterator it = ((k02) ie2.p(s46Var, wj9Var, sdb.Companion.serializer())).iterator();
            while (it.hasNext()) {
                try {
                    sdb sdbVar = (sdb) it.next();
                    lm2 lm2Var2 = d3dVar.a.R;
                    sdbVar.getClass();
                    lm2Var2.o0(new lp2(sdbVar.a, sdbVar.b, sdbVar.c, sdbVar.d));
                } catch (Throwable unused) {
                }
            }
        } catch (EOFException | v9a unused2) {
        }
        return pvc.a;
    }

    private final Object f(Object obj) {
        ((vjc) obj).getClass();
        cs9 cs9Var = this.b;
        cs9 cs9Var2 = cs9.a;
        d3d d3dVar = this.e;
        if (cs9Var == cs9Var2) {
            lm2 lm2Var = d3dVar.a.S;
            ((mm) lm2Var.a).q(1362964993, "DELETE FROM DbSearch", null);
            lm2Var.C(1362964993, new yo2(18));
        }
        try {
            s46 s46Var = this.c.b;
            wj9 wj9Var = this.d;
            s46Var.getClass();
            Iterator it = ((k02) ie2.p(s46Var, wj9Var, reb.Companion.serializer())).iterator();
            while (it.hasNext()) {
                try {
                    reb rebVar = (reb) it.next();
                    lm2 lm2Var2 = d3dVar.a.S;
                    rebVar.getClass();
                    lm2Var2.p0(new np2(rebVar.a, rebVar.b));
                } catch (Throwable unused) {
                }
            }
        } catch (EOFException | v9a unused2) {
        }
        return pvc.a;
    }

    private final Object g(Object obj) {
        ((vjc) obj).getClass();
        cs9 cs9Var = this.b;
        cs9 cs9Var2 = cs9.a;
        d3d d3dVar = this.e;
        if (cs9Var == cs9Var2) {
            gk2 gk2Var = d3dVar.a.V;
            ((mm) gk2Var.a).q(-1669278961, "DELETE FROM DbTrash", null);
            gk2Var.C(-1669278961, new yo2(29));
        }
        try {
            s46 s46Var = this.c.b;
            wj9 wj9Var = this.d;
            s46Var.getClass();
            Iterator it = ((k02) ie2.p(s46Var, wj9Var, jfb.Companion.serializer())).iterator();
            while (it.hasNext()) {
                try {
                    jfb jfbVar = (jfb) it.next();
                    gk2 gk2Var2 = d3dVar.a.V;
                    jfbVar.getClass();
                    String str = jfbVar.a;
                    String str2 = jfbVar.b;
                    String str3 = jfbVar.c;
                    gk2Var2.G0(new zp2(jfbVar.d, jfbVar.f, jfbVar.g, str, str2, str3, jfbVar.e));
                } catch (Throwable unused) {
                }
            }
        } catch (EOFException | v9a unused2) {
        }
        return pvc.a;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = this.a;
        Set set = rs3.a;
        cs9 cs9Var = cs9.c;
        pvc pvcVar = pvc.a;
        wj9 wj9Var = this.d;
        d3d d3dVar = this.c;
        cs9 cs9Var2 = cs9.a;
        cs9 cs9Var3 = this.b;
        d3d d3dVar2 = this.e;
        switch (i) {
            case 0:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    lm2 lm2Var = d3dVar2.a.e;
                    ((mm) lm2Var.a).q(337796343, "DELETE FROM DbBrowserHistory", null);
                    lm2Var.C(337796343, new fm2(0));
                }
                try {
                    s46 s46Var = d3dVar.b;
                    s46Var.getClass();
                    Iterator it = ((k02) ie2.p(s46Var, wj9Var, cbb.Companion.serializer())).iterator();
                    while (it.hasNext()) {
                        try {
                            cbb cbbVar = (cbb) it.next();
                            lm2 lm2Var2 = d3dVar2.a.e;
                            cbbVar.getClass();
                            lm2Var2.r0(new em2(cbbVar.c, cbbVar.a, cbbVar.b));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (EOFException | v9a unused2) {
                }
                return pvcVar;
            case 1:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.f.c0();
                }
                if (cs9Var3 == cs9Var) {
                    mm mmVar = (mm) d3dVar2.a.f.a;
                    fm2 fm2Var = new fm2(11);
                    mmVar.getClass();
                    set = sl1.A0(new xla(522277506, new String[]{"DbCategory"}, mmVar, "DbCategory.sq", "getAllIds", "SELECT id\nFROM DbCategory", fm2Var).c());
                }
                try {
                    s46 s46Var2 = d3dVar.b;
                    s46Var2.getClass();
                    Iterator it2 = ((k02) ie2.p(s46Var2, wj9Var, fbb.Companion.serializer())).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (cs9Var3 == cs9Var) {
                            if (!set.isEmpty()) {
                                z = set.contains(((fbb) next).a);
                            } else {
                                z = false;
                            }
                            if (z) {
                            }
                        }
                        try {
                            fbb fbbVar = (fbb) next;
                            lm2 lm2Var3 = d3dVar2.a.f;
                            fbbVar.getClass();
                            lm2Var3.j0(new mm2(fbbVar.c, fbbVar.a, fbbVar.b));
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (EOFException | v9a unused4) {
                }
                return pvcVar;
            case 2:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.E.a0();
                }
                try {
                    s46 s46Var3 = d3dVar.b;
                    s46Var3.getClass();
                    Iterator it3 = ((k02) ie2.p(s46Var3, wj9Var, rbb.Companion.serializer())).iterator();
                    while (it3.hasNext()) {
                        try {
                            rbb rbbVar = (rbb) it3.next();
                            lm2 lm2Var4 = d3dVar2.a.E;
                            rbbVar.getClass();
                            lm2Var4.k0(new cn2(rbbVar.a, rbbVar.b, rbbVar.c, rbbVar.d, rbbVar.e, rbbVar.f, rbbVar.g));
                        } catch (Throwable unused5) {
                        }
                    }
                } catch (EOFException | v9a unused6) {
                }
                return pvcVar;
            case 3:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.F.b0();
                }
                if (cs9Var3 == cs9Var) {
                    mm mmVar2 = (mm) d3dVar2.a.F.a;
                    hn2 hn2Var = new hn2(5);
                    mmVar2.getClass();
                    set = sl1.A0(new xla(1027725112, new String[]{"DbDownload"}, mmVar2, "DbDownload.sq", "getAllIds", "SELECT id\nFROM DbDownload", hn2Var).c());
                }
                try {
                    s46 s46Var4 = d3dVar.b;
                    s46Var4.getClass();
                    Iterator it4 = ((k02) ie2.p(s46Var4, wj9Var, ubb.Companion.serializer())).iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        if (cs9Var3 == cs9Var) {
                            if (!set.isEmpty()) {
                                z2 = set.contains(((ubb) next2).a);
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                        try {
                            d3dVar2.a.F.A0(kte.f((ubb) next2));
                        } catch (Throwable unused7) {
                        }
                    }
                } catch (EOFException | v9a unused8) {
                }
                return pvcVar;
            case 4:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    lm2 lm2Var5 = d3dVar2.a.H;
                    ((mm) lm2Var5.a).q(-1422933149, "DELETE FROM DbEmojiCategory", null);
                    lm2Var5.C(-1422933149, new hn2(8));
                }
                try {
                    s46 s46Var5 = d3dVar.b;
                    s46Var5.getClass();
                    Iterator it5 = ((k02) ie2.p(s46Var5, wj9Var, acb.Companion.serializer())).iterator();
                    while (it5.hasNext()) {
                        try {
                            acb acbVar = (acb) it5.next();
                            lm2 lm2Var6 = d3dVar2.a.H;
                            acbVar.getClass();
                            lm2Var6.Y(new pn2(acbVar.c, acbVar.d, acbVar.a, acbVar.b));
                        } catch (Throwable unused9) {
                        }
                    }
                } catch (EOFException | v9a unused10) {
                }
                return pvcVar;
            case 5:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    lm2 lm2Var7 = d3dVar2.a.G;
                    ((mm) lm2Var7.a).q(-1815843647, "DELETE FROM DbEmoji", null);
                    lm2Var7.C(-1815843647, new hn2(14));
                }
                try {
                    s46 s46Var6 = d3dVar.b;
                    s46Var6.getClass();
                    Iterator it6 = ((k02) ie2.p(s46Var6, wj9Var, xbb.Companion.serializer())).iterator();
                    while (it6.hasNext()) {
                        try {
                            xbb xbbVar = (xbb) it6.next();
                            lm2 lm2Var8 = d3dVar2.a.G;
                            xbbVar.getClass();
                            lm2Var8.Z(new on2(xbbVar.d, xbbVar.a, xbbVar.b, xbbVar.c));
                        } catch (Throwable unused11) {
                        }
                    }
                } catch (EOFException | v9a unused12) {
                }
                return pvcVar;
            case 6:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    lm2 lm2Var9 = d3dVar2.a.J;
                    ((mm) lm2Var9.a).q(-1674661064, "DELETE FROM DbExtensionLocalStorage", null);
                    lm2Var9.C(-1674661064, new hn2(23));
                }
                if (cs9Var3 == cs9Var) {
                    mm mmVar3 = (mm) d3dVar2.a.J.a;
                    hn2 hn2Var2 = new hn2(20);
                    mmVar3.getClass();
                    set = sl1.A0(new xla(-1034816625, new String[]{"DbExtensionLocalStorage"}, mmVar3, "DbExtensionLocalStorage.sq", "getAllIds", "SELECT id\nFROM DbExtensionLocalStorage", hn2Var2).c());
                }
                try {
                    s46 s46Var7 = d3dVar.b;
                    s46Var7.getClass();
                    Iterator it7 = ((k02) ie2.p(s46Var7, wj9Var, pcb.Companion.serializer())).iterator();
                    while (it7.hasNext()) {
                        Object next3 = it7.next();
                        if (cs9Var3 == cs9Var) {
                            if (!set.isEmpty()) {
                                z3 = set.contains(((pcb) next3).a);
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                            }
                        }
                        try {
                            pcb pcbVar = (pcb) next3;
                            lm2 lm2Var10 = d3dVar2.a.J;
                            pcbVar.getClass();
                            lm2Var10.s0(new vn2(pcbVar.a, pcbVar.b, pcbVar.c, pcbVar.d));
                        } catch (Throwable unused13) {
                        }
                    }
                } catch (EOFException | v9a unused14) {
                }
                return pvcVar;
            case 7:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.K.c0();
                }
                if (cs9Var3 == cs9Var) {
                    mm mmVar4 = (mm) d3dVar2.a.K.a;
                    ao2 ao2Var = new ao2(9);
                    mmVar4.getClass();
                    set = sl1.A0(new xla(527127012, new String[]{"DbExtensionSource"}, mmVar4, "DbExtensionSource.sq", "getAllIds", "SELECT id\nFROM DbExtensionSource", ao2Var).c());
                }
                try {
                    s46 s46Var8 = d3dVar.b;
                    s46Var8.getClass();
                    Iterator it8 = ((k02) ie2.p(s46Var8, wj9Var, scb.Companion.serializer())).iterator();
                    while (it8.hasNext()) {
                        Object next4 = it8.next();
                        if (cs9Var3 == cs9Var) {
                            if (!set.isEmpty()) {
                                z4 = set.contains(((scb) next4).a);
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                            }
                        }
                        try {
                            scb scbVar = (scb) next4;
                            lm2 lm2Var11 = d3dVar2.a.K;
                            scbVar.getClass();
                            lm2Var11.l0(new mo2(scbVar.a, scbVar.b, scbVar.c, scbVar.d, scbVar.e));
                        } catch (Throwable unused15) {
                        }
                    }
                } catch (EOFException | v9a unused16) {
                }
                return pvcVar;
            case 8:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.I.b0();
                }
                if (cs9Var3 == cs9Var) {
                    mm mmVar5 = (mm) d3dVar2.a.I.a;
                    ao2 ao2Var2 = new ao2(5);
                    mmVar5.getClass();
                    set = sl1.A0(new xla(-1033447873, new String[]{"DbExtension"}, mmVar5, "DbExtension.sq", "getAllIds", "SELECT id\nFROM DbExtension", ao2Var2).c());
                }
                try {
                    s46 s46Var9 = d3dVar.b;
                    s46Var9.getClass();
                    Iterator it9 = ((k02) ie2.p(s46Var9, wj9Var, mcb.Companion.serializer())).iterator();
                    while (it9.hasNext()) {
                        Object next5 = it9.next();
                        if (cs9Var3 == cs9Var) {
                            if (!set.isEmpty()) {
                                z5 = set.contains(((mcb) next5).a);
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                            }
                        }
                        try {
                            d3dVar2.a.I.B0(eze.k((mcb) next5));
                        } catch (Throwable unused17) {
                        }
                    }
                } catch (EOFException | v9a unused18) {
                }
                return pvcVar;
            case 9:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.L.b0("general");
                }
                if (cs9Var3 == cs9Var) {
                    lm2 lm2Var12 = d3dVar2.a.L;
                    lm2Var12.getClass();
                    set = sl1.A0(new po2(lm2Var12, new ao2(16)).c());
                }
                try {
                    s46 s46Var10 = d3dVar.b;
                    s46Var10.getClass();
                    Iterator it10 = ((k02) ie2.p(s46Var10, wj9Var, cdb.Companion.serializer())).iterator();
                    while (it10.hasNext()) {
                        Object next6 = it10.next();
                        if (cs9Var3 == cs9Var) {
                            if (!set.isEmpty()) {
                                z6 = set.contains(((cdb) next6).b);
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                            }
                        }
                        try {
                            d3dVar2.a.L.m0(fre.m((cdb) next6, "general"));
                        } catch (Throwable unused19) {
                        }
                    }
                } catch (EOFException | v9a unused20) {
                }
                return pvcVar;
            case 10:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.M.b0();
                }
                try {
                    s46 s46Var11 = d3dVar.b;
                    s46Var11.getClass();
                    Iterator it11 = ((k02) ie2.p(s46Var11, wj9Var, fdb.Companion.serializer())).iterator();
                    while (it11.hasNext()) {
                        try {
                            fdb fdbVar = (fdb) it11.next();
                            gk2 gk2Var = d3dVar2.a.M;
                            fdbVar.getClass();
                            gk2Var.C0(new to2(fdbVar.b, fdbVar.e, fdbVar.a, fdbVar.c, fdbVar.d));
                        } catch (Throwable unused21) {
                        }
                    }
                } catch (EOFException | v9a unused22) {
                }
                return pvcVar;
            case 11:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    lm2 lm2Var13 = d3dVar2.a.O;
                    ((mm) lm2Var13.a).q(-1584271504, "DELETE FROM DbQtDictionary", null);
                    lm2Var13.C(-1584271504, new yo2(0));
                }
                try {
                    s46 s46Var12 = d3dVar.b;
                    s46Var12.getClass();
                    Iterator it12 = ((k02) ie2.p(s46Var12, wj9Var, jdb.Companion.serializer())).iterator();
                    while (it12.hasNext()) {
                        try {
                            jdb jdbVar = (jdb) it12.next();
                            lm2 lm2Var14 = d3dVar2.a.O;
                            jdbVar.getClass();
                            lm2Var14.n0(new xo2(jdbVar.a, jdbVar.b, jdbVar.c, jdbVar.d, jdbVar.e, jdbVar.f));
                        } catch (Throwable unused23) {
                        }
                    }
                } catch (EOFException | v9a unused24) {
                }
                return pvcVar;
            case 12:
                return a(obj);
            case 13:
                return b(obj);
            case 14:
                return e(obj);
            case 15:
                return f(obj);
            case 16:
                return g(obj);
            default:
                ((vjc) obj).getClass();
                if (cs9Var3 == cs9Var2) {
                    d3dVar2.a.T.c0();
                }
                try {
                    s46 s46Var13 = d3dVar.b;
                    s46Var13.getClass();
                    Iterator it13 = ((k02) ie2.p(s46Var13, wj9Var, bfb.Companion.serializer())).iterator();
                    while (it13.hasNext()) {
                        try {
                            bfb bfbVar = (bfb) it13.next();
                            lm2 lm2Var15 = d3dVar2.a.T;
                            bfbVar.getClass();
                            lm2Var15.q0(new qp2(bfbVar.a, bfbVar.b, bfbVar.c, bfbVar.d, bfbVar.e, bfbVar.f));
                        } catch (Throwable unused25) {
                        }
                    }
                } catch (EOFException | v9a unused26) {
                }
                return pvcVar;
        }
    }
}
