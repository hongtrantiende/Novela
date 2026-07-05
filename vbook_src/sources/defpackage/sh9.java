package defpackage;

import com.reader.android.MainActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sh9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sh9 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ sh9(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        MainActivity mainActivity = this.b;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    pye.a(h86.a.a(mainActivity.S), jce.E(1240883135, new sh9(mainActivity, 1), rv4Var), rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean h = rv4Var.h(mainActivity);
                    Object P = rv4Var.P();
                    if (h || P == ax1.a) {
                        P = new u76(mainActivity, 29);
                        rv4Var.o0(P);
                    }
                    am8.a((vt4) P, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
