package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v13  reason: default package */
/* loaded from: classes3.dex */
public final class v13 implements of9 {
    public static final v13 C;
    public static final v13 D;
    public static final /* synthetic */ v13[] E;
    public static final /* synthetic */ qu3 F;
    public static final tn3 b;
    public static final v13 c;
    public static final v13 d;
    public static final v13 e;
    public static final v13 f;
    public final int a;

    static {
        v13 v13Var = new v13("LDPI", 0, 120);
        c = v13Var;
        v13 v13Var2 = new v13("MDPI", 1, 160);
        d = v13Var2;
        v13 v13Var3 = new v13("HDPI", 2, 240);
        e = v13Var3;
        v13 v13Var4 = new v13("XHDPI", 3, 320);
        f = v13Var4;
        v13 v13Var5 = new v13("XXHDPI", 4, 480);
        C = v13Var5;
        v13 v13Var6 = new v13("XXXHDPI", 5, 640);
        D = v13Var6;
        v13[] v13VarArr = {v13Var, v13Var2, v13Var3, v13Var4, v13Var5, v13Var6};
        E = v13VarArr;
        F = new qu3(v13VarArr);
        b = new tn3(23);
    }

    public v13(String str, int i, int i2) {
        this.a = i2;
    }

    public static v13 valueOf(String str) {
        return (v13) Enum.valueOf(v13.class, str);
    }

    public static v13[] values() {
        return (v13[]) E.clone();
    }
}
