package defpackage;

import android.content.Context;
import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cy  reason: default package */
/* loaded from: classes.dex */
public final class cy extends fb6 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ey c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(ey eyVar, Context context) {
        super(2);
        this.c = eyVar;
        this.b = context;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ey eyVar;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
                    rv4Var.X();
                } else {
                    rv4Var.f0(1881995740);
                    Object P = rv4Var.P();
                    Object obj3 = ax1.a;
                    if (P == obj3) {
                        P = yae.z(new ug3(0L));
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var = (aw7) P;
                    rv4Var.q(false);
                    Boolean bool = Boolean.FALSE;
                    rv4Var.f0(1881999935);
                    ey eyVar2 = this.c;
                    boolean f = rv4Var.f(eyVar2);
                    Context context = this.b;
                    boolean f2 = rv4Var.f(context) | f | rv4Var.f(aw7Var);
                    Object P2 = rv4Var.P();
                    pvc pvcVar2 = null;
                    if (!f2 && P2 != obj3) {
                        eyVar = eyVar2;
                    } else {
                        l lVar = new l(eyVar2, context, aw7Var, (m42) null, 4);
                        eyVar = eyVar2;
                        rv4Var.o0(lVar);
                        P2 = lVar;
                    }
                    rv4Var.q(false);
                    if (((Boolean) yae.C((lu4) P2, rv4Var, bool).getValue()).booleanValue()) {
                        rv4Var.f0(-1786326291);
                        rv4Var.f0(1882039614);
                        Object P3 = rv4Var.P();
                        if (P3 == obj3) {
                            pvcVar2 = null;
                            xa1 xa1Var = new xa1(new l(eyVar.d, context, eyVar.e, (m42) null, 5), gs3.a, -2, py0.a);
                            rv4Var.o0(xa1Var);
                            P3 = xa1Var;
                        }
                        rv4Var.q(false);
                        lu4 lu4Var = (lu4) yae.m((sj4) P3, null, null, rv4Var, 48, 2).getValue();
                        rv4Var.f0(1882043230);
                        if (lu4Var != null) {
                            nmd.c(0, ((ug3) aw7Var.getValue()).a, lu4Var, rv4Var, eyVar.g);
                            rv4Var = rv4Var;
                            pvcVar2 = pvcVar;
                        }
                        rv4Var.q(false);
                        if (pvcVar2 == null) {
                            qwe.i(0, rv4Var);
                        }
                        rv4Var.q(false);
                    } else {
                        rv4Var.f0(-1786102688);
                        qwe.i(0, rv4Var);
                        rv4Var.q(false);
                    }
                    rv4Var.f0(1882053955);
                    boolean f3 = rv4Var.f(eyVar);
                    Object P4 = rv4Var.P();
                    if (f3 || P4 == obj3) {
                        P4 = new ik(eyVar, 3);
                        rv4Var.o0(P4);
                    }
                    rv4Var.q(false);
                    yte.k((vt4) P4, rv4Var);
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && rv4Var2.E()) {
                    rv4Var2.X();
                } else {
                    tza tzaVar = by1.b;
                    Context context2 = this.b;
                    i99 a = tzaVar.a(context2);
                    tza tzaVar2 = by1.d;
                    ey eyVar3 = this.c;
                    i99 a2 = tzaVar2.a(eyVar3.e);
                    ly1 ly1Var = cy1.a;
                    Bundle bundle = (Bundle) eyVar3.j.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    pye.b(new i99[]{a, a2, ly1Var.a(bundle), by1.c.a(eyVar3.i.getValue())}, jce.v(rv4Var2, 1688971311, new cy(eyVar3, context2)), rv4Var2, 48);
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(Context context, ey eyVar) {
        super(2);
        this.b = context;
        this.c = eyVar;
    }
}
