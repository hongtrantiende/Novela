package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k3e  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k3e implements tu4 {
    public static final /* synthetic */ k3e b = new k3e(0);
    public static final /* synthetic */ k3e c = new k3e(1);
    public static final /* synthetic */ k3e d = new k3e(2);
    public static final /* synthetic */ k3e e = new k3e(3);
    public final /* synthetic */ int a;

    public /* synthetic */ k3e(int i) {
        this.a = i;
    }

    @Override // defpackage.tu4
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                String str = m3e.b;
                if (str == null) {
                    synchronized (m3e.class) {
                        try {
                            str = m3e.b;
                            if (str == null) {
                                str = tze.b(context, "com.google.android.gms.measurement");
                                m3e.b = str;
                            }
                        } finally {
                        }
                    }
                }
                return str;
            case 1:
                Context context2 = (Context) obj;
                j23 j23Var = z5f.i;
                return "";
            case 2:
                m1f m1fVar = (m1f) obj;
                t7f z = v7f.z();
                if (m1fVar == null) {
                    return (v7f) z.d();
                }
                for (q1f q1fVar : m1fVar.x()) {
                    w7f z2 = y7f.z();
                    String t = q1fVar.t();
                    z2.b();
                    ((y7f) z2.b).A(t);
                    int H = q1fVar.H();
                    int i = H - 1;
                    if (H != 0) {
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            szd y = q1fVar.y();
                                            z2.b();
                                            ((y7f) z2.b).F(y);
                                        } else {
                                            vs.k("No known flag type");
                                            return null;
                                        }
                                    } else {
                                        String x = q1fVar.x();
                                        z2.b();
                                        ((y7f) z2.b).E(x);
                                    }
                                } else {
                                    double w = q1fVar.w();
                                    z2.b();
                                    ((y7f) z2.b).D(w);
                                }
                            } else {
                                boolean v = q1fVar.v();
                                z2.b();
                                ((y7f) z2.b).C(v);
                            }
                        } else {
                            long u = q1fVar.u();
                            z2.b();
                            ((y7f) z2.b).B(u);
                        }
                        z.b();
                        ((v7f) z.b).F((y7f) z2.d());
                    } else {
                        throw null;
                    }
                }
                String w2 = m1fVar.w();
                z.b();
                ((v7f) z.b).D(w2);
                String t2 = m1fVar.t();
                z.b();
                ((v7f) z.b).B(t2);
                long y2 = m1fVar.y();
                z.b();
                ((v7f) z.b).E(y2);
                if (m1fVar.u()) {
                    szd v2 = m1fVar.v();
                    z.b();
                    ((v7f) z.b).C(v2);
                }
                return (v7f) z.d();
            default:
                r1f r1fVar = (r1f) obj;
                if (r1fVar.a == 29514) {
                    a3f w3 = d3f.w();
                    s2f G = t2f.G();
                    long currentTimeMillis = System.currentTimeMillis();
                    G.b();
                    ((t2f) G.b).I(currentTimeMillis);
                    w3.b();
                    ((d3f) w3.b).x((t2f) G.d());
                    return (d3f) w3.d();
                }
                throw r1fVar;
        }
    }
}
