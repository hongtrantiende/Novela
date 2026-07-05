package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke1 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z86 b;

    public /* synthetic */ ke1(z86 z86Var, int i) {
        this.a = i;
        this.b = z86Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        z86 z86Var = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                if (booleanValue) {
                    z86Var.g();
                } else {
                    bsa bsaVar = z86Var.c;
                    if (bsaVar != null) {
                        ((w03) bsaVar).b();
                    }
                }
                return pvcVar;
            default:
                if (booleanValue) {
                    z86Var.g();
                } else {
                    bsa bsaVar2 = z86Var.c;
                    if (bsaVar2 != null) {
                        ((w03) bsaVar2).b();
                    }
                }
                return pvcVar;
        }
    }
}
