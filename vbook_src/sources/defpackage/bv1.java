package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bv1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bv1 implements ou4 {
    public final /* synthetic */ int a;

    public /* synthetic */ bv1(int i) {
        this.a = i;
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean h;
        boolean h2;
        int i2;
        boolean h3;
        boolean h4;
        int i3 = this.a;
        boolean z = false;
        int i4 = Token.CASE;
        int i5 = 16;
        int i6 = 2;
        pvc pvcVar = pvc.a;
        switch (i3) {
            case 0:
                apb apbVar = (apb) obj;
                oob oobVar = (oob) obj2;
                vt4 vt4Var = (vt4) obj3;
                rv4 rv4Var = (rv4) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h2 = rv4Var.f(apbVar);
                    } else {
                        h2 = rv4Var.h(apbVar);
                    }
                    if (h2) {
                        i6 = 4;
                    }
                    i = intValue | i6;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    if ((intValue & 64) == 0) {
                        h = rv4Var.f(oobVar);
                    } else {
                        h = rv4Var.h(oobVar);
                    }
                    if (h) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((intValue & 384) == 0) {
                    if (rv4Var.h(vt4Var)) {
                        i4 = 256;
                    }
                    i |= i4;
                }
                if ((i & 1171) != 1170) {
                    z = true;
                }
                if (rv4Var.U(i & 1, z)) {
                    xx2.c(apbVar, oobVar, vt4Var, rv4Var, i & 1022);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                apb apbVar2 = (apb) obj;
                oob oobVar2 = (oob) obj2;
                vt4 vt4Var2 = (vt4) obj3;
                rv4 rv4Var2 = (rv4) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h4 = rv4Var2.f(apbVar2);
                    } else {
                        h4 = rv4Var2.h(apbVar2);
                    }
                    if (h4) {
                        i6 = 4;
                    }
                    i2 = intValue2 | i6;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if ((intValue2 & 64) == 0) {
                        h3 = rv4Var2.f(oobVar2);
                    } else {
                        h3 = rv4Var2.h(oobVar2);
                    }
                    if (h3) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((intValue2 & 384) == 0) {
                    if (rv4Var2.h(vt4Var2)) {
                        i4 = 256;
                    }
                    i2 |= i4;
                }
                if ((i2 & 1171) != 1170) {
                    z = true;
                }
                if (rv4Var2.U(i2 & 1, z)) {
                    xx2.c(apbVar2, oobVar2, vt4Var2, rv4Var2, i2 & 1022);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fxb fxbVar = (fxb) obj5;
                String obj6 = ((CharSequence) obj4).subSequence(fxb.g(fxbVar.a), fxb.f(fxbVar.a)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return pvcVar;
        }
    }
}
