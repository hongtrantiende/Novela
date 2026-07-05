package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eg1  reason: default package */
/* loaded from: classes.dex */
public final class eg1 extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg1(ng1 ng1Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.c = ng1Var;
        this.b = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new eg1((ng1) this.c, this.b, m42Var);
            default:
                eg1 eg1Var = new eg1(this.b, m42Var);
                eg1Var.c = obj;
                return eg1Var;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((eg1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((eg1) create((s3a) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        cza czaVar;
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        long j = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ng1 ng1Var = (ng1) this.c;
                Collection values = ng1Var.P.values();
                values.getClass();
                Iterator it = values.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((fa7) obj2).b() == j) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                fa7 fa7Var = (fa7) obj2;
                if (fa7Var != null && (czaVar = ng1Var.C) != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, cg1.a((cg1) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, fa7Var, null, 1610612735)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                t3a t3aVar = ((s3a) this.c).a;
                t3aVar.d(t3aVar.k, j, 1);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg1(long j, m42 m42Var) {
        super(2, m42Var);
        this.b = j;
    }
}
