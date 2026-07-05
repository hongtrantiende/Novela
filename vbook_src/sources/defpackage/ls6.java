package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ls6  reason: default package */
/* loaded from: classes.dex */
public class ls6 extends gdd {
    public static final xy2 d = new xy2(2);
    public final bwa b = new bwa(0);
    public boolean c = false;

    @Override // defpackage.gdd
    public final void d() {
        bwa bwaVar = this.b;
        int i = bwaVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ks6 ks6Var = (ks6) bwaVar.e(i2);
            awd awdVar = ks6Var.l;
            awdVar.a();
            awdVar.c = true;
            ih1 ih1Var = ks6Var.n;
            if (ih1Var != null) {
                ks6Var.h(ih1Var);
            }
            ks6 ks6Var2 = awdVar.a;
            if (ks6Var2 != null) {
                if (ks6Var2 == ks6Var) {
                    awdVar.a = null;
                    if (ih1Var != null) {
                        boolean z = ih1Var.b;
                    }
                    awdVar.d = true;
                    awdVar.b = false;
                    awdVar.c = false;
                    awdVar.e = false;
                } else {
                    vs.m("Attempting to unregister the wrong listener");
                    return;
                }
            } else {
                vs.k("No listener register");
                return;
            }
        }
        int i3 = bwaVar.c;
        Object[] objArr = bwaVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        bwaVar.c = 0;
    }
}
