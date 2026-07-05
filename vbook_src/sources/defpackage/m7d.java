package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m7d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7d implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gcd b;
    public final /* synthetic */ int c;
    public final /* synthetic */ t7d d;

    public /* synthetic */ m7d(gcd gcdVar, int i, t7d t7dVar, int i2) {
        this.a = i2;
        this.b = gcdVar;
        this.c = i;
        this.d = t7dVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        am3 am3Var = am3.SECONDS;
        t7d t7dVar = this.d;
        int i2 = this.c;
        gcd gcdVar = this.b;
        switch (i) {
            case 0:
                hq7 hq7Var = wl3.b;
                gcdVar.b(jue.O(-i2, am3Var));
                t7d.e(t7dVar);
                return pvcVar;
            case 1:
                hq7 hq7Var2 = wl3.b;
                gcdVar.b(jue.O(i2, am3Var));
                t7d.e(t7dVar);
                return pvcVar;
            case 2:
                hq7 hq7Var3 = wl3.b;
                gcdVar.b(jue.O(-i2, am3Var));
                t7d.e(t7dVar);
                return pvcVar;
            default:
                hq7 hq7Var4 = wl3.b;
                gcdVar.b(jue.O(i2, am3Var));
                t7d.e(t7dVar);
                return pvcVar;
        }
    }
}
