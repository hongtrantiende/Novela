package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gz9  reason: default package */
/* loaded from: classes3.dex */
public final class gz9 {
    public static final gz9 a;
    public static final gz9 b;
    public static final gz9 c;
    public static final gz9 d;
    public static final gz9 e;
    public static final /* synthetic */ gz9[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gz9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gz9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gz9] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, gz9] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, gz9] */
    static {
        ?? r0 = new Enum("TopBar", 0);
        a = r0;
        ?? r1 = new Enum("MainContent", 1);
        b = r1;
        ?? r2 = new Enum("Snackbar", 2);
        c = r2;
        ?? r3 = new Enum("Fab", 3);
        d = r3;
        ?? r4 = new Enum("BottomBar", 4);
        e = r4;
        f = new gz9[]{r0, r1, r2, r3, r4};
    }

    public static gz9 valueOf(String str) {
        return (gz9) Enum.valueOf(gz9.class, str);
    }

    public static gz9[] values() {
        return (gz9[]) f.clone();
    }
}
