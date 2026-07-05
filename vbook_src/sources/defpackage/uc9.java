package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc9 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ LinkedHashMap c;
    public final /* synthetic */ be9 d;

    public /* synthetic */ uc9(Map map, LinkedHashMap linkedHashMap, be9 be9Var, int i) {
        this.a = i;
        this.b = map;
        this.c = linkedHashMap;
        this.d = be9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String B;
        long b;
        String B2;
        long b2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        be9 be9Var = this.d;
        LinkedHashMap linkedHashMap = this.c;
        Map map = this.b;
        switch (i) {
            case 0:
                ((vjc) obj).getClass();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    cp2 cp2Var = (cp2) linkedHashMap.get(str);
                    gk2 gk2Var = be9Var.a.Q;
                    if (cp2Var == null || (B = cp2Var.a) == null) {
                        B = ube.B();
                    }
                    if (cp2Var != null) {
                        b = cp2Var.g;
                    } else {
                        b = by5.a.k().b();
                    }
                    gk2Var.E0(new cp2(B, "general", str, str2, 1, 0, b, by5.a.k().b()));
                }
                return pvcVar;
            default:
                ((vjc) obj).getClass();
                for (Map.Entry entry2 : map.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    String str4 = (String) entry2.getValue();
                    cp2 cp2Var2 = (cp2) linkedHashMap.get(str3);
                    gk2 gk2Var2 = be9Var.a.Q;
                    if (cp2Var2 == null || (B2 = cp2Var2.a) == null) {
                        B2 = ube.B();
                    }
                    if (cp2Var2 != null) {
                        b2 = cp2Var2.g;
                    } else {
                        b2 = by5.a.k().b();
                    }
                    gk2Var2.E0(new cp2(B2, "general", str3, str4, 0, 0, b2, by5.a.k().b()));
                }
                return pvcVar;
        }
    }
}
