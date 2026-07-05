package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m9  reason: default package */
/* loaded from: classes3.dex */
public final class m9 {
    public static final /* synthetic */ qu3 C;
    public static final kh5 b;
    public static final m9 c;
    public static final m9 d;
    public static final m9 e;
    public static final /* synthetic */ m9[] f;
    public final String a;

    /* JADX WARN: Type inference failed for: r0v2, types: [kh5, java.lang.Object] */
    static {
        m9 m9Var = new m9("MALE", "male", 0);
        c = m9Var;
        m9 m9Var2 = new m9("FEMALE", "female", 1);
        d = m9Var2;
        m9 m9Var3 = new m9("MULTI", "multi", 2);
        e = m9Var3;
        m9[] m9VarArr = {m9Var, m9Var2, m9Var3};
        f = m9VarArr;
        C = new qu3(m9VarArr);
        b = new Object();
    }

    public m9(String str, String str2, int i) {
        this.a = str2;
    }

    public static m9 valueOf(String str) {
        return (m9) Enum.valueOf(m9.class, str);
    }

    public static m9[] values() {
        return (m9[]) f.clone();
    }
}
