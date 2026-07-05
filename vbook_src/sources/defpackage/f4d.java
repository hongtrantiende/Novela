package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f4d  reason: default package */
/* loaded from: classes.dex */
public final class f4d extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4d(g4d g4dVar, int i) {
        super(1);
        this.a = i;
        this.b = g4dVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        g4d g4dVar = this.b;
        switch (i) {
            case 0:
                t3d t3dVar = (t3d) obj;
                g4dVar.d = true;
                g4dVar.f.invoke();
                return pvcVar;
            default:
                ak3 ak3Var = (ak3) obj;
                q25 q25Var = g4dVar.b;
                float f = g4dVar.k;
                float f2 = g4dVar.l;
                ij1 Q0 = ak3Var.Q0();
                long G = Q0.G();
                Q0.w().i();
                try {
                    ((mu9) Q0.b).A(f, f2, 0L);
                    q25Var.a(ak3Var);
                    return pvcVar;
                } finally {
                    rs8.r(Q0, G);
                }
        }
    }
}
