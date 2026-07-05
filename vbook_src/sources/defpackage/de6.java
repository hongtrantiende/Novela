package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: de6  reason: default package */
/* loaded from: classes.dex */
public final class de6 {
    public static final de6 a;
    public static final /* synthetic */ de6[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, de6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, de6] */
    static {
        ?? r0 = new Enum("Horizontal", 0);
        a = r0;
        b = new de6[]{r0, new Enum("Vertical", 1)};
    }

    public static de6 valueOf(String str) {
        return (de6) Enum.valueOf(de6.class, str);
    }

    public static de6[] values() {
        return (de6[]) b.clone();
    }
}
