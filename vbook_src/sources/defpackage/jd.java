package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jd implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jd(nq7 nq7Var, tu1 tu1Var, tu1 tu1Var2, float f, qid qidVar, xfc xfcVar, int i) {
        tu1 tu1Var3 = hv1.a;
        this.b = nq7Var;
        this.c = tu1Var;
        this.e = tu1Var2;
        this.d = f;
        this.f = qidVar;
        this.C = xfcVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.b;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(14352385);
                q1d.a((nq7) obj7, (qe) obj6, (jab) obj5, this.d, (ou4) obj4, (tu1) obj3, (rv4) obj, p);
                return pvcVar;
            case 1:
                tu1 tu1Var = hv1.a;
                ((Integer) obj2).getClass();
                int p2 = xoe.p(3463);
                vv.c((nq7) obj7, (tu1) obj3, (tu1) obj6, this.d, (qid) obj5, (xfc) obj4, (rv4) obj, p2);
                return pvcVar;
            default:
                r13 r13Var = (r13) obj7;
                oyb oybVar = (oyb) obj6;
                uva uvaVar = oybVar.a;
                uvb uvbVar = (uvb) obj5;
                List list = (List) obj4;
                aw7 aw7Var = (aw7) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                switch (str.hashCode()) {
                    case 104387:
                        if (str.equals("img")) {
                            j34 j34Var = new j34(8, list, aw7Var);
                            moc q = hud.q(str2);
                            String str3 = (String) q.a;
                            int intValue = ((Number) q.b).intValue();
                            int intValue2 = ((Number) q.c).intValue();
                            int X0 = r13Var.X0(this.d);
                            if (intValue > 0 && intValue <= X0) {
                                X0 = intValue;
                            }
                            if (intValue > 0 && intValue2 > 0) {
                                i = (intValue2 * X0) / intValue;
                            } else {
                                i = 140;
                            }
                            return new uv5(new pw8(r13Var.p0(X0), r13Var.p0(i), 4), new tu1(new t81(2, j34Var, str3), true, 1089807917));
                        }
                        break;
                    case 3599307:
                        if (str.equals("user")) {
                            long j = uvb.b(uvbVar, new ps("@".concat(str2)), oybVar, false, 0, 0L, null, null, null, 2044).c;
                            return new uv5(new pw8(r13Var.P(r13Var.y0((int) (j >> 32)) + 8.0f), r13Var.p0((int) (j & 4294967295L)), 6), new tu1(new vc5(str2, oybVar, 1), true, -924909439));
                        }
                        break;
                    case 93166550:
                        if (str.equals("audio")) {
                            return hud.n("Audio", oybVar, r13Var, uvbVar);
                        }
                        break;
                    case 96632902:
                        if (str.equals("emoji")) {
                            long j2 = uvaVar.b;
                            zr1.k(j2);
                            long x = zr1.x(e4c.c(j2) * 2.0f, j2 & 1095216660480L);
                            long j3 = uvaVar.b;
                            zr1.k(j3);
                            return new uv5(new pw8(x, zr1.x(e4c.c(j3) * 2.0f, 1095216660480L & j3), 6), new tu1(new uc5(str2, 0), true, -1612802319));
                        }
                        break;
                    case 112202875:
                        if (str.equals("video")) {
                            return hud.n("Video", oybVar, r13Var, uvbVar);
                        }
                        break;
                }
                return null;
        }
    }

    public /* synthetic */ jd(nq7 nq7Var, qe qeVar, jab jabVar, float f, ou4 ou4Var, tu1 tu1Var, int i) {
        this.b = nq7Var;
        this.e = qeVar;
        this.f = jabVar;
        this.d = f;
        this.C = ou4Var;
        this.c = tu1Var;
    }

    public /* synthetic */ jd(r13 r13Var, float f, oyb oybVar, uvb uvbVar, List list, aw7 aw7Var) {
        this.b = r13Var;
        this.d = f;
        this.e = oybVar;
        this.f = uvbVar;
        this.C = list;
        this.c = aw7Var;
    }
}
