package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o6  reason: default package */
/* loaded from: classes.dex */
public final class o6 extends h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ voe d;

    public /* synthetic */ o6(zt1 zt1Var, String str, voe voeVar, int i) {
        this.a = i;
        this.b = zt1Var;
        this.c = str;
        this.d = voeVar;
    }

    @Override // defpackage.h6
    public final void a(Object obj) {
        int i = this.a;
        voe voeVar = this.d;
        String str = this.c;
        zt1 zt1Var = this.b;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = zt1Var.b;
                ArrayList arrayList = zt1Var.d;
                Object obj2 = linkedHashMap.get(str);
                b6 b6Var = (b6) voeVar;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        zt1Var.b(intValue, b6Var, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                }
                xk5.l("Attempting to launch an unregistered ActivityResultLauncher with contract ", b6Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                ArrayList arrayList2 = zt1Var.d;
                Object obj3 = zt1Var.b.get(str);
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str);
                    try {
                        zt1Var.b(intValue2, voeVar, obj);
                        return;
                    } catch (Exception e2) {
                        arrayList2.remove(str);
                        throw e2;
                    }
                }
                xk5.l("Attempting to launch an unregistered ActivityResultLauncher with contract ", voeVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }

    @Override // defpackage.h6
    public final void b() {
        int i = this.a;
        String str = this.c;
        zt1 zt1Var = this.b;
        switch (i) {
            case 0:
                zt1Var.e(str);
                return;
            default:
                zt1Var.e(str);
                return;
        }
    }
}
