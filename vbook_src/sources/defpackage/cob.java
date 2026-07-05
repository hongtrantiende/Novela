package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cob  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cob implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ cob(aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        String str;
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                aw7Var2.setValue(Boolean.TRUE);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 1:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 2:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            default:
                lbd lbdVar = (lbd) sl1.f0(((Number) aw7Var.getValue()).intValue(), (List) aw7Var2.getValue());
                if (lbdVar != null) {
                    str = lbdVar.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    return "";
                }
                return str;
        }
    }
}
