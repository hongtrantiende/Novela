package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s09  reason: default package */
/* loaded from: classes.dex */
public final class s09 {
    public static final s09 a;
    public static final s09 b;
    public static final s09 c;
    public static final /* synthetic */ s09[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s09] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, s09] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, s09] */
    static {
        ?? r0 = new Enum("Initial", 0);
        a = r0;
        ?? r1 = new Enum("Main", 1);
        b = r1;
        ?? r2 = new Enum("Final", 2);
        c = r2;
        d = new s09[]{r0, r1, r2};
    }

    public static s09 valueOf(String str) {
        return (s09) Enum.valueOf(s09.class, str);
    }

    public static s09[] values() {
        return (s09[]) d.clone();
    }
}
