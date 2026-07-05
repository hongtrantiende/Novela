package defpackage;

import android.content.Context;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cib  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cib implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ float c;
    public final /* synthetic */ nm1 d;

    public /* synthetic */ cib(Context context, float f, nm1 nm1Var, int i) {
        this.a = i;
        this.b = context;
        this.c = f;
        this.d = nm1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        nm1 nm1Var = this.d;
        float f = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    xwe.b(new il(R.drawable.ic_skip_next), context.getString(R.string.widget_next), s9e.w(f), 0, new dm1(new mac(nm1Var)), rv4Var, 32768, 8);
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
                    xwe.b(new il(R.drawable.ic_skip_previous), context.getString(R.string.widget_previous), s9e.w(f), 0, new dm1(new mac(nm1Var)), rv4Var2, 32768, 8);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
