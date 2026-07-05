package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l35  reason: default package */
/* loaded from: classes.dex */
public final class l35 {
    public static final l35 a;
    public static final l35 b;
    public static final l35 c;
    public static final /* synthetic */ l35[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l35] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l35] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l35] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Selection", 1);
        b = r1;
        ?? r2 = new Enum("Cursor", 2);
        c = r2;
        d = new l35[]{r0, r1, r2};
    }

    public static l35 valueOf(String str) {
        return (l35) Enum.valueOf(l35.class, str);
    }

    public static l35[] values() {
        return (l35[]) d.clone();
    }
}
