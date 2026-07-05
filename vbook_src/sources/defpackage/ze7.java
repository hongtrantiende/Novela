package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ze7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m13 b;

    public /* synthetic */ ze7(m13 m13Var, int i) {
        this.a = i;
        this.b = m13Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m13 m13Var = this.b;
        switch (i) {
            case 0:
                m13Var.c.setValue(Boolean.valueOf(!((Boolean) m13Var.c.getValue()).booleanValue()));
                return pvcVar;
            case 1:
                hm8 hm8Var = m13Var.a;
                Boolean bool = Boolean.FALSE;
                hm8Var.setValue(bool);
                m13Var.b.setValue("");
                m13Var.c.setValue(bool);
                return pvcVar;
            case 2:
                m13.a(m13Var, "");
                return pvcVar;
            default:
                m13.a(m13Var, "");
                return pvcVar;
        }
    }
}
