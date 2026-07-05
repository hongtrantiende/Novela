package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vn1  reason: default package */
/* loaded from: classes3.dex */
public final class vn1 extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ tu1 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn1(xy4 xy4Var, int i, int i2, tu1 tu1Var, int i3, int i4, int i5) {
        super(2);
        this.a = i5;
        this.b = xy4Var;
        this.c = i;
        this.d = i2;
        this.e = tu1Var;
        this.f = i4;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int i2 = this.f;
                kwe.b(this.b, this.c, this.d, this.e, (rv4) obj, 3073, i2);
                return pvcVar;
            default:
                ((Number) obj2).intValue();
                int i3 = this.f;
                jue.y(this.b, this.c, this.d, this.e, (rv4) obj, 3073, i3);
                return pvcVar;
        }
    }
}
