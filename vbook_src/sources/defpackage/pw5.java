package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw5  reason: default package */
/* loaded from: classes.dex */
public final class pw5 {
    public static final pw5 a;
    public static final pw5 b;
    public static final pw5 c;
    public static final /* synthetic */ pw5[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pw5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pw5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pw5] */
    static {
        ?? r0 = new Enum("Focused", 0);
        a = r0;
        ?? r1 = new Enum("UnfocusedEmpty", 1);
        b = r1;
        ?? r2 = new Enum("UnfocusedNotEmpty", 2);
        c = r2;
        d = new pw5[]{r0, r1, r2};
    }

    public static pw5 valueOf(String str) {
        return (pw5) Enum.valueOf(pw5.class, str);
    }

    public static pw5[] values() {
        return (pw5[]) d.clone();
    }
}
