package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b9d  reason: default package */
/* loaded from: classes3.dex */
public final class b9d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9d(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return new b9d((dx4) obj3, (ora) obj2, m42Var, 0);
            default:
                return new b9d((ubd) obj3, (String) obj2, m42Var, 1);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((b9d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((b9d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hre.r(obj);
                if (!((Boolean) ((dx4) obj4).h.getValue()).booleanValue()) {
                    ((ora) obj3).clear();
                }
                return pvcVar;
            default:
                hre.r(obj);
                ubd ubdVar = (ubd) obj4;
                String str = (String) obj3;
                Iterator it = ubdVar.I.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (c16.i(((su3) obj2).a, str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                su3 su3Var = (su3) obj2;
                if (su3Var != null) {
                    ubdVar.p(su3Var.b);
                }
                return pvcVar;
        }
    }
}
