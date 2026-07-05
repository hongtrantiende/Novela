package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z3a  reason: default package */
/* loaded from: classes3.dex */
public final class z3a implements u27 {
    public final wl6 a;
    public final d56 b;

    public z3a(wl6 wl6Var) {
        this.a = wl6Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i56 a = l46.a("object");
        a.getClass();
        k46 k46Var = (k46) linkedHashMap.put("type", a);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        az9 az9Var = new az9(21);
        e56 e56Var = new e56();
        az9Var.invoke(e56Var);
        k46 k46Var2 = (k46) linkedHashMap2.put("query", e56Var.a());
        az9 az9Var2 = new az9(22);
        e56 e56Var2 = new e56();
        az9Var2.invoke(e56Var2);
        k46 k46Var3 = (k46) linkedHashMap2.put("limit", e56Var2.a());
        k46 k46Var4 = (k46) linkedHashMap.put("properties", new d56(linkedHashMap2));
        az9 az9Var3 = new az9(20);
        u36 u36Var = new u36();
        az9Var3.invoke(u36Var);
        k46 k46Var5 = (k46) linkedHashMap.put("required", new t36(u36Var.a));
        this.b = new d56(linkedHashMap);
    }

    @Override // defpackage.u27
    public final d56 a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // defpackage.u27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.d56 r8, defpackage.n42 r9) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.b(d56, n42):java.lang.Object");
    }

    @Override // defpackage.u27
    public final String getDescription() {
        return "Search the user's local book library by keyword.";
    }

    @Override // defpackage.u27
    public final String getName() {
        return "searchBooks";
    }
}
