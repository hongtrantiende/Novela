package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ez7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ez7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ez7(float f, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.b = f;
        this.c = nq7Var;
        this.d = xt4Var;
        this.e = xt4Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                z87.v((m82) obj5, null, null, new fz7(floatValue, this.b, (y4a) obj4, (wz9) obj3, (m42) null), 3);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                ote.e(this.b, (nq7) obj5, (xt4) obj4, (xt4) obj3, (rv4) obj, p);
                return pvcVar;
        }
    }

    public /* synthetic */ ez7(m82 m82Var, float f, y4a y4aVar, wz9 wz9Var) {
        this.c = m82Var;
        this.b = f;
        this.d = y4aVar;
        this.e = wz9Var;
    }
}
