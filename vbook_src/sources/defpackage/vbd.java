package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vbd  reason: default package */
/* loaded from: classes3.dex */
public final class vbd implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gcd b;

    public /* synthetic */ vbd(gcd gcdVar, int i) {
        this.a = i;
        this.b = gcdVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        gcd gcdVar = this.b;
        switch (i) {
            case 0:
                gcdVar.a.m((oy8) obj);
                return pvcVar;
            case 1:
                long longValue = ((Number) obj).longValue();
                cza czaVar = gcdVar.b;
                Long l = new Long(longValue);
                czaVar.getClass();
                czaVar.n(null, l);
                return pvcVar;
            case 2:
                long longValue2 = ((Number) obj).longValue();
                cza czaVar2 = gcdVar.c;
                Long l2 = new Long(longValue2);
                czaVar2.getClass();
                czaVar2.n(null, l2);
                return pvcVar;
            case 3:
                long j = ((zy5) obj).a;
                cza czaVar3 = gcdVar.d;
                zy5 zy5Var = new zy5(j);
                czaVar3.getClass();
                czaVar3.n(null, zy5Var);
                return pvcVar;
            default:
                float floatValue = ((Number) obj).floatValue();
                cza czaVar4 = gcdVar.e;
                Float f = new Float(floatValue);
                czaVar4.getClass();
                czaVar4.n(null, f);
                return pvcVar;
        }
    }
}
