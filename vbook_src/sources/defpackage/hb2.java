package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hb2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb2 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb2 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ hb2(lb2 lb2Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = lb2Var;
        this.c = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        switch (i) {
            case 0:
                String str = ((jub) aw7Var.getValue()).a.b;
                str.getClass();
                lb2 lb2Var = this.b;
                lb2Var.C = str;
                lb2Var.D = 1;
                lb2Var.E = true;
                lb2Var.G.clear();
                cza czaVar = lb2Var.e;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, kb2.a((kb2) value, true, false, false, false, false, null, null, null, ks3.a, 244)));
                    lb2Var.j();
                    return pvcVar;
                }
                lb2Var.j();
                return pvcVar;
            default:
                f76 f76Var = (f76) aw7Var.getValue();
                lb2 lb2Var2 = this.b;
                kb2 kb2Var = (kb2) lb2Var2.e.getValue();
                String obj = k4b.N0(kb2Var.f).toString();
                if (!kb2Var.c && obj.length() != 0) {
                    hk1 a = jdd.a(lb2Var2);
                    sw2 sw2Var = ab3.a;
                    lb2Var2.f(a, ru2.c, new r9(lb2Var2, obj, kb2Var, f76Var, (m42) null));
                }
                return pvcVar;
        }
    }
}
