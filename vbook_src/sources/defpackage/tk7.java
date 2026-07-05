package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tk7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ yha c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ tk7(int i, m82 m82Var, aw7 aw7Var, yha yhaVar) {
        this.a = i;
        this.b = m82Var;
        this.c = yhaVar;
        this.d = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        yha yhaVar = this.c;
        m82 m82Var = this.b;
        float floatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new zk7(yhaVar, floatValue, null, 0), 3).invokeOnCompletion(new qk7(yhaVar, aw7Var, 3));
                return pvcVar;
            default:
                z87.v(m82Var, null, null, new zk7(yhaVar, floatValue, null, 1), 3).invokeOnCompletion(new qk7(yhaVar, aw7Var, 1));
                return pvcVar;
        }
    }
}
