package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: su1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class su1 extends h7 implements lu4 {
    public final /* synthetic */ int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.D = i3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.D;
        pvc pvcVar = pvc.a;
        Object obj3 = this.a;
        switch (i) {
            case 0:
                tu1 tu1Var = (tu1) obj3;
                tu1Var.a(((Number) obj2).intValue(), (rv4) obj);
                return pvcVar;
            case 1:
                m42 m42Var = (m42) obj2;
                w2a w2aVar = (w2a) obj3;
                z87.v(w2aVar.h0.c(), null, null, new v2a(w2aVar, ((z4d) obj).a, null, 2), 3);
                return pvcVar;
            default:
                m42 m42Var2 = (m42) obj2;
                w2a w2aVar2 = (w2a) obj3;
                z87.v(w2aVar2.h0.c(), null, null, new v2a(w2aVar2, ((z4d) obj).a, null, 1), 3);
                return pvcVar;
        }
    }
}
