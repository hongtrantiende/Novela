package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hw8  reason: default package */
/* loaded from: classes.dex */
public final class hw8 {
    public static final hw8 a;
    public static final hw8 b;
    public static final /* synthetic */ hw8[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hw8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hw8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hw8] */
    static {
        ?? r0 = new Enum("UNCHANGED", 0);
        a = r0;
        ?? r1 = new Enum("TRANSLUCENT", 1);
        ?? r2 = new Enum("OPAQUE", 2);
        b = r2;
        c = new hw8[]{r0, r1, r2};
    }

    public static hw8 valueOf(String str) {
        return (hw8) Enum.valueOf(hw8.class, str);
    }

    public static hw8[] values() {
        return (hw8[]) c.clone();
    }
}
