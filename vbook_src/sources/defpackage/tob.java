package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tob  reason: default package */
/* loaded from: classes.dex */
public final class tob implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ tob(Drawable drawable, int i) {
        this.a = i;
        this.b = drawable;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Drawable drawable = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                long j = ((zl1) obj).a;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nc6.c.h(drawable, rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                long j2 = ((zl1) obj).a;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    nc6.c.h(drawable, rv4Var2, 48);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
