package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x67  reason: default package */
/* loaded from: classes.dex */
public final class x67 {
    public static final x67 a;
    public static final x67 b;
    public static final x67 c;
    public static final /* synthetic */ x67[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x67] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x67] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x67] */
    static {
        ?? r0 = new Enum("NO", 0);
        a = r0;
        ?? r1 = new Enum("NOTICE", 1);
        b = r1;
        ?? r2 = new Enum("SILENT", 2);
        c = r2;
        d = new x67[]{r0, r1, r2};
    }

    public static x67 valueOf(String str) {
        return (x67) Enum.valueOf(x67.class, str);
    }

    public static x67[] values() {
        return (x67[]) d.clone();
    }
}
