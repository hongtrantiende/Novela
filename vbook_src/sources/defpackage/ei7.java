package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ei7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ m82 c;
    public final /* synthetic */ kj6 d;

    public /* synthetic */ ei7(m82 m82Var, aw7 aw7Var, kj6 kj6Var, int i) {
        this.a = i;
        this.c = m82Var;
        this.b = aw7Var;
        this.d = kj6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        kj6 kj6Var = this.d;
        m82 m82Var = this.c;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                o28.g(m82Var, aw7Var, kj6Var, 0);
                return pvcVar;
            case 1:
                o28.g(m82Var, aw7Var, kj6Var, tl1.x((List) aw7Var.getValue()));
                return pvcVar;
            case 2:
                l0e.r(m82Var, aw7Var, kj6Var, 0);
                return pvcVar;
            default:
                l0e.r(m82Var, aw7Var, kj6Var, tl1.x((List) aw7Var.getValue()));
                return pvcVar;
        }
    }

    public /* synthetic */ ei7(aw7 aw7Var, m82 m82Var, kj6 kj6Var, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = m82Var;
        this.d = kj6Var;
    }
}
