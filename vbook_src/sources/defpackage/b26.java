package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b26  reason: default package */
/* loaded from: classes.dex */
public final class b26 {
    public static final b26 a;
    public static final b26 b;
    public static final /* synthetic */ b26[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b26] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b26] */
    static {
        ?? r0 = new Enum("Pressed", 0);
        a = r0;
        ?? r1 = new Enum("Idle", 1);
        b = r1;
        c = new b26[]{r0, r1};
    }

    public static b26 valueOf(String str) {
        return (b26) Enum.valueOf(b26.class, str);
    }

    public static b26[] values() {
        return (b26[]) c.clone();
    }
}
