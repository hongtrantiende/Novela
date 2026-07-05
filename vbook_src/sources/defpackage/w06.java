package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w06  reason: default package */
/* loaded from: classes.dex */
public final class w06 {
    public static final w06 a;
    public static final w06 b;
    public static final /* synthetic */ w06[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w06] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w06] */
    static {
        ?? r0 = new Enum("Min", 0);
        a = r0;
        ?? r1 = new Enum("Max", 1);
        b = r1;
        c = new w06[]{r0, r1};
    }

    public static w06 valueOf(String str) {
        return (w06) Enum.valueOf(w06.class, str);
    }

    public static w06[] values() {
        return (w06[]) c.clone();
    }
}
