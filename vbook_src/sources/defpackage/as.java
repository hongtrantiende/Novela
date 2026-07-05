package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: as  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ as(ar4 ar4Var, boolean z, uo3 uo3Var) {
        this.a = 4;
        this.c = ar4Var;
        this.b = z;
        this.d = uo3Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        ArrayList o0;
        hn0 cn0Var;
        int i = this.a;
        boolean z = true;
        pvc pvcVar = pvc.a;
        Object obj = this.d;
        boolean z2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                dm8 dm8Var = (dm8) obj2;
                dm8 dm8Var2 = (dm8) obj;
                if (!z2) {
                    dm8Var.i(nae.e);
                    dm8Var2.i(nae.e);
                }
                return pvcVar;
            case 1:
                String str = ((r81) obj2).a;
                aw7 aw7Var = (aw7) obj;
                if (z2) {
                    o0 = sl1.l0((List) aw7Var.getValue(), str);
                } else {
                    o0 = sl1.o0((List) aw7Var.getValue(), str);
                }
                aw7Var.setValue(o0);
                return pvcVar;
            case 2:
                vt4 vt4Var = (vt4) obj2;
                aw7 aw7Var2 = (aw7) obj;
                if (z2) {
                    aw7Var2.setValue(true);
                } else {
                    vt4Var.invoke();
                }
                return pvcVar;
            case 3:
                aw7 aw7Var3 = (aw7) obj;
                if (!((Boolean) ((yya) obj2).getValue()).booleanValue() && !((Boolean) aw7Var3.getValue()).booleanValue() && !z2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                uo3 uo3Var = (uo3) obj;
                String str2 = ((ar4) obj2).c;
                if (str2 != null) {
                    if (z2) {
                        cn0Var = en0.a;
                    } else {
                        cn0Var = new cn0(3);
                    }
                    uo3Var.d(new v62(str2, cn0Var));
                }
                return pvcVar;
        }
    }

    public /* synthetic */ as(boolean z, Object obj, aw7 aw7Var, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = aw7Var;
    }
}
