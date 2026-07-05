package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zlb  reason: default package */
/* loaded from: classes.dex */
public final class zlb extends mq7 implements fd6, zj3, z7a {
    public ps K;
    public oyb L;
    public do4 M;
    public xt4 N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public List S;
    public xt4 T;
    public q6a U;
    public qa0 V;
    public xt4 W;
    public Map X;
    public lt7 Y;
    public xlb Z;
    public ylb a0;

    public zlb(ps psVar, oyb oybVar, do4 do4Var, xt4 xt4Var, int i, boolean z, int i2, int i3, List list, xt4 xt4Var2, q6a q6aVar, qa0 qa0Var, xt4 xt4Var3) {
        this.K = psVar;
        this.L = oybVar;
        this.M = do4Var;
        this.N = xt4Var;
        this.O = i;
        this.P = z;
        this.Q = i2;
        this.R = i3;
        this.S = list;
        this.T = xt4Var2;
        this.U = q6aVar;
        this.V = qa0Var;
        this.W = xt4Var3;
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        return J1(ry6Var).a(i, ry6Var.getLayoutDirection());
    }

    public final void H1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            lt7 I1 = I1();
            ps psVar = this.K;
            oyb oybVar = this.L;
            do4 do4Var = this.M;
            int i = this.O;
            boolean z5 = this.P;
            int i2 = this.Q;
            int i3 = this.R;
            List list = this.S;
            qa0 qa0Var = this.V;
            I1.a = psVar;
            I1.f(oybVar);
            I1.b = do4Var;
            I1.c = i;
            I1.d = z5;
            I1.e = i2;
            I1.f = i3;
            I1.g = list;
            I1.h = qa0Var;
            I1.s = (I1.s << 2) | 2;
            I1.m = null;
            I1.o = null;
            I1.q = -1;
            I1.p = -1;
            I1.r = null;
        }
        if (this.J) {
            if (z2 || (z && this.Z != null)) {
                ak0.t(this);
            }
            if (z2 || z3 || z4) {
                ube.y(this);
                hud.o(this);
            }
            if (z) {
                hud.o(this);
            }
        }
    }

    public final lt7 I1() {
        if (this.Y == null) {
            this.Y = new lt7(this.K, this.L, this.M, this.O, this.P, this.Q, this.R, this.S, this.V);
        }
        lt7 lt7Var = this.Y;
        lt7Var.getClass();
        return lt7Var;
    }

    public final lt7 J1(r13 r13Var) {
        lt7 lt7Var;
        ylb ylbVar = this.a0;
        if (ylbVar != null && ylbVar.c && (lt7Var = ylbVar.d) != null) {
            lt7Var.d(r13Var);
            return lt7Var;
        }
        lt7 I1 = I1();
        I1.d(r13Var);
        return I1;
    }

    public final boolean K1(xt4 xt4Var, xt4 xt4Var2, q6a q6aVar, xt4 xt4Var3) {
        boolean z;
        if (this.N != xt4Var) {
            this.N = xt4Var;
            z = true;
        } else {
            z = false;
        }
        if (this.T != xt4Var2) {
            this.T = xt4Var2;
            z = true;
        }
        if (!c16.i(this.U, q6aVar)) {
            this.U = q6aVar;
            z = true;
        }
        if (this.W != xt4Var3) {
            this.W = xt4Var3;
            return true;
        }
        return z;
    }

    public final boolean L1(oyb oybVar, List list, int i, int i2, boolean z, do4 do4Var, int i3, qa0 qa0Var) {
        boolean z2 = !this.L.d(oybVar);
        this.L = oybVar;
        if (!c16.i(this.S, list)) {
            this.S = list;
            z2 = true;
        }
        if (this.R != i) {
            this.R = i;
            z2 = true;
        }
        if (this.Q != i2) {
            this.Q = i2;
            z2 = true;
        }
        if (this.P != z) {
            this.P = z;
            z2 = true;
        }
        if (!c16.i(this.M, do4Var)) {
            this.M = do4Var;
            z2 = true;
        }
        if (this.O != i3) {
            this.O = i3;
            z2 = true;
        }
        if (!c16.i(this.V, qa0Var)) {
            this.V = qa0Var;
            return true;
        }
        return z2;
    }

    public final boolean M1(ps psVar) {
        boolean z;
        boolean i = c16.i(this.K.b, psVar.b);
        boolean i2 = c16.i(this.K.a, psVar.a);
        if (i && i2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.K = psVar;
        }
        if (!i) {
            this.a0 = null;
        }
        return z;
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        return J1(ry6Var).a(i, ry6Var.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    @Override // defpackage.zj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(defpackage.qd6 r23) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlb.V0(qd6):void");
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        return qwe.l(J1(ry6Var).e(ry6Var.getLayoutDirection()).h());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [xlb] */
    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        xlb xlbVar = this.Z;
        xlb xlbVar2 = xlbVar;
        if (xlbVar == null) {
            ?? r0 = new xt4(this) { // from class: xlb
                public final /* synthetic */ zlb b;

                {
                    this.b = this;
                }

                @Override // defpackage.xt4
                public final Object invoke(Object obj) {
                    boolean z;
                    boolean z2;
                    int i = r2;
                    fvb fvbVar = null;
                    zlb zlbVar = this.b;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            fvb fvbVar2 = zlbVar.I1().o;
                            if (fvbVar2 != null) {
                                evb evbVar = fvbVar2.a;
                                fvb fvbVar3 = new fvb(new evb(evbVar.a, oyb.f(zlbVar.L, zl1.i, 0L, null, null, null, 0L, null, 0, 0L, 16777214), evbVar.c, evbVar.d, evbVar.e, evbVar.f, evbVar.g, evbVar.h, evbVar.i, evbVar.j), fvbVar2.b, fvbVar2.c);
                                list.add(fvbVar3);
                                fvbVar = fvbVar3;
                            }
                            if (fvbVar != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        case 1:
                            ps psVar = (ps) obj;
                            ylb ylbVar = zlbVar.a0;
                            ks3 ks3Var = ks3.a;
                            if (ylbVar != null) {
                                if (!c16.i(psVar, ylbVar.b)) {
                                    ylbVar.b = psVar;
                                    lt7 lt7Var = ylbVar.d;
                                    if (lt7Var != null) {
                                        oyb oybVar = zlbVar.L;
                                        do4 do4Var = zlbVar.M;
                                        int i2 = zlbVar.O;
                                        boolean z3 = zlbVar.P;
                                        int i3 = zlbVar.Q;
                                        int i4 = zlbVar.R;
                                        qa0 qa0Var = zlbVar.V;
                                        lt7Var.a = psVar;
                                        lt7Var.f(oybVar);
                                        lt7Var.b = do4Var;
                                        lt7Var.c = i2;
                                        lt7Var.d = z3;
                                        lt7Var.e = i3;
                                        lt7Var.f = i4;
                                        lt7Var.g = ks3Var;
                                        lt7Var.h = qa0Var;
                                        lt7Var.s = (lt7Var.s << 2) | 2;
                                        lt7Var.m = null;
                                        lt7Var.o = null;
                                        lt7Var.q = -1;
                                        lt7Var.p = -1;
                                        lt7Var.r = null;
                                    }
                                }
                            } else {
                                ylb ylbVar2 = new ylb(zlbVar.K, psVar);
                                lt7 lt7Var2 = new lt7(psVar, zlbVar.L, zlbVar.M, zlbVar.O, zlbVar.P, zlbVar.Q, zlbVar.R, ks3Var, zlbVar.V);
                                lt7Var2.d(zlbVar.I1().k);
                                ylbVar2.d = lt7Var2;
                                zlbVar.a0 = ylbVar2;
                            }
                            ak0.t(zlbVar);
                            ube.y(zlbVar);
                            hud.o(zlbVar);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            ylb ylbVar3 = zlbVar.a0;
                            if (ylbVar3 == null) {
                                z2 = false;
                            } else {
                                xt4 xt4Var = zlbVar.W;
                                if (xt4Var != null) {
                                    xt4Var.invoke(ylbVar3);
                                }
                                ylb ylbVar4 = zlbVar.a0;
                                if (ylbVar4 != null) {
                                    ylbVar4.c = booleanValue;
                                }
                                ak0.t(zlbVar);
                                ube.y(zlbVar);
                                hud.o(zlbVar);
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            };
            this.Z = r0;
            xlbVar2 = r0;
        }
        ps psVar = this.K;
        r76[] r76VarArr = j8a.a;
        l8aVar.a(h8a.C, tl1.A(psVar));
        ylb ylbVar = this.a0;
        if (ylbVar != null) {
            ps psVar2 = ylbVar.b;
            k8a k8aVar = h8a.D;
            r76[] r76VarArr2 = j8a.a;
            r76 r76Var = r76VarArr2[16];
            l8aVar.a(k8aVar, psVar2);
            boolean z = ylbVar.c;
            k8a k8aVar2 = h8a.E;
            r76 r76Var2 = r76VarArr2[17];
            l8aVar.a(k8aVar2, Boolean.valueOf(z));
        }
        l8aVar.a(s7a.l, new g4(null, new xt4(this) { // from class: xlb
            public final /* synthetic */ zlb b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                boolean z2;
                boolean z22;
                int i = r2;
                fvb fvbVar = null;
                zlb zlbVar = this.b;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        fvb fvbVar2 = zlbVar.I1().o;
                        if (fvbVar2 != null) {
                            evb evbVar = fvbVar2.a;
                            fvb fvbVar3 = new fvb(new evb(evbVar.a, oyb.f(zlbVar.L, zl1.i, 0L, null, null, null, 0L, null, 0, 0L, 16777214), evbVar.c, evbVar.d, evbVar.e, evbVar.f, evbVar.g, evbVar.h, evbVar.i, evbVar.j), fvbVar2.b, fvbVar2.c);
                            list.add(fvbVar3);
                            fvbVar = fvbVar3;
                        }
                        if (fvbVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        ps psVar3 = (ps) obj;
                        ylb ylbVar2 = zlbVar.a0;
                        ks3 ks3Var = ks3.a;
                        if (ylbVar2 != null) {
                            if (!c16.i(psVar3, ylbVar2.b)) {
                                ylbVar2.b = psVar3;
                                lt7 lt7Var = ylbVar2.d;
                                if (lt7Var != null) {
                                    oyb oybVar = zlbVar.L;
                                    do4 do4Var = zlbVar.M;
                                    int i2 = zlbVar.O;
                                    boolean z3 = zlbVar.P;
                                    int i3 = zlbVar.Q;
                                    int i4 = zlbVar.R;
                                    qa0 qa0Var = zlbVar.V;
                                    lt7Var.a = psVar3;
                                    lt7Var.f(oybVar);
                                    lt7Var.b = do4Var;
                                    lt7Var.c = i2;
                                    lt7Var.d = z3;
                                    lt7Var.e = i3;
                                    lt7Var.f = i4;
                                    lt7Var.g = ks3Var;
                                    lt7Var.h = qa0Var;
                                    lt7Var.s = (lt7Var.s << 2) | 2;
                                    lt7Var.m = null;
                                    lt7Var.o = null;
                                    lt7Var.q = -1;
                                    lt7Var.p = -1;
                                    lt7Var.r = null;
                                }
                            }
                        } else {
                            ylb ylbVar22 = new ylb(zlbVar.K, psVar3);
                            lt7 lt7Var2 = new lt7(psVar3, zlbVar.L, zlbVar.M, zlbVar.O, zlbVar.P, zlbVar.Q, zlbVar.R, ks3Var, zlbVar.V);
                            lt7Var2.d(zlbVar.I1().k);
                            ylbVar22.d = lt7Var2;
                            zlbVar.a0 = ylbVar22;
                        }
                        ak0.t(zlbVar);
                        ube.y(zlbVar);
                        hud.o(zlbVar);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ylb ylbVar3 = zlbVar.a0;
                        if (ylbVar3 == null) {
                            z22 = false;
                        } else {
                            xt4 xt4Var = zlbVar.W;
                            if (xt4Var != null) {
                                xt4Var.invoke(ylbVar3);
                            }
                            ylb ylbVar4 = zlbVar.a0;
                            if (ylbVar4 != null) {
                                ylbVar4.c = booleanValue;
                            }
                            ak0.t(zlbVar);
                            ube.y(zlbVar);
                            hud.o(zlbVar);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        l8aVar.a(s7a.m, new g4(null, new xt4(this) { // from class: xlb
            public final /* synthetic */ zlb b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                boolean z2;
                boolean z22;
                int i = r2;
                fvb fvbVar = null;
                zlb zlbVar = this.b;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        fvb fvbVar2 = zlbVar.I1().o;
                        if (fvbVar2 != null) {
                            evb evbVar = fvbVar2.a;
                            fvb fvbVar3 = new fvb(new evb(evbVar.a, oyb.f(zlbVar.L, zl1.i, 0L, null, null, null, 0L, null, 0, 0L, 16777214), evbVar.c, evbVar.d, evbVar.e, evbVar.f, evbVar.g, evbVar.h, evbVar.i, evbVar.j), fvbVar2.b, fvbVar2.c);
                            list.add(fvbVar3);
                            fvbVar = fvbVar3;
                        }
                        if (fvbVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        ps psVar3 = (ps) obj;
                        ylb ylbVar2 = zlbVar.a0;
                        ks3 ks3Var = ks3.a;
                        if (ylbVar2 != null) {
                            if (!c16.i(psVar3, ylbVar2.b)) {
                                ylbVar2.b = psVar3;
                                lt7 lt7Var = ylbVar2.d;
                                if (lt7Var != null) {
                                    oyb oybVar = zlbVar.L;
                                    do4 do4Var = zlbVar.M;
                                    int i2 = zlbVar.O;
                                    boolean z3 = zlbVar.P;
                                    int i3 = zlbVar.Q;
                                    int i4 = zlbVar.R;
                                    qa0 qa0Var = zlbVar.V;
                                    lt7Var.a = psVar3;
                                    lt7Var.f(oybVar);
                                    lt7Var.b = do4Var;
                                    lt7Var.c = i2;
                                    lt7Var.d = z3;
                                    lt7Var.e = i3;
                                    lt7Var.f = i4;
                                    lt7Var.g = ks3Var;
                                    lt7Var.h = qa0Var;
                                    lt7Var.s = (lt7Var.s << 2) | 2;
                                    lt7Var.m = null;
                                    lt7Var.o = null;
                                    lt7Var.q = -1;
                                    lt7Var.p = -1;
                                    lt7Var.r = null;
                                }
                            }
                        } else {
                            ylb ylbVar22 = new ylb(zlbVar.K, psVar3);
                            lt7 lt7Var2 = new lt7(psVar3, zlbVar.L, zlbVar.M, zlbVar.O, zlbVar.P, zlbVar.Q, zlbVar.R, ks3Var, zlbVar.V);
                            lt7Var2.d(zlbVar.I1().k);
                            ylbVar22.d = lt7Var2;
                            zlbVar.a0 = ylbVar22;
                        }
                        ak0.t(zlbVar);
                        ube.y(zlbVar);
                        hud.o(zlbVar);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ylb ylbVar3 = zlbVar.a0;
                        if (ylbVar3 == null) {
                            z22 = false;
                        } else {
                            xt4 xt4Var = zlbVar.W;
                            if (xt4Var != null) {
                                xt4Var.invoke(ylbVar3);
                            }
                            ylb ylbVar4 = zlbVar.a0;
                            if (ylbVar4 != null) {
                                ylbVar4.c = booleanValue;
                            }
                            ak0.t(zlbVar);
                            ube.y(zlbVar);
                            hud.o(zlbVar);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        l8aVar.a(s7a.n, new g4(null, new ak9(this, 28)));
        j8a.a(l8aVar, xlbVar2);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            lt7 J1 = J1(e37Var);
            boolean c = J1.c(j, e37Var.getLayoutDirection());
            fvb fvbVar = J1.o;
            if (fvbVar != null) {
                long j2 = fvbVar.c;
                fvbVar.b.a.b();
                if (c) {
                    ube.x(this);
                    xt4 xt4Var = this.N;
                    if (xt4Var != null) {
                        xt4Var.invoke(fvbVar);
                    }
                    q6a q6aVar = this.U;
                    if (q6aVar != null) {
                        q6aVar.d(fvbVar);
                    }
                    Map map = this.X;
                    if (map == null) {
                        map = new LinkedHashMap(2);
                    }
                    map.put(hc.a, Integer.valueOf(Math.round(fvbVar.d)));
                    map.put(hc.b, Integer.valueOf(Math.round(fvbVar.e)));
                    this.X = map;
                }
                xt4 xt4Var2 = this.T;
                if (xt4Var2 != null) {
                    xt4Var2.invoke(fvbVar.f);
                }
                int i = (int) (j2 >> 32);
                int i2 = (int) (j2 & 4294967295L);
                mw8 M = w27Var.M(ak0.r(i, i, i2, i2));
                Map map2 = this.X;
                map2.getClass();
                return e37Var.q0(i, i2, map2, new a1(M, 15));
            }
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + J1);
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        return qwe.l(J1(ry6Var).e(ry6Var.getLayoutDirection()).l());
    }
}
