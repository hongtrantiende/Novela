package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hk8  reason: default package */
/* loaded from: classes3.dex */
public final class hk8 extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public final /* synthetic */ int d;
    public Object e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk8(int i, zg8 zg8Var, int i2, m42 m42Var) {
        super(2, m42Var);
        this.c = i;
        this.C = zg8Var;
        this.d = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                return new hk8((h2a) this.f, i2, (t61) obj2, m42Var);
            default:
                hk8 hk8Var = new hk8(this.c, (zg8) obj2, i2, m42Var);
                hk8Var.f = obj;
                return hk8Var;
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
                return ((hk8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((hk8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk8(h2a h2aVar, int i, t61 t61Var, m42 m42Var) {
        super(2, m42Var);
        this.f = h2aVar;
        this.d = i;
        this.C = t61Var;
    }
}
