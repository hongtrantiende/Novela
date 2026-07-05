package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jm0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm0 implements lu4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ zl0 D;
    public final /* synthetic */ vt4 a;
    public final /* synthetic */ qo3 b;
    public final /* synthetic */ dm8 c;
    public final /* synthetic */ dm8 d;
    public final /* synthetic */ kj6 e;
    public final /* synthetic */ vt4 f;

    public /* synthetic */ jm0(vt4 vt4Var, qo3 qo3Var, dm8 dm8Var, dm8 dm8Var2, kj6 kj6Var, vt4 vt4Var2, float f, zl0 zl0Var) {
        this.a = vt4Var;
        this.b = qo3Var;
        this.c = dm8Var;
        this.d = dm8Var2;
        this.e = kj6Var;
        this.f = vt4Var2;
        this.C = f;
        this.D = zl0Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        boolean z = this.b.i;
        z09 z09Var = (z09) obj;
        y78 y78Var = (y78) obj2;
        z09Var.getClass();
        z09Var.a();
        so3 so3Var = (so3) this.a.invoke();
        if (so3Var.d != null && z) {
            dm8 dm8Var = this.c;
            dm8Var.i(Float.intBitsToFloat((int) (y78Var.a & 4294967295L)) + dm8Var.h());
            dm8 dm8Var2 = this.d;
            dm8Var2.i(Float.intBitsToFloat((int) (y78Var.a >> 32)) + dm8Var2.h());
            wi3 q = bue.q(this.e.j(), dm8Var.h(), (vi3) this.f.invoke(), so3Var.d, dm8Var2.h(), this.C);
            Integer num2 = null;
            if (q != null) {
                num = Integer.valueOf(q.a);
            } else {
                num = null;
            }
            if (q != null) {
                num2 = Integer.valueOf(q.b);
            }
            zl0 zl0Var = this.D;
            zl0Var.getClass();
            if (z) {
                zl0Var.c(new vxc(num, num2));
            }
        }
        return pvc.a;
    }
}
