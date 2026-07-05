package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ji8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ji8 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ em1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yya d;
    public final /* synthetic */ yya e;

    public /* synthetic */ ji8(em1 em1Var, boolean z, aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = em1Var;
        this.c = z;
        this.d = aw7Var;
        this.e = aw7Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [em1] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        im1 im1Var = null;
        yya yyaVar = this.e;
        yya yyaVar2 = this.d;
        boolean z = this.c;
        ?? r7 = this.b;
        ak3 ak3Var = (ak3) obj;
        switch (i) {
            case 0:
                ak3Var.getClass();
                pi8 pi8Var = (pi8) yyaVar2.getValue();
                if (pi8Var != null) {
                    if (r7 == 0) {
                        if (z) {
                            im1Var = ki8.d;
                        }
                    } else {
                        im1Var = r7;
                    }
                    ki8.e(ak3Var, pi8Var, ((zy5) yyaVar.getValue()).a, im1Var);
                }
                return pvcVar;
            default:
                ak3Var.getClass();
                List list = (List) yyaVar2.getValue();
                if (list != null) {
                    long j = ((zy5) yyaVar.getValue()).a;
                    if (r7 == 0) {
                        if (z) {
                            im1Var = ki8.d;
                        }
                    } else {
                        im1Var = r7;
                    }
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ki8.e(ak3Var, (pi8) list.get(i2), j, im1Var);
                    }
                }
                return pvcVar;
        }
    }
}
