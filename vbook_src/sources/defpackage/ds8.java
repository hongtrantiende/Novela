package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ds8  reason: default package */
/* loaded from: classes3.dex */
public final class ds8 {
    public static final ds8 a;
    public static final ds8 b;
    public static final ds8 c;
    public static final /* synthetic */ ds8[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ds8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ds8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ds8] */
    static {
        ?? r0 = new Enum("Toc", 0);
        a = r0;
        ?? r1 = new Enum("Page", 1);
        b = r1;
        ?? r2 = new Enum("Highlight", 2);
        c = r2;
        d = new ds8[]{r0, r1, r2};
    }

    public static ds8 valueOf(String str) {
        return (ds8) Enum.valueOf(ds8.class, str);
    }

    public static ds8[] values() {
        return (ds8[]) d.clone();
    }
}
