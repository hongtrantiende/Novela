package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t27  reason: default package */
/* loaded from: classes3.dex */
public final class t27 {
    public final ArrayList a;

    public t27(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static final d56 a(t27 t27Var, k46 k46Var, int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i56 a = l46.a("2.0");
        a.getClass();
        k46 k46Var2 = (k46) linkedHashMap.put("jsonrpc", a);
        k46Var.getClass();
        k46 k46Var3 = (k46) linkedHashMap.put("id", k46Var);
        bl blVar = new bl(i, str, 3);
        e56 e56Var = new e56();
        blVar.invoke(e56Var);
        k46 k46Var4 = (k46) linkedHashMap.put("error", e56Var.a());
        return new d56(linkedHashMap);
    }

    public static final d56 b(t27 t27Var, k46 k46Var, k46 k46Var2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i56 a = l46.a("2.0");
        a.getClass();
        k46 k46Var3 = (k46) linkedHashMap.put("jsonrpc", a);
        k46Var.getClass();
        k46 k46Var4 = (k46) linkedHashMap.put("id", k46Var);
        k46Var2.getClass();
        k46 k46Var5 = (k46) linkedHashMap.put("result", k46Var2);
        return new d56(linkedHashMap);
    }
}
