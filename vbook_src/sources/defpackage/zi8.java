package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zi8  reason: default package */
/* loaded from: classes.dex */
public final class zi8 {
    public static final zi8 a;
    public static final zi8 b;
    public static final /* synthetic */ zi8[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zi8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zi8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zi8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, zi8] */
    static {
        ?? r0 = new Enum("FitBoth", 0);
        a = r0;
        ?? r1 = new Enum("FitWidth", 1);
        b = r1;
        c = new zi8[]{r0, r1, new Enum("FitHeight", 2), new Enum("Smart", 3)};
    }

    public static zi8 valueOf(String str) {
        return (zi8) Enum.valueOf(zi8.class, str);
    }

    public static zi8[] values() {
        return (zi8[]) c.clone();
    }
}
