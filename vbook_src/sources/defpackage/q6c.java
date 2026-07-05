package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q6c  reason: default package */
/* loaded from: classes3.dex */
public final class q6c extends aab implements pu4 {
    public /* synthetic */ c6c a;
    public /* synthetic */ List b;
    public /* synthetic */ List c;
    public /* synthetic */ int d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ w6c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6c(w6c w6cVar, m42 m42Var) {
        super(6, m42Var);
        this.f = w6cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        c6c c6cVar = this.a;
        List list = this.b;
        List list2 = this.c;
        int i = this.d;
        boolean z = this.e;
        hre.r(obj);
        cza czaVar = this.f.d;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, p6c.a((p6c) value, c6cVar, c6cVar.a, list, list2, i, z, false, false, false, 0, nae.e, null, 0, null, nae.e, 65472)));
            return pvc.a;
        }
        return pvc.a;
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj4).intValue();
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        q6c q6cVar = new q6c(this.f, (m42) obj6);
        q6cVar.a = (c6c) obj;
        q6cVar.b = (List) obj2;
        q6cVar.c = (List) obj3;
        q6cVar.d = intValue;
        q6cVar.e = booleanValue;
        pvc pvcVar = pvc.a;
        q6cVar.invokeSuspend(pvcVar);
        return pvcVar;
    }
}
