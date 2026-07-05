package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u12  reason: default package */
/* loaded from: classes3.dex */
public final class u12 implements sj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s02 b;
    public final /* synthetic */ Charset c;
    public final /* synthetic */ isc d;
    public final /* synthetic */ s11 e;

    public /* synthetic */ u12(s02 s02Var, Charset charset, isc iscVar, s11 s11Var, int i) {
        this.a = i;
        this.b = s02Var;
        this.c = charset;
        this.d = iscVar;
        this.e = s11Var;
    }

    @Override // defpackage.sj4
    public final Object a(tj4 tj4Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        s02 s02Var = this.b;
        switch (i) {
            case 0:
                Object a = s02Var.a(new t12(tj4Var, this.c, this.d, this.e, 0), m42Var);
                if (a == n82Var) {
                    return a;
                }
                return pvcVar;
            default:
                Object a2 = s02Var.a(new t12(tj4Var, this.c, this.d, this.e, 1), m42Var);
                if (a2 == n82Var) {
                    return a2;
                }
                return pvcVar;
        }
    }
}
