package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ghc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ghc implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ ghc(aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                cp9 cp9Var = (cp9) obj;
                cp9Var.getClass();
                aw7Var2.setValue(cp9Var);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 1:
                cp9 cp9Var2 = (cp9) obj;
                cp9Var2.getClass();
                aw7Var2.setValue(cp9Var2);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 2:
                lb6 lb6Var = (lb6) obj;
                lb6Var.getClass();
                aw7Var2.setValue(lb6Var.a);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 3:
                String str = (String) obj;
                str.getClass();
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(str);
                return pvcVar;
            case 4:
                wzc wzcVar = (wzc) obj;
                wzcVar.getClass();
                aw7Var2.setValue(wzcVar);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 5:
                zy5 zy5Var = (zy5) obj;
                aw7Var2.setValue(Integer.valueOf((int) (zy5Var.a >> 32)));
                aw7Var.setValue(Integer.valueOf((int) (zy5Var.a & 4294967295L)));
                return pvcVar;
            default:
                lb6 lb6Var2 = (lb6) obj;
                lb6Var2.getClass();
                aw7Var2.setValue(lb6Var2.a);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
        }
    }
}
