package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dn7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj8 b;

    public /* synthetic */ dn7(sj8 sj8Var, int i) {
        this.a = i;
        this.b = sj8Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean h;
        boolean h2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        int i2 = 2;
        sj8 sj8Var = this.b;
        List list = (List) obj;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                list.getClass();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h = rv4Var.f(list);
                    } else {
                        h = rv4Var.h(list);
                    }
                    if (h) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    d3a.a(sj8Var, list, null, rv4Var, (intValue << 3) & Token.ASSIGN_MOD);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                list.getClass();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h2 = rv4Var.f(list);
                    } else {
                        h2 = rv4Var.h(list);
                    }
                    if (h2) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    d3a.a(sj8Var, list, null, rv4Var, (intValue << 3) & Token.ASSIGN_MOD);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
