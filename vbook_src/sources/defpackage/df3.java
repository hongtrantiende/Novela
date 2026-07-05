package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: df3  reason: default package */
/* loaded from: classes.dex */
public final class df3 {
    public static final df3 a;
    public static final df3 b;
    public static final df3 c;
    public static final df3 d;
    public static final /* synthetic */ df3[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [df3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [df3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [df3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [df3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Up", 0);
        a = r0;
        ?? r1 = new Enum("Drag", 1);
        b = r1;
        ?? r2 = new Enum("Timeout", 2);
        c = r2;
        ?? r3 = new Enum("Cancel", 3);
        d = r3;
        e = new df3[]{r0, r1, r2, r3};
    }

    public static df3 valueOf(String str) {
        return (df3) Enum.valueOf(df3.class, str);
    }

    public static df3[] values() {
        return (df3[]) e.clone();
    }
}
