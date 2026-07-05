package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x2c  reason: default package */
/* loaded from: classes.dex */
public final class x2c {
    public static final x2c a;
    public static final x2c b;
    public static final x2c c;
    public static final /* synthetic */ x2c[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x2c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x2c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x2c] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Cursor", 1);
        b = r1;
        ?? r2 = new Enum("Selection", 2);
        c = r2;
        d = new x2c[]{r0, r1, r2};
    }

    public static x2c valueOf(String str) {
        return (x2c) Enum.valueOf(x2c.class, str);
    }

    public static x2c[] values() {
        return (x2c[]) d.clone();
    }
}
