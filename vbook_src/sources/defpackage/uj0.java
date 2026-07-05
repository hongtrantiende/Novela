package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uj0  reason: default package */
/* loaded from: classes.dex */
public final class uj0 extends gh0 {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(m02 m02Var, int i) {
        super(m02Var);
        this.b = i;
        m02Var.getClass();
        switch (i) {
            case 4:
                super(m02Var);
                this.c = 9;
                return;
            default:
                this.c = 6;
                return;
        }
    }

    @Override // defpackage.l02
    public final boolean c(ymd ymdVar) {
        int i = this.b;
        ymdVar.getClass();
        switch (i) {
            case 0:
                return ymdVar.j.c;
            case 1:
                return ymdVar.j.e;
            case 2:
                if (ymdVar.j.a != c28.b) {
                    return false;
                }
                return true;
            case 3:
                if (ymdVar.j.a != c28.c) {
                    return false;
                }
                return true;
            default:
                return ymdVar.j.f;
        }
    }

    @Override // defpackage.gh0
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            case 3:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.gh0
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                z18 z18Var = (z18) obj;
                z18Var.getClass();
                if (!z18Var.e && z18Var.a && (Build.VERSION.SDK_INT < 26 || z18Var.b)) {
                    return false;
                }
                return true;
            case 3:
                z18 z18Var2 = (z18) obj;
                z18Var2.getClass();
                if (z18Var2.a && !z18Var2.c && !z18Var2.e) {
                    return false;
                }
                return true;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(vj0 vj0Var) {
        super(vj0Var);
        this.b = 1;
        vj0Var.getClass();
        this.c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(b28 b28Var, int i) {
        super(b28Var);
        this.b = i;
        b28Var.getClass();
        switch (i) {
            case 3:
                super(b28Var);
                this.c = 7;
                return;
            default:
                this.c = 7;
                return;
        }
    }
}
