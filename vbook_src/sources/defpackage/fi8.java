package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fi8  reason: default package */
/* loaded from: classes3.dex */
public final class fi8 {
    public static final fi8 a;
    public static final fi8 b;
    public static final fi8 c;
    public static final /* synthetic */ fi8[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fi8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fi8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fi8] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Next", 1);
        b = r1;
        ?? r2 = new Enum("Prev", 2);
        c = r2;
        d = new fi8[]{r0, r1, r2};
    }

    public static fi8 valueOf(String str) {
        return (fi8) Enum.valueOf(fi8.class, str);
    }

    public static fi8[] values() {
        return (fi8[]) d.clone();
    }
}
