package defpackage;

import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hg8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hg8 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yu7 d;
    public final /* synthetic */ hrb e;
    public final /* synthetic */ wea f;

    public /* synthetic */ hg8(boolean z, boolean z2, yu7 yu7Var, hrb hrbVar, wea weaVar, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = yu7Var;
        this.e = hrbVar;
        this.f = weaVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    j55.F.b(this.b, this.c, this.d, null, this.e, this.f, nae.e, nae.e, rv4Var, 100663296, Context.VERSION_ES6);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    j55.F.b(this.b, this.c, this.d, null, this.e, this.f, nae.e, nae.e, rv4Var2, 100663296, Context.VERSION_ES6);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
