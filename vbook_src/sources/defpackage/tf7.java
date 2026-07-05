package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tf7  reason: default package */
/* loaded from: classes3.dex */
public final class tf7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tf7(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                eo3 eo3Var = (eo3) obj;
                ArrayList E0 = sl1.E0(eo3Var.c());
                E0.remove(i2);
                boolean isEmpty = E0.isEmpty();
                ArrayList arrayList = E0;
                if (isEmpty) {
                    arrayList = tl1.A(eo3Var.a(""));
                }
                eo3Var.f(arrayList);
                return pvcVar;
            default:
                ((xt4) obj).invoke(Integer.valueOf(i2));
                return pvcVar;
        }
    }
}
