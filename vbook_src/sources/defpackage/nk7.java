package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nk7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yha b;
    public final /* synthetic */ m82 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ nk7(int i, m82 m82Var, aw7 aw7Var, yha yhaVar) {
        this.a = i;
        this.b = yhaVar;
        this.c = m82Var;
        this.d = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        zha zhaVar = zha.b;
        zha zhaVar2 = zha.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        m82 m82Var = this.c;
        yha yhaVar = this.b;
        switch (i) {
            case 0:
                if (yhaVar.b() == zhaVar && yhaVar.c()) {
                    z87.v(m82Var, null, null, new wk7(yhaVar, null, 5), 3);
                } else {
                    z87.v(m82Var, null, null, new wk7(yhaVar, null, 6), 3).invokeOnCompletion(true, true, new dk7(aw7Var, 4));
                }
                return pvcVar;
            case 1:
                if (((Boolean) yhaVar.b.d.invoke(zhaVar2)).booleanValue() && yhaVar.d() != zhaVar2) {
                    z87.v(m82Var, null, null, new wk7(yhaVar, null, 4), 3).invokeOnCompletion(new qk7(yhaVar, aw7Var, 0));
                }
                return pvcVar;
            case 2:
                if (yhaVar.b() == zhaVar && yhaVar.c()) {
                    if (yhaVar.d() != zha.c) {
                        z87.v(m82Var, null, null, new wk7(yhaVar, null, 0), 3);
                    }
                } else if (yhaVar.d() != zhaVar2) {
                    z87.v(m82Var, null, null, new wk7(yhaVar, null, 1), 3).invokeOnCompletion(true, true, new dk7(aw7Var, 5));
                }
                return pvcVar;
            default:
                if (((Boolean) yhaVar.b.d.invoke(zhaVar2)).booleanValue()) {
                    z87.v(m82Var, null, null, new wk7(yhaVar, null, 7), 3).invokeOnCompletion(new qk7(yhaVar, aw7Var, 2));
                }
                return pvcVar;
        }
    }
}
