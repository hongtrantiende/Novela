package defpackage;

import java.util.LinkedHashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ck1  reason: default package */
/* loaded from: classes3.dex */
public final class ck1 {
    public static final r0f b;
    public static final LinkedHashMap c;
    public static final ck1 d;
    public static final ck1 e;
    public static final /* synthetic */ ck1[] f;
    public final short a;

    static {
        ck1 ck1Var = new ck1("NORMAL", 0, (short) 1000);
        ck1 ck1Var2 = new ck1("GOING_AWAY", 1, (short) 1001);
        ck1 ck1Var3 = new ck1("PROTOCOL_ERROR", 2, (short) 1002);
        ck1 ck1Var4 = new ck1("CANNOT_ACCEPT", 3, (short) 1003);
        ck1 ck1Var5 = new ck1("CLOSED_ABNORMALLY", 4, (short) 1006);
        d = ck1Var5;
        ck1 ck1Var6 = new ck1("NOT_CONSISTENT", 5, (short) 1007);
        ck1 ck1Var7 = new ck1("VIOLATED_POLICY", 6, (short) 1008);
        ck1 ck1Var8 = new ck1("TOO_BIG", 7, (short) 1009);
        ck1 ck1Var9 = new ck1("NO_EXTENSION", 8, (short) 1010);
        ck1 ck1Var10 = new ck1("INTERNAL_ERROR", 9, (short) 1011);
        e = ck1Var10;
        ck1[] ck1VarArr = {ck1Var, ck1Var2, ck1Var3, ck1Var4, ck1Var5, ck1Var6, ck1Var7, ck1Var8, ck1Var9, ck1Var10, new ck1("SERVICE_RESTART", 10, (short) 1012), new ck1("TRY_AGAIN_LATER", 11, (short) 1013)};
        f = ck1VarArr;
        qu3 qu3Var = new qu3(ck1VarArr);
        b = new r0f(18);
        int k = p17.k(tl1.s(qu3Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(k < 16 ? 16 : k);
        b2 b2Var = new b2(qu3Var, 0);
        while (b2Var.hasNext()) {
            Object next = b2Var.next();
            linkedHashMap.put(Short.valueOf(((ck1) next).a), next);
        }
        c = linkedHashMap;
    }

    public ck1(String str, int i, short s) {
        this.a = s;
    }

    public static ck1 valueOf(String str) {
        return (ck1) Enum.valueOf(ck1.class, str);
    }

    public static ck1[] values() {
        return (ck1[]) f.clone();
    }
}
