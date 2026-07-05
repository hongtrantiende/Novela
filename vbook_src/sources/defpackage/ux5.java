package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ux5  reason: default package */
/* loaded from: classes3.dex */
public final class ux5 {
    public static final ux5 a;
    public static final ux5 b;
    public static final ux5 c;
    public static final ux5 d;
    public static final /* synthetic */ ux5[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [ux5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ux5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ux5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ux5, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Loading", 0);
        a = r0;
        ?? r1 = new Enum("Detail", 1);
        b = r1;
        ?? r2 = new Enum("Error", 2);
        c = r2;
        ?? r3 = new Enum("Installing", 3);
        d = r3;
        e = new ux5[]{r0, r1, r2, r3};
    }

    public static ux5 valueOf(String str) {
        return (ux5) Enum.valueOf(ux5.class, str);
    }

    public static ux5[] values() {
        return (ux5[]) e.clone();
    }
}
