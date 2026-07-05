package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq3 implements vt4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ qg6 d;

    public /* synthetic */ mq3(m82 m82Var, qg6 qg6Var, aw7 aw7Var) {
        this.b = m82Var;
        this.d = qg6Var;
        this.c = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        qg6 qg6Var = this.d;
        aw7 aw7Var = this.c;
        pvc pvcVar = pvc.a;
        m82 m82Var = this.b;
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new uw2(this.d, this.c, "", null, 9), 3);
                return pvcVar;
            case 1:
                eg0.n(m82Var, aw7Var, qg6Var, 0);
                return pvcVar;
            default:
                eg0.n(m82Var, aw7Var, qg6Var, tl1.x((List) aw7Var.getValue()));
                return pvcVar;
        }
    }

    public /* synthetic */ mq3(m82 m82Var, aw7 aw7Var, qg6 qg6Var) {
        this.b = m82Var;
        this.c = aw7Var;
        this.d = qg6Var;
    }

    public /* synthetic */ mq3(aw7 aw7Var, m82 m82Var, qg6 qg6Var) {
        this.c = aw7Var;
        this.b = m82Var;
        this.d = qg6Var;
    }
}
