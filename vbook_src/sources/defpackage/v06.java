package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v06  reason: default package */
/* loaded from: classes.dex */
public final class v06 {
    public static final v06 a;
    public static final v06 b;
    public static final /* synthetic */ v06[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v06] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v06] */
    static {
        ?? r0 = new Enum("Min", 0);
        a = r0;
        ?? r1 = new Enum("Max", 1);
        b = r1;
        c = new v06[]{r0, r1};
    }

    public static v06 valueOf(String str) {
        return (v06) Enum.valueOf(v06.class, str);
    }

    public static v06[] values() {
        return (v06[]) c.clone();
    }
}
