package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w6b  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w6b implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7b b;

    public /* synthetic */ w6b(b7b b7bVar, int i) {
        this.a = i;
        this.b = b7bVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        b7b b7bVar = this.b;
        z8c z8cVar = (z8c) obj;
        switch (i) {
            case 0:
                z8cVar.getClass();
                if (c16.i(b7bVar.g, z8cVar)) {
                    b7bVar.x = z8cVar.w;
                    b7bVar.w = z8cVar.v;
                    b7bVar.e.invoke(b7bVar);
                }
                return pvcVar;
            case 1:
                z8cVar.getClass();
                if (c16.i(b7bVar.g, z8cVar)) {
                    b7bVar.y = z8cVar.t;
                    b7bVar.e.invoke(b7bVar);
                }
                return pvcVar;
            default:
                z8cVar.getClass();
                if (c16.i(b7bVar.g, z8cVar)) {
                    b7bVar.z = z8cVar.u;
                    b7bVar.e.invoke(b7bVar);
                }
                return pvcVar;
        }
    }
}
