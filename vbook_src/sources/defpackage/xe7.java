package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m13 b;

    public /* synthetic */ xe7(m13 m13Var, int i) {
        this.a = i;
        this.b = m13Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m13 m13Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                hm8 hm8Var = m13Var.a;
                Boolean bool = Boolean.FALSE;
                hm8Var.setValue(bool);
                m13Var.b.setValue("");
                m13Var.c.setValue(bool);
                return pvcVar;
            default:
                mnc mncVar = (mnc) obj;
                mncVar.getClass();
                String str = mncVar.c;
                boolean z = mncVar.d;
                m13Var.getClass();
                str.getClass();
                m13Var.b.setValue(str);
                m13Var.c.setValue(Boolean.valueOf(z));
                hm8 hm8Var2 = m13Var.d;
                Boolean bool2 = Boolean.TRUE;
                hm8Var2.setValue(bool2);
                m13Var.a.setValue(bool2);
                return pvcVar;
        }
    }
}
