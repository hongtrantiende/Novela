package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t18  reason: default package */
/* loaded from: classes.dex */
public final class t18 extends gh0 {
    public static final String c = r95.r("NetworkMeteredCtrlr");
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t18(b28 b28Var) {
        super(b28Var);
        b28Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.l02
    public final boolean c(ymd ymdVar) {
        ymdVar.getClass();
        if (ymdVar.j.a == c28.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gh0
    public final int d() {
        return this.b;
    }

    @Override // defpackage.gh0
    public final boolean e(Object obj) {
        z18 z18Var = (z18) obj;
        z18Var.getClass();
        boolean z = z18Var.e;
        boolean z2 = z18Var.a;
        if (Build.VERSION.SDK_INT < 26) {
            r95.n().c(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z2 && !z) {
                return false;
            }
            return true;
        } else if (z2 && z18Var.c && !z) {
            return false;
        } else {
            return true;
        }
    }
}
