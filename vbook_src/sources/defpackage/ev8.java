package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ev8  reason: default package */
/* loaded from: classes3.dex */
public final class ev8 {
    public static final ev8 a;
    public static final ev8 b;
    public static final ev8 c;
    public static final /* synthetic */ ev8[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ev8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ev8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ev8] */
    static {
        ?? r0 = new Enum("PrimaryLaunched", 0);
        a = r0;
        ?? r1 = new Enum("FallbackLaunched", 1);
        b = r1;
        ?? r2 = new Enum("Cancelled", 2);
        c = r2;
        d = new ev8[]{r0, r1, r2};
    }

    public static ev8 valueOf(String str) {
        return (ev8) Enum.valueOf(ev8.class, str);
    }

    public static ev8[] values() {
        return (ev8[]) d.clone();
    }
}
