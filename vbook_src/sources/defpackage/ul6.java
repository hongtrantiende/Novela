package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ul6  reason: default package */
/* loaded from: classes3.dex */
public final class ul6 {
    public static final ul6 a;
    public static final ul6 b;
    public static final ul6 c;
    public static final ul6 d;
    public static final ul6 e;
    public static final /* synthetic */ ul6[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ul6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ul6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ul6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ul6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ul6] */
    static {
        ?? r0 = new Enum("DEBUG", 0);
        a = r0;
        ?? r1 = new Enum("INFO", 1);
        b = r1;
        ?? r2 = new Enum("WARNING", 2);
        c = r2;
        ?? r3 = new Enum("ERROR", 3);
        d = r3;
        ?? r4 = new Enum("NONE", 4);
        e = r4;
        f = new ul6[]{r0, r1, r2, r3, r4};
    }

    public static ul6 valueOf(String str) {
        return (ul6) Enum.valueOf(ul6.class, str);
    }

    public static ul6[] values() {
        return (ul6[]) f.clone();
    }
}
