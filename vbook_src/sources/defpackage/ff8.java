package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ff8  reason: default package */
/* loaded from: classes3.dex */
public final class ff8 {
    public static final ff8 a;
    public static final ff8 b;
    public static final /* synthetic */ ff8[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ff8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ff8] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        a = r0;
        ?? r1 = new Enum("Horizontal", 1);
        b = r1;
        c = new ff8[]{r0, r1};
    }

    public static ff8 valueOf(String str) {
        return (ff8) Enum.valueOf(ff8.class, str);
    }

    public static ff8[] values() {
        return (ff8[]) c.clone();
    }
}
