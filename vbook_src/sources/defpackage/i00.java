package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i00  reason: default package */
/* loaded from: classes3.dex */
public final class i00 {
    public static final i00 a;
    public static final /* synthetic */ i00[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i00] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i00] */
    static {
        ?? r0 = new Enum("FIT", 0);
        a = r0;
        b = new i00[]{r0, new Enum("STRETCH", 1), new Enum("CROP", 2)};
    }

    public static i00 valueOf(String str) {
        return (i00) Enum.valueOf(i00.class, str);
    }

    public static i00[] values() {
        return (i00[]) b.clone();
    }
}
