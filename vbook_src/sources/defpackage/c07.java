package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c07  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class c07 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ at5 b;

    public /* synthetic */ c07(at5 at5Var, int i) {
        this.a = i;
        this.b = at5Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        at5 at5Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                at5Var.a(list);
                return pvcVar;
            default:
                ((Boolean) obj).getClass();
                at5Var.a.setValue(Boolean.FALSE);
                at5Var.b.setValue(ks3.a);
                return pvcVar;
        }
    }
}
